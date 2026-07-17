package exercices.taskflow;

public class Tarefa {

    private Integer id;
    private Boolean concluida = false;

    public Tarefa(Integer id){
        this.id = id;
    }

    public Tarefa(Integer id, Boolean concluida){
        this.concluida = concluida;
        this.id = id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setConcluida(Boolean concluida){
        this.concluida = concluida;
    }

    public Boolean getConcluida(){
        return this.concluida;
    }

    public void finalizarTarefa(Tarefa t){
        this.concluida = true;
    }
}
