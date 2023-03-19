//  7.  WAP to find if String contains all unique characters3

import java.util.Scanner;

public class Contains_Unique_Characters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String ");
        String str = s.nextLine();


        for(int i = 0; i < str.length(); i++ ){
            int flag = 0;
            for(int j = 0; j < str.length(); j++ ){
                if(str.charAt(i) == str.charAt(j) && i != j){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
