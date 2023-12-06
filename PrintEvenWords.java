package StringsNew;
import java.util.Scanner;

public class PrintEvenWords {

	public static void PrintEven(String str) {
		for (String word : str.split(" ")) {
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}
		}

	}

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String : ");
    String str = sc.nextLine();
		
    PrintEven(str);

	}

}
