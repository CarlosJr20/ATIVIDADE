package Quest6;

class ListaAluno {
    private Aluno[] alunos;
    private int capacidade;
    private int quantidade;

    public ListaAluno(int capacidade) {
        this.alunos = new Aluno[capacidade];
        this.capacidade = capacidade;
        this.quantidade = 0;
    }

    public void inserir(Aluno aluno) {
        if (quantidade == capacidade) {
            System.out.println("A lista está cheia. Não é possível inserir um novo aluno.");
        } else {
            alunos[quantidade] = aluno;
            quantidade++;

            if (quantidade > 1) {
                System.out.println("Último aluno inserido: " + aluno.nome);
                System.out.println("Dois últimos alunos inseridos antes deste: ");
                imprimirUltimosDois();
            }
        }
    }

    public void remover(String nomeOuMatricula) {
        int indiceAlunoRemovido = -1;

        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].nome.equals(nomeOuMatricula) || String.valueOf(alunos[i].matricula).equals(nomeOuMatricula)) {
                indiceAlunoRemovido = i;
                break;
            }
        }

        if (indiceAlunoRemovido == -1) {
            System.out.println("Aluno não encontrado na lista.");
        } else {
            Aluno alunoRemovido = alunos[indiceAlunoRemovido];

            for (int i = indiceAlunoRemovido; i < quantidade - 1; i++) {
                alunos[i] = alunos[i + 1];
            }

            quantidade--;

            System.out.println("Aluno removido: " + alunoRemovido.nome);
            System.out.println("Dois últimos alunos após a remoção: ");
            imprimirUltimosDois();
        }
    }

    public void imprimir() {
        if (quantidade == 0) {
            System.out.println("Lista de alunos vazia.");
        } else {
            System.out.println("Lista de alunos em ordem alfabética:");
            // ordenarPorNome();
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Matrícula: " + alunos[i].matricula + ", Nome: " + alunos[i].nome +
                        ", Disciplina: " + alunos[i].disciplina + ", Nota: " + alunos[i].nota);
            }
        }
    }

    public void imprimirPorDisciplina(String disciplina) {
        System.out.println("Lista de alunos matriculados em " + disciplina + ":");
        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].disciplina.equals(disciplina)) {
                System.out.println("Matrícula: " + alunos[i].matricula + ", Nome: " + alunos[i].nome +
                        ", Disciplina: " + alunos[i].disciplina + ", Nota: " + alunos[i].nota);
            }
        }
    }

    public void imprimirAprovados() {
        System.out.println("Lista de alunos aprovados:");
        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].nota >= 7.0) {
                System.out.println("Matrícula: " + alunos[i].matricula + ", Nome: " + alunos[i].nome +
                        ", Disciplina: " + alunos[i].disciplina + ", Nota: " + alunos[i].nota);
            }
        }
    }
    
    public void imprimirReprovados() {
        System.out.println("Lista de alunos reprovados:");
        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].nota < 7.0) {
                System.out.println("Matrícula: " + alunos[i].matricula + ", Nome: " + alunos[i].nome +
                        ", Disciplina: " + alunos[i].disciplina + ", Nota: " + alunos[i].nota);
            }
        }
    }
    
    public void limpar() {
        quantidade = 0;
        System.out.println("Lista de alunos limpa.");
    }
    
    void imprimirUltimosDois() {
        if (quantidade >= 2) {
            System.out.println("1º aluno: Matrícula: " + alunos[quantidade - 2].matricula + ", Nome: " + alunos[quantidade - 2].nome +
                    ", Disciplina: " + alunos[quantidade - 2].disciplina + ", Nota: " + alunos[quantidade - 2].nota);
            System.out.println("2º aluno: Matrícula: " + alunos[quantidade - 1].matricula + ", Nome: " + alunos[quantidade - 1].nome +
                    ", Disciplina: " + alunos[quantidade - 1].disciplina + ", Nota: " + alunos[quantidade - 1].nota);
        } else if (quantidade == 1) {
            System.out.println("1º aluno: Matrícula: " + alunos[0].matricula + ", Nome: " + alunos[0].nome +
                    ", Disciplina: " + alunos[0].disciplina + ", Nota: " + alunos[0].nota);
            System.out.println("2º aluno: Não há outro aluno inserido.");
        } else {
            System.out.println("Não há alunos inseridos para mostrar.");
        }
    }
    }
    