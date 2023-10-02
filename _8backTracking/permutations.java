package _8backTracking;

public class permutations {
    public static void main(String[] args) {
        String str = "abc";
        findPremutation(str, "");
    }
    public static void findPremutation(String str,String ans){
        if(str.length() == 0 ){
            System.out.println(ans);
            return;
        }

        for(int i= 0; i <str.length();i++){
            char curr = str.charAt(i);
             String nstr = str.substring(0, i) + str.substring(i+1);
            findPremutation(nstr, ans+curr);
        } 
    }
}
