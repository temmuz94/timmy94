package Review;

import java.util.Scanner;

public class whileLoop2r {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("Are you tired");
        boolean tired= t.nextBoolean();
        while (!tired) {
            System.out.println("continue to work");
 tired= t.nextBoolean();
        }

    }
}
