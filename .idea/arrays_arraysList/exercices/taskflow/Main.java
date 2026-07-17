package exercices.taskflow;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] diasSemana = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta"};
        int[] horasNaSemana = new int[5];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Digite as Horas Trabalhadas na " + diasSemana[i] + ": ");
            horasNaSemana[i] = input.nextInt();
        }

        System.out.println("Carga Horaria completa da semana: " + Arrays.toString(horasNaSemana));

        int soma = 0;
        for (int j : horasNaSemana) {
            soma+=j;
        }

        System.out.println("Carga Horaria total da semana: " + soma);
    }
    
}
