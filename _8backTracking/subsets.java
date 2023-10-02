package _8backTracking;
public class subsets{
    public static void main(String[] args) {
        String str = "abcd";
        findsubset(str, "", 0);
    }
    public static  void findsubset(String str,String ans,int i){
        if(i == str.length()){
            if(ans.length()== 0 ){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        // yes choice 
        findsubset(str, ans+str.charAt(i), i+1); 
        // No choice 
        findsubset(str, ans, i+1);

    }
}