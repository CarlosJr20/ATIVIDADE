package Quest1;
public class ListaAlunos {
    Aluno primeiro;

    public ListaAlunos() {
        this.primeiro = null;
    }
    public void inserirAluno(String nome, int idade) {
        Aluno novoAluno = new Aluno(nome, idade);

        if (primeiro == null) {
            primeiro = novoAluno;
        } else {
            Aluno atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoAluno;
        }
    }
    public void removerAluno(String nome) {
        if (primeiro == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        if (primeiro.nome.equals(nome)) {
            primeiro = primeiro.proximo;
            return;
        }

        Aluno anterior = primeiro;
        Aluno atual = primeiro.proximo;
        while (atual != null && !atual.nome.equals(nome)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Aluno não encontrado!");
        } else {
            anterior.proximo = atual.proximo;
        }
    }

    public void imprimirLista() {
        if (primeiro == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        Aluno atual = primeiro;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", Idade: " + atual.idade);
            atual = atual.proximo;
        }
    }
}
