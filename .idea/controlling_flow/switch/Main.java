import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String animal = input.nextLine();

        switch (animal) {
            case "Gato"-> System.out.println("Digite: Cachorro");
            case "Cachorro" -> System.out.println("Boa");
            default -> System.out.println("Nao deveria ter chegado ate aqui"); 
                
        }
    }
}
