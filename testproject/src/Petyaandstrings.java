import java.util.Scanner;

public class Petyaandstrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next().toUpperCase();
		String second = sc.next().toUpperCase();
		String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		ALPHABET = ALPHABET.toUpperCase();
		
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();
		char[] alphabetArray = ALPHABET.toCharArray();
		
		int i =0;
		int k =0;
		
		if(first.equals(second) ) {
			System.out.println(0);
		}
		
		for(int position = 0; position < firstArray.length; position++) {
			if(firstArray[position] != secondArray[position]) {
				while(alphabetArray[i] != firstArray[position]) {
					i++;
				}
				while(alphabetArray[k] != secondArray[position]) {
					k++;
				}
				if(i>k) {
					System.out.println(1);
				}else {
					System.out.println(-1);
				}
				break;
			}
		}
		
		sc.close();
		

	}

}
