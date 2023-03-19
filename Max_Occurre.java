// 8.  WAP to find the maximum occurring character in a String
import java.util.Scanner;

public class Max_Occurre{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String ");
        String str = s.nextLine();
        int arr[] = new int[255];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)] = arr[str.charAt(i)]+1;
        }

        int max = -1;
        char ch = ' ';
        for(int i = 0; i<str.length(); i++){
            if(arr[str.charAt(i)] > max){
                max = arr[str.charAt(i)];
                ch = str.charAt(i);
            }
        }
        System.out.println("character " + ch + " " + "max occurrence " + max);
    }
}
