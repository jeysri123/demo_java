import java.util.*;
public class shop{
    public static void main(String[] args){
        int amt=4000;
        double total=0.1;
        if(amt>5000){
          System.out.println("20% discount");  
        }
        else if(amt>2000){
           System.out.println("10% discount");
        }
        else{
           System.out.println("No discount");
        }
        
    }
}