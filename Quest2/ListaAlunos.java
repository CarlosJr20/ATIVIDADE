package Quest2;

public class ListaAlunos {
    private Aluno primeiro;
    private Aluno ultimo;

    public ListaAlunos() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void inserir(String nome) {
        Aluno novoAluno = new Aluno(nome);
        if (this.primeiro == null) {
            this.primeiro = novoAluno;
            this.ultimo = novoAluno;
        } else {
            this.ultimo.proximo = novoAluno;
            this.ultimo = novoAluno;
        }
        System.out.println("Aluno inserido: " + nome);
    }

    public void remover(String nome) {
        if (this.primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }

        Aluno alunoAnterior = null;
        Aluno alunoAtual = this.primeiro;
        while (alunoAtual != null && !alunoAtual.nome.equalsIgnoreCase(nome)) {
            alunoAnterior = alunoAtual;
            alunoAtual = alunoAtual.proximo;
        }

        if (alunoAtual == null) {
            System.out.println("Aluno não cadastrado.");
            return;
        }

        if (alunoAnterior == null) {
            this.primeiro = alunoAtual.proximo;
        } else {
            alunoAnterior.proximo = alunoAtual.proximo;
        }

        if (this.ultimo == alunoAtual) {
            this.ultimo = alunoAnterior;
        }

        System.out.println("Aluno removido: " + nome);
    }

    public void imprimir() {
        if (this.primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }

        System.out.println("Alunos cadastrados:");
        Aluno alunoAtual = this.primeiro;
        while (alunoAtual != null) {
            System.out.println(alunoAtual.nome);
            alunoAtual = alunoAtual.proximo;
        }
    }
}
