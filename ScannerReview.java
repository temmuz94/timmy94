package Review;
import java.util.Scanner;
public class ScannerReview {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=keyboard.nextInt();//to capture int values
        System.out.println("Please tell me are tired true or false?");
        boolean tired=keyboard.nextBoolean();//to capture boolean values
        System.out.println("Please type your name");
        String name=keyboard.next();//to cap ture String until space


        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);






    }
}
