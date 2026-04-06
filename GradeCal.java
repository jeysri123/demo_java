import java.util.*;
public class GradeCal{
    public static void main(String[] args){
        int grade=7;
        char ch =' ';
        if(grade<50){
            ch='f';
        }
        else if(grade>50 && grade<=60){
            ch='c';
        }
        else if(grade>60 && grade<=80){
            ch='b';
        }
        
        else if(grade>80 && grade<=95){
            ch='a';
        }
        else{
            ch='o';
        }
        System.out.println(ch);
    }
}