import java.util.Scanner;

public class DominoPiling {

	public static void main(String[] args) {
		
		int DOMINO = 2;
		
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int mIncluds = m/DOMINO;
        int first = n * mIncluds;
        
        if(m%2 == 0) {
        	System.out.println(first);
        }else {
        	System.out.println(n/DOMINO + first);
        }
        
        sc.close();

	}

}
