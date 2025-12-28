class Solution {
    // public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
    //   long ans=Long.MAX_VALUE;
    //   int maxBoth=Math.max(need1,need2);
    //   for(int i=0;i<=maxBoth;i++){
    //     int rem1=Math.max(0,need1-i);
    //     int rem2=Math.max(0,need2-i);

    //     long cost=(long)costBoth*i +(long)rem1*cost1 +(long)rem2*cost2;
    //     ans=Math.min(cost,ans);
    //   }


    //     return ans;
    // }
//   public long minimumCost(int cost1, int cost2, int costBoth,
//                         int need1, int need2) {

//     // Case 1: type-3 is useless
//     if (costBoth >= cost1 + cost2) {
//         return (long) need1 * cost1 + (long) need2 * cost2;
//     }

//     // Case 2: type-3 cheaper than both singles
//     if (costBoth < Math.min(cost1, cost2)) {
//         return (long) Math.max(need1, need2) * costBoth;
//     }

//     // Case 3: type-3 only useful to cover both together
//     int both = Math.min(need1, need2);
//     return (long) both * costBoth
//          + (long) (need1 - both) * cost1
//          + (long) (need2 - both) * cost2;
public long minimumCost(int cost1, int cost2, int costBoth,
                        int need1, int need2) {

    long ans = Long.MAX_VALUE;

    int[] candidates = {
        0,
        Math.min(need1, need2),
        Math.max(need1, need2)
    };

    for (int x : candidates) {
        long cost = (long) x * costBoth
                  + (long) Math.max(0, need1 - x) * cost1
                  + (long) Math.max(0, need2 - x) * cost2;
        ans = Math.min(ans, cost);
    }
    return ans;
}
}