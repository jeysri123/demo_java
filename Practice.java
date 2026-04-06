import java.util.*;
public class Practice{
    public static void main(String[] args){
         int result = add(10,20);
        // System.out.println(result);
        // int result1 = sub(100, 20);
        // System.out.println(result1);
        String ans= Evenodd(65);
        System.out.println(ans);
    }
    public static int add(int x,int y){
        return x+y;
    }
    // public static int sub(int x,int y){
    //     return x-y;
    // }

    public static String Evenodd(int x){
        if(x%2==0) return "even";
        else return "odd";
    }
}