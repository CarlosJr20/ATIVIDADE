package Quest6;

public class MainQuest6 {
    public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno(1001, "João", "Matemática", 8.5);
        Aluno aluno2 = new Aluno(1002, "Maria", "História", 6.0);
        Aluno aluno3 = new Aluno(1003, "Pedro", "Geografia", 7.5);
        Aluno aluno4 = new Aluno(1004, "Gilvan", "Português", 6.5);

        ListaAluno listaAlunos = new ListaAluno (5);
      
        listaAlunos.inserir(aluno1);
        listaAlunos.inserir(aluno2);
        listaAlunos.inserir(aluno3);
        listaAlunos.inserir(aluno4);
      
        System.out.println("Alunos Aprovados:");
        listaAlunos.imprimirAprovados();
       
        System.out.println("\nAlunos Reprovados:");
        listaAlunos.imprimirReprovados();

        System.out.println("\nÚltimos Dois Alunos Inseridos:");
        listaAlunos.imprimirUltimosDois();

        listaAlunos.limpar();

        System.out.println("\nAlunos Após Limpar a Lista:");
        listaAlunos.imprimir();
    }
}
