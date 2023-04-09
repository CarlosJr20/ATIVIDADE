package Quest5;

class Fila {
    private Aluno[] elementos;
    private int inicio;
    private int fim;
    private int capacidade;
    private int tamanho;

    public Fila(int capacidade) {
        this.elementos = new Aluno[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    public void enfileirar(Aluno aluno) {
        if (tamanho < capacidade) {
            fim = (fim + 1) % capacidade;
            elementos[fim] = aluno;
            tamanho++;
        } else {
            System.out.println("Fila cheia. Não é possível enfileirar o aluno.");
        }
    }

    public Aluno desenfileirar() {
        if (tamanho > 0) {
            Aluno aluno = elementos[inicio];
            inicio = (inicio + 1) % capacidade;
            tamanho--;
            return aluno;
        } else {
            System.out.println("Fila vazia. Não é possível desenfileirar o aluno.");
            return null;
        }
    }

    public void imprimir() {
        System.out.println("Elementos da fila:");
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % capacidade;
            System.out.println("Matrícula: " + elementos[indice].matricula + ", Nome: " + elementos[indice].nome);
        }
    }

    public void limpar() {
        inicio = 0;
        fim = -1;
        tamanho = 0;
        System.out.println("Fila limpa.");
    }
}