package _9String;

import java.util.Scanner;

public class Strings {
   public static void main(String[] args) {
    String str1 = "abcd";
    String str2 = new String("xyz");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String sname = sc.next();
    System.out.println(name);
    System.out.println(sname);
    System.out.println(str1 +" "+str2);
    System.out.println(name.length());
   } 
}
