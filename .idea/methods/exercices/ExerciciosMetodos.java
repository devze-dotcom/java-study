package exercices;

import java.util.Arrays;

public class ExerciciosMetodos {
    public static void main(String[] args) {
        //somar(3, 5);
        //subtrair(4,7);
        //multiplicar(3,5);
        //dividir(2, 3);
        //saudacao("Junior", 3);
        //System.out.println(ehprimo(0));
        //System.out.println(validarSenha("Javazinho"));
        //System.out.println("Area das figuras: ");
        //System.out.println("Quadrado: " + calcularArea(4));
        //System.out.println("Retangulo: " + calcularArea(10, 38));
        //System.out.println("Circulo: " + calcularArea(10, true));
        //double[] notas = {10, 20, 30, 40, 50};
        int[] numeros = {
        42, 17, 89, 5, 63, 28, 91, 14, 56, 73,
        31, 8, 65, 99, 24, 50, 12, 77, 39, 84,
        3, 60, 95, 21, 46, 71, 10, 88, 34, 57,
        19, 82, 7, 53, 26, 97, 40, 15, 68, 92,
        1, 74, 36, 59, 11, 86, 44, 23, 79, 62
};
        //System.out.println(calcularMedia(notas));

        System.out.println(maiorNumero(numeros));
        




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

    public static double calcularArea(double lado){
        return lado * lado;
    }

    public static double calcularArea(double base, double altura){
        return base * altura;
    }

    public static double calcularArea(double raio, boolean ehCiculo){
        if (ehCiculo == false){
            return -1;
        }

        double areaCirculo = 3.14*raio*raio;
        return areaCirculo;
    }

    public static double calcularMedia(double[] notas){
        int qtdNotas = notas.length;
        double temp = 0;
        for(double n: notas){
            temp+=n;
        }
        return temp / qtdNotas;
        
    }

    public static int maiorNumero(int[] arr){
        int maior = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > maior){
                maior = arr[i];
            }
        }

        return maior;
    }

}
    
