import java.util.Scanner;

public class For2D03 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("���� �Է�: ");
      
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
      
      System.out.println("\n�Ҽ��� ���� " + sum + "\n�Ҽ��� ������ " + count);
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
      System.out.printf("\n2���� %d������ �Ҽ��� �հ�: %d\n", n, sum);
      System.out.printf("2���� %d������ �Ҽ��� ����: %d\n", n, count);
      
      sc.close();
   }

}