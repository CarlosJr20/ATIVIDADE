package Quest1;
public class Aluno {
    String nome;
    int idade;
    Aluno proximo;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.proximo = null;
    }
}
