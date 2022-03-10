import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int check = input.nextInt();
        if (check == 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
