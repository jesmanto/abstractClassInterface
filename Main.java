package Practice;
import java.util.*;
public class Main {
    public  static void main(String s[]){

        //Rectangle object assigned to a Shape reference
        Shape rectangle1 = new Rectangle(30,40,50);
        System.out.println("This shape has a surface area of " + rectangle1.surfaceArea());
        System.out.println("This shape has a surface area of " + rectangle1.volume());

        System.out.println("-------------------------------------");

        //Rectangle object assigned to a DoMore reference
        DoMore rect = new Rectangle(30,40,50);
        rect.printName();

        System.out.println("-------------------------------------");

        Rectangle rectangle = new Rectangle(30,40,50);

        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a range of number to check for numbers divisible by 3 and 5");
        int num = input.nextInt();
        if(num < 15){
            System.out.println("Kindly enter a number greater than 15...");
            num = input.nextInt();
        }else{
            for(int i = 1; i <= num ; i++){
                System.out.print(i +" : " ); rectangle.foobar(i);
            }
        }
    }
}
