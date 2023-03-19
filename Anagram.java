//  5. WAP to implement Anagram Checking least inbuilt methods being used3

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your First String  ");
        String str1 = s.nextLine();
        System.out.print("Enter your Second String  ");
        String str2 = s.nextLine();
        String str3 = "";
        String str4 = "";
        char arr1[] = new char[100];
        char arr2[] = new char[100];

        for(int i = 0; i<str1.length(); i++){
            if(str1.charAt(i) != ' '){
                str3 += str1.charAt(i);
            }
            str3 = str3.toLowerCase();
            arr1= str3.toCharArray();
        }
        for(int i = 0; i<str2.length(); i++){
            if(str2.charAt(i) != ' '){
                str4 += str2.charAt(i);
            }
            str4 = str4.toLowerCase();
            arr2 = str4.toCharArray();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Its Anagram");
        }else{
            System.out.println("Its not Anagram");
        }
    }
}
