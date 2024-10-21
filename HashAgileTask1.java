import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a String : ");
	    String string = sc.nextLine();
	    System.out.print("Enter the k value: ");
		int k = sc.nextInt();
		if (string.length() == 0 || string == null) {
		    System.out.println("Invalid String format");
		    return;
		}
		k = k % string.length();
		if (k == string.length()) {
		    System.out.println("String after rotation : " + string);
		    return;
		}
		StringBuilder sk = new StringBuilder(string);
		for (int i = 0; i < k; i++) {
		    char ch = sk.charAt(0);
		    sk.deleteCharAt(0);
		    sk.append(ch);
		}
		System.out.println("String after rotating : " + sk);
	}
}