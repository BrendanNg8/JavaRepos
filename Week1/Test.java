package Week1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
    
         
        try (Scanner scanner = new Scanner(System.in)) {
            /*
            System.out.print("Enter you name: ");
            String name = scanner.nextLine(); //Do this for String Inputs
            System.out.println("Hello "+ name);
//------------------------------------------------------------------------------
            System.out.print("Enter your age: ");
            int age = scanner.nextInt(); //Do this for Integer Inputs
            System.out.println("You are: "+age);
//------------------------------------------------------------------------------
            System.out.print("What is your GPA? ");
            double GPA = scanner.nextDouble();
            System.out.println("Your GPA is: "+GPA);

            if(GPA == 100){
                System.out.println("Dang your grades must be good");
            }

            

            scanner.close();

            */
            System.out.print("How old are you?: ");
            int age = scanner.nextInt();
            scanner.nextLine(); //While accepting a int or double, and then accept a string, put this line... 

            /*
             * So basically, you click enter after you enter your age, then the name picks up on that /n as the value it'll hold (or the enter you clicked)
             */

            System.out.print("What is your name?: ");
            String name = scanner.nextLine();

      

            System.out.println("Your name is : "+name);
            System.out.println("You are "+age+" years old");
        }
    }

}