import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarkList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> marklist=new ArrayList<>();
        List<String> Students =new ArrayList<>();
        for(int i=0;i<5;i++){
            int mark=sc.nextInt();
            marklist.add(mark);
        }
        for(int i=0;i<5;i++){
            String students=sc.next();
            Students.add(students);
        }
        System.out.println("Marks List: "+marklist);
        System.out.println("Students List: "+Students);
    }
}