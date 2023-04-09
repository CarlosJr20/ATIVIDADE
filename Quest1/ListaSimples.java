package Quest1;
public class ListaSimples {
    public static void main(String[] args) {
        ListaAlunos lista = new ListaAlunos();
        
        lista.inserirAluno("João", 20);
        lista.inserirAluno("Maria", 22);
        lista.inserirAluno("Pedro", 21);
        
        lista.imprimirLista();
        
        lista.removerAluno("Maria");
        
        lista.imprimirLista();
    }
}
