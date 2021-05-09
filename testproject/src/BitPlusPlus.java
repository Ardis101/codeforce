import java.util.Scanner;

public class BitPlusPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int testCases=sc.nextInt();
        int x = 0;
        
        for (int i=0; i<(testCases+1); i++){
            String n=sc.nextLine();
            
            if (n.equals("X++")) {
            	x++;
            }else if(n.equals("--X")) {
            	x--;
            }else if(n.equals("++X")){
            	x++;
            }else if(n.equals("X--")) {
            	x--;
            }
            	
        }
        System.out.println(x);
         sc.close();   
	}

}
