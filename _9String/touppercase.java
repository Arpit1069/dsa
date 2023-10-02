package _9String;

public class touppercase {
    public static void main(String[] args) {
        String str = "hello WORLD";
        StringBuilder sb =new StringBuilder("") ;
        int i=0;
        while(i<str.length()){
            if(i == 0 || str.charAt(i-1)==' '){
                char ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else{
                 char ch = Character.toLowerCase(str.charAt(i));
                 sb.append(ch);
            }
            i++;
        }
        System.out.println(sb);
    }
}
