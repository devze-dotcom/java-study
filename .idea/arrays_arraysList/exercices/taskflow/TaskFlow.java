package exercices.taskflow;

import java.util.Arrays;

public class TaskFlow {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa(1);
        Tarefa t2 = new Tarefa(2);
        Tarefa t3 = new Tarefa(3);
        
        Tarefa[] backLog = {t1, t2, t3};



        System.out.println(Arrays.toString(backLog));


    }
    
}
