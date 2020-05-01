import java.util.Scanner;
public class WhileLoop {

    public static void main(String[] args) {
     Scanner S = new Scanner(System.in);
      System.out.print("Enter the number to find the multiplication table: ");
      int K = S.nextInt();
      System.out.println("Multiplication of "+ K + " is :");
        
 
        int N;
        int i = 1;
        while(i <=10){
            N = K * i; 
        
        System.out.println(K + " * " + i + " = " + N);
            i++;
        }
    }
}