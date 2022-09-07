import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int mark=ob.nextInt();
        if(mark>=40){
            if(mark>=50){
              if(mark>=70){
                if(mark>=80){
                  if(mark>=90){
                    if(mark==100){
                     System.out.print("Distrinction");
                    }
                   else
                    System.out.print("Grade 1");
                  }
                 else
                  System.out.print("Grade 2");
                }
               else
                System.out.print("Grade 3");
              }
             else
              System.out.print("Grade 4");
            }
            else
            System.out.print("Grade 5");
        }
        else
         System.out.print("Fail");
    }
}