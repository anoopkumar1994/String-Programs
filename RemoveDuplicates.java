//  1. WAP(Write a Program) to remove Duplicates from a String.(Take any String example with duplicates
//character<

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String  ");
        String str = s.next();
        str = str.replace(" ", "");
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ')
                result += str.charAt(i);
                str = str.replace(str.charAt(i), ' ');
        }
        System.out.println(result);
    }
}
