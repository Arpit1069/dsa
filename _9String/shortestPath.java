package _9String;

public class shortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestpath(str));
    }
    public static double shortestpath(String str){
        int x = 0;
        int y = 0;
        int point =0;
        while(point<str.length()){
            if(str.charAt(point)=='N'){
                y++;
            }
            else if(str.charAt(point)=='S'){
                y--;
            }
            else if(str.charAt(point)=='E'){
                x++;
            }
            else{
                x--;
            }
            point++;
        }
        double dist = Math.sqrt((Math.pow(y, 2)+Math.pow(x, 2)));
        return dist;
    }
}
