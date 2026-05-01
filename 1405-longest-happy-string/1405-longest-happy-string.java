class Solution {
    public String longestDiverseString(int a, int b, int c) {
      int count_a=0;
      int count_b=0;
      int count_c=0;

        StringBuilder res= new StringBuilder();

        while(true){
            if(a>0 && ((a>=b && a>=c && count_a<2)||
            (a<=b && a>=c && count_b==2)||
            (a<=c && a>=b && count_c==2))){

                res.append('a');
                count_a=count_a+1;
                count_b=0;
                count_c=0;

                a=a-1;

            }
            else if(b>0 &&((b>=a && b>=c && count_b<2)||
            (b<=a && b>=c && count_a==2)||
            (b<=c && b>=a && count_c==2))){

                res.append('b');
                 count_b=count_b+1;
                count_a=0;
                count_c=0;

                b=b-1;

            }
            else if(c>0 &&((c>=a && c>=b && count_c<2)||
            (c<=a && c>=b && count_a==2)||
            (c<=b && c>=a && count_b==2))){

                res.append('c');
                count_c=count_c+1;
                count_a=0;
                count_b=0;

                c=c-1;

            }
            else{
                break;
            }

        }

        return res.toString();


        }
}