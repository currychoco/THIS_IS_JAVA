import java.util.Scanner;

public class For2D03 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("정수 입력: ");
      
      int n = sc.nextInt();
      int count = 0, sum = 0;
      
      /*
      for(int i = 2; i <= num; i++) {
         n = 0;
         for(int j = 2 ; j <= i; j++) {
            if(i%j==0) {
               ++n;
            }
         }
         if(n==1) {
            sum += i;
            ++count;
            System.out.print(i + " ");
         }
      }
      
      System.out.println("\n소수의 합은 " + sum + "\n소수의 개수는 " + count);
      */
      
      for(int i =2; i<=n; i++) {
    	  for(int j = 2; j <= i; j++) {
    		  if(i == j) {
    			  System.out.print(i + " ");
    			  sum += i;
    			  ++count;
    		  }
    		  if(i % j == 0) {
    			  break;
    		  }
    	  }
      }
      System.out.printf("\n2부터 %d까지의 소수의 합계: %d\n", n, sum);
      System.out.printf("2부터 %d까지의 소수의 개수: %d\n", n, count);
      
      sc.close();
   }

}