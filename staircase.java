public class staircase{
     public static void main(String []args){
         int n = 6;
         int count = 1;
         int i = 0;
         int j = 0;

         while(count <= n) {
           j = n - count;
           i = n - j;

            while(j != 0) {
                 System.out.print(" ");
                 j--;
             }
             while(i != 0) {
                 System.out.print("#");
                 i--;
             }
             System.out.println();
             count++;
         }
     }
}
