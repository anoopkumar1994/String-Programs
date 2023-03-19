// 2.  WAP to print Duplicates characters from the String

import java.util.Scanner;

public class PrintDuplicatesString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        str = str.replace(" ", "");
        String printDupli = "";

        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    printDupli += str.charAt(i);
                }
            }
        }
        System.out.println(printDupli);
    }
}
