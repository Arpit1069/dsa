package _9String;

public class palindrome {
    public static void main(String[] args) {
        String str= "noonon";
        System.out.println(checkpalindrome(str));
    }
    public static boolean checkpalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    
}
