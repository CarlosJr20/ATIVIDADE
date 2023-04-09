package Quest4;

class Pilha {
    private Aluno[] elementos;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.elementos = new Aluno[capacidade];
        this.topo = -1;
        this.capacidade = capacidade;
    }

    public void push(Aluno aluno) {
        if (topo < capacidade - 1) {
            elementos[++topo] = aluno;
        } else {
            System.out.println("Pilha cheia. Não é possível inserir o aluno.");
        }
    }

    public Aluno pop() {
        if (topo >= 0) {
            Aluno aluno = elementos[topo--];
            return aluno;
        } else {
            System.out.println("Pilha vazia. Não é possível remover o aluno.");
            return null;
        }
    }

    public void imprimir() {
        System.out.println("Elementos da pilha:");
        for (int i = topo; i >= 0; i--) {
            System.out.println("Matrícula: " + elementos[i].matricula + ", Nome: " + elementos[i].nome);
        }
    }

    public void limpar() {
        topo = -1;
        System.out.println("Pilha limpa.");
    }
}