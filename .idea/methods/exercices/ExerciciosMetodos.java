package exercices;

public class ExerciciosMetodos {
    public static void main(String[] args) {
        //somar(3, 5);
        //subtrair(4,7);
        //multiplicar(3,5);
        //dividir(2, 3);
        //saudacao("Junior", 3);
        //System.out.println(ehprimo(0));

        System.out.println(validarSenha("Javazinho"));


    }

    public static void somar(int a, int b){
        System.out.println(a + b);
    }

    public static void subtrair(int a, int b){
        System.out.println(a - b);
    }

    public static void multiplicar(int a, int b){
        System.out.println(a * b);
    }

    
    public static void dividir(double a, double b){
        if (b<=0){
            System.out.println("Impossivel");
        } else {
            System.out.println(a / b);
        }

    }

    public static void saudacao(String nome, int hora){
        if (hora >= 6 && hora <= 11) {
            System.out.println("Bom dia " + nome + "!");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde " + nome + "!");
        } else {
            System.out.println("Boa noite " + nome + "!");
        }
    }

    public static boolean ehprimo(int a){
        if (a == 1 || a==0){return false;}
        int i;
        int temp = 0;
        for (i = 2; i < a; i++){
            if (a % i == 0){
                temp+=1;
            }
        }
        if (temp == 0){return true;} 
        else {return false;}
    }

    public static boolean validarSenha(String senha){
        String novaSenha = senha.toLowerCase();
        if(novaSenha.length() >= 8 && novaSenha.contains("java")) {
            return true;
        } else {
            return false;
        }
    }

}
    
