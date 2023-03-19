//  3. WAP to check if “2552” is palindrome or not3

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String ");
        String str = s.nextLine();
        String emp = "";
        for(int i = str.length()-1; i >= 0; i--){
            emp += str.charAt(i);
        }
        if(str.equals(emp)){
            System.out.println("Given String is Palindrome");
        }else{
            System.out.println(" not Palindrome");
        }
    }
}
