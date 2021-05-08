import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases=sc.nextInt();
        int k = 0;
        for (int i=0; i<(testCases+1); i++){
            String n=sc.nextLine();
            
            if (n.equals("1 1 0")) {
            	k++;
            }else if(n.equals("1 1 1")) {
            	k++;
            }else if(n.equals("0 1 1")) {
            	k++;
            }else if(n.equals("1 0 1")) {
            	k++;
            }
        }
        System.out.println(k);
        sc.close();

	}

}
