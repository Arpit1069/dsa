package _9String;

public class Stringcompression {
    public static void main(String[] args) {
        String str = "aaabbcccdddd";
        String nstr = "";
         
       for(int i = 0;i<str.length();i++){
         Integer count =1;
         while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
         }
         nstr += str.charAt(i);
         if(count>1){
            nstr += count.toString();
         }

       }
        System.out.println(nstr);
    }
}
