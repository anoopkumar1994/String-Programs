public class NewReverseString {
    public static void main(String[] args) {
        String str = "pwskill java";
        String arrStr[] = str.split(" ");
        String result = "";
        for(int i = arrStr.length-1; i>=0; i--){
            result += arrStr[i] + " ";
        }
        String str1 = "";
       for(int j = result.length()-1; j >= 0; j--){
           str += result.charAt(j);
       }
        System.out.println(str);
    }
}
