package Quest3;

public class Aluno {
    int matricula;
    String nome;
    Aluno anterior;
    Aluno proximo;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.anterior = null;
        this.proximo = null;
    }
}
