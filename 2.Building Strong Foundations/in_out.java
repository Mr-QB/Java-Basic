import java.util.Scanner;

public class in_out {
    public static void main(String[] args) {
        System.out.println("What is you name ?");
        Scanner input = new Scanner(System.in);
        String my_name = input.nextLine();
        System.out.println(
                "Ok, it is: " + my_name);
    }
}
