import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        change(arr);
        System.out.println(Arrays.toString(arr));

        String name = "Junior";
        change(name);
        System.out.println(name);

        int a = arr[2];
        change(a);
        System.out.println(a);
    }

    
    static void change(int[] arr){
        arr[0] = 12;
    }

    static void change(String nome){
        nome = "Haaland";
    }

    static void change(int n){
        n = 15;
    }

    
}
