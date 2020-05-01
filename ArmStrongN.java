public class ArmStrongN {
	public static void main(String[] args) {
        int n;
        n = 370;
        int N;
        int a;
        int total;
        total=0;
	int t;
	N = n;
      while(N !=0) {
          t = N % 10;
          total = total + t * t * t;
          N /= 10;
     }
    if(total == n)
         System.out.println("This is a Arm Strong Number");
     else 
         System.out.println("This is not a Arm Strong number"); 

}
}
        