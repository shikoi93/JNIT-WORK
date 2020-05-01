public class WhileLoop {

    public static void main(String[] args) {

        int n, i;
        n = 2; 
        i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", n, i, n * i);
            i++;
        }
    }
}