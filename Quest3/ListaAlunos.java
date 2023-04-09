package Quest3;

public class ListaAlunos {
    private Aluno primeiro;
    private Aluno ultimo;

    public ListaAlunos() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void inserir(int matricula, String nome) {
        Aluno novoAluno = new Aluno(matricula, nome);

        if (this.primeiro == null) {
            this.primeiro = novoAluno;
            this.ultimo = novoAluno;
        } else {
            Aluno alunoAtual = this.primeiro;
            while (alunoAtual != null && alunoAtual.matricula < matricula) {
                alunoAtual = alunoAtual.proximo;
            }

            if (alunoAtual == null) {
                novoAluno.anterior = this.ultimo;
                this.ultimo.proximo = novoAluno;
                this.ultimo = novoAluno;
            } else {
                novoAluno.proximo = alunoAtual;
                novoAluno.anterior = alunoAtual.anterior;
                alunoAtual.anterior = novoAluno;

                if (novoAluno.anterior == null) {
                    this.primeiro = novoAluno;
                } else {
                    novoAluno.anterior.proximo = novoAluno;
                }
            }
        }

        System.out.println("Aluno inserido: Matrícula: " + matricula + ", Nome: " + nome);
    }

    public void remover(int matricula) {
        if (this.primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }

        Aluno alunoAtual = this.primeiro;
        while (alunoAtual != null && alunoAtual.matricula != matricula) {
            alunoAtual = alunoAtual.proximo;
        }

        if (alunoAtual == null) {
            System.out.println("Aluno não cadastrado.");
            return;
        }

        if (alunoAtual.anterior == null) {
            this.primeiro = alunoAtual.proximo;
        } else {
            alunoAtual.anterior.proximo = alunoAtual.proximo;
        }

        if (alunoAtual.proximo == null) {
            this.ultimo = alunoAtual.anterior;
        } else {
            alunoAtual.proximo.anterior = alunoAtual.anterior;
        }

        System.out.println("Aluno removido: Matrícula: " + matricula + ", Nome: " + alunoAtual.nome);
    }

    public void imprimir(int matricula) {
        if (this.primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }

        Aluno alunoAtual = this.primeiro;
        while (alunoAtual != null && alunoAtual.matricula != matricula) {
            alunoAtual = alunoAtual.proximo;
        }

        if (alunoAtual == null) {
            System.out.println("Aluno não cadastrado.");
            return;
        }

        System.out.println("Aluno Encontrado: ");
        if (alunoAtual.anterior != null) {
            System.out.println("Matrícula do Aluno Anterior: " + alunoAtual.anterior.matricula);
            System.out.println("Nome do Aluno Anterior: " + alunoAtual.anterior.nome);
        } else {
            System.out.println("Não há aluno anterior.");
        }

        System.out.println("Matrícula do Aluno Encontrado: " + alunoAtual.matricula);
        System.out.println("Nome do Aluno Encontrado: " + alunoAtual.nome);

        if (alunoAtual.proximo != null) {
            System.out.println("Matrícula do Próximo Aluno: " + alunoAtual.proximo.matricula);
            System.out.println("Nome do Próximo Aluno: " + alunoAtual.proximo.nome);
        } else {
            System.out.println("Não há próximo aluno.");
        }
    }

    public void imprimirLista() {
        if (this.primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }

        System.out.println("Lista de Alunos: ");
        Aluno alunoAtual = this.primeiro;
        while (alunoAtual != null) {
            System.out.println("Matrícula: " + alunoAtual.matricula + ", Nome: " + alunoAtual.nome);
            alunoAtual = alunoAtual.proximo;
        }
    }
}

