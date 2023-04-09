package Quest3;

public class MainLista {
    public static void main(String[] args) {
        ListaAlunos lista = new  ListaAlunos();
        lista.inserir(1001, "João");
        lista.inserir(1003, "Maria");
        lista.inserir(1002, "Pedro");
        lista.inserir(1004, "Gilvan");
        lista.remover(1003);
        lista.imprimir(1002);
    }
}