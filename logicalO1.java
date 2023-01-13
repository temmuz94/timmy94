package Review;

public class logicalO1 {
    public static void main(String[] args) {
        boolean dashBoard=true;
        String message="Welcome Admin";

        if(dashBoard || message.equals("Welcome Admin")){
            System.out.println("User is successfully logged in ");
        }else {
            System.out.println("User is fucked");}}
}
