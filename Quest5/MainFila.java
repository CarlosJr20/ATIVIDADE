package Quest5;

public class MainFila {
    public static void main(String[] args) {
        Fila fila = new Fila(6);

        // Exemplo de enfileiramento de alunos
        fila.enfileirar(new Aluno(1001, "João"));
        fila.enfileirar(new Aluno(1002, "Maria"));
        fila.enfileirar(new Aluno(1003, "Pedro"));
        fila.enfileirar(new Aluno(1004, "Anna"));
        fila.enfileirar(new Aluno(1005, "Carlos"));
        fila.enfileirar(new Aluno(1006, "Grazi"));
        fila.enfileirar(new Aluno(1007, "Gilvan"));

        // Exemplo de impressão da fila
        fila.imprimir();

        // Exemplo de desenfileiramento de aluno
        Aluno alunoDesenfileirado = fila.desenfileirar();
        if (alunoDesenfileirado != null) {
            System.out.println("Aluno desenfileirado: Matrícula: " + alunoDesenfileirado.matricula + ", Nome: " + alunoDesenfileirado.nome);
        }

        // Exemplo de limpeza da fila
        fila.limpar();
    }
}