import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(), rev = "";
        
        for (int i = str.length() - 1; i >= 0; i--) 
            rev += str.charAt(i);

        System.out.println(str.equals(rev) ? "Palindrome" : "Not a Palindrome");
    
    }
}
