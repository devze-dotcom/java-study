import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.printf(i + 1+"º input: ");
            arr[i] = scanner.nextInt();
            sum+=arr[i];
            
        }

        System.out.println(sum);
    }
}
