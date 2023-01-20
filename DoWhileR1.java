package Review;

import java.util.Scanner;

public class DoWhileR1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops");
             answer = s.nextLine();
        } while(answer.equalsIgnoreCase("no"));

}}
