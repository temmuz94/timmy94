package Review;

public class ArrayReverse {
    public static void main(String[] args) {

        String[] colors={"Black","White"};
        for (String x:colors) {
            System.out.println(x+" ");

        }
        System.out.println("----------");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);


        }
        System.out.println("reverse");

        for (int i = colors.length-1 ;i >=0 ; i--) {
            System.out.println(colors[i]+"; ");

        }
    }
}
