//  4 WAP to count the number of consonants, vowels, special characters in a String3
import java.util.Scanner;

public class Count_Consonants_Vowels_Special_Characters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String  ");
        String str = s.nextLine();
        int vowels = 0;
        int consonants = 0;
        int specialCharacters = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowels++;
            }else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                consonants++;
            }else if(ch >= 33 && ch <= 47){
                specialCharacters++;
            }
        }
        System.out.println("Total vowels is " + vowels);
        System.out.println("Total consonants is " + consonants);
        System.out.println("Total specialCharacters is " + specialCharacters);
    }
}
