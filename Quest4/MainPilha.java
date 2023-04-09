package Quest4;

public class MainPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        pilha.push(new Aluno(1001, "João"));
        pilha.push(new Aluno(1002, "Maria"));
        pilha.push(new Aluno(1003, "Pedro"));
        pilha.push(new Aluno(1004, "Anna"));
        pilha.push(new Aluno(1005, "Gilvan"));

        pilha.imprimir();

        Aluno alunoRemovido = pilha.pop();
        if (alunoRemovido != null) {
            System.out.println("Aluno removido: Matrícula: " + alunoRemovido.matricula + ", Nome: " + alunoRemovido.nome);
        }

        pilha.limpar();
    }
}