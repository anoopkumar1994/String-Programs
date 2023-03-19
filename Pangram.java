//  6.  WAP to implement Pangram Checking with least inbuilt methods being used

import java.util.Scanner;


public class Pangram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your long String  ");
        String s1 = s.nextLine();

        boolean flag=false;
        s1 = s1.toUpperCase();
        s1=s1.replace(" ", "");

        char[] ch=s1.toCharArray();

        int[] ar=new int[26];

        for(int i=0;i<ch.length;i++)
        {
            int index=ch[i]-65;
            ar[index]++;
        }
        for(int i=0; i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                System.out.println("It's not pangram");
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("It's pangram");
        }

    }
}
