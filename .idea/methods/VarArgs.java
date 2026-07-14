import java.util.Arrays;

public class VarArgs {

    static void nomes(int age, String... nome){
        for(String num:nome){
            System.out.println(num);
        }

        System.out.println(age);
    }

    public static void main(String[] args) {
        nomes(23,"Junior", "Haaland", "Neymar");
    }
    
}
