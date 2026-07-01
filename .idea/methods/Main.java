import java.util.Scanner;

public class Main {

    public static void sum(){

        Scanner input = new Scanner(System.in);
        System.out.printf("1 number: ");
        int a = input.nextInt();
        System.out.printf("2 number: ");
        int b = input.nextInt();

        System.out.println(a + b);
        input.close();

    }

    public static void main(String[] args) {
        // Take input of 2 numbers and print the sum

        sum();


    }
}