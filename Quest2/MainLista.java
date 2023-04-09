package Quest2;

public class MainLista {
    public static void main(String[] args) {
        ListaAlunos lista = new ListaAlunos();

        lista.inserir("Alice");
        lista.inserir("Bob");
        lista.inserir("Carol");
        lista.inserir("Dave");

        lista.imprimir();

        lista.remover("Bob");
        lista.imprimir();

        lista.remover("Eve"); 
        lista.imprimir();
    }
}
