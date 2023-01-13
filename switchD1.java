package Review;

import java.util.Scanner;

public class switchD1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter browser");
        String b= s.nextLine();
        switch (b.toLowerCase()){
            case "chrome":
                System.out.println("Test case executed in "+b);
                break;
            case "safari":
                System.out.println("TEst case executed in "+b);
                break;
            default:
                System.out.println("No execution");

        }
    }
}
