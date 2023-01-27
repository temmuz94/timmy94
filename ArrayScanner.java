package Review;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {


        Scanner x=new Scanner(System.in);
        System.out.println("How many names you want to store");

        int size= x.nextInt();
        String [] name=new String[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Please enter name");
            name[i]=x.next();


        }for (String y:name){
            System.out.print(y);

    }
}}
