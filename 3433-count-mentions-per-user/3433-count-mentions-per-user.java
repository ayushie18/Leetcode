class Solution {

    private static class Event {
        long time;
        int type;           // 0 = ONLINE, 1 = OFFLINE, 2 = MESSAGE
        int user;           // for ONLINE / OFFLINE
        String mentions;    // for MESSAGE

        Event(long time, int type, int user, String mentions) {
            this.time = time;
            this.type = type;
            this.user = user;
            this.mentions = mentions;
        }
    }

    public int[] countMentions(int numberOfUsers, List<List<String>> events) {

        List<Event> list = new ArrayList<>();

        for (List<String> e : events) {
            String kind = e.get(0);

            if (kind.equals("MESSAGE")) {
                long t = Long.parseLong(e.get(1));
                String mentions = e.get(2);

                list.add(new Event(t, 2, -1, mentions));
            } 
            else { // OFFLINE
                long t = Long.parseLong(e.get(1));
                int id = Integer.parseInt(e.get(2));

                // user goes offline at t
                list.add(new Event(t, 1, id, null));
                // user goes online at t+60
                list.add(new Event(t + 60L, 0, id, null));
            }
        }

        // Sort events:
        // by time → ONLINE → OFFLINE → MESSAGE
        list.sort((a, b) -> {
            if (a.time != b.time) return Long.compare(a.time, b.time);
            return Integer.compare(a.type, b.type);
        });

        boolean[] online = new boolean[numberOfUsers];
        Arrays.fill(online, true);

        int[] mention = new int[numberOfUsers];

        for (Event ev : list) {

            if (ev.type == 0) { 
                online[ev.user] = true;      // ONLINE
            } 
            else if (ev.type == 1) {
                online[ev.user] = false;     // OFFLINE
            }
            else {
                // MESSAGE
                String token = ev.mentions;

                if (token.equals("ALL")) {
                    for (int i = 0; i < numberOfUsers; i++) mention[i]++;
                }
                else if (token.equals("HERE")) {
                    for (int i = 0; i < numberOfUsers; i++) {
                        if (online[i]) mention[i]++;
                    }
                }
                else {
                    // "id1 id5 id3 id3 ..."
                    String[] ids = token.split(" ");

                    for (String s : ids) {
                        if (s.startsWith("id")) {
                            int id = Integer.parseInt(s.substring(2));
                            mention[id]++;     // count duplicates also
                        }
                    }
                }
            }
        }

        return mention;
    }
}
