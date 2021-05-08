import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        int data = Integer.parseInt(userInput);
        
        try{
            if (((data % 2) == 0) && data != 2) {
                System.out.println("YES");
            }else{
                System.out.println("NO");   
            }
        }catch(Exception e){
            System.out.println("Error");   
        }
        sc.close();

	}

}
