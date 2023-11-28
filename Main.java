public class Main
{
    public static void main(String[] args){
        UsaListaLigada lista = new UsaListaLigada();
        lista.insertaPrimerNodo("A");
        lista.insertaAlFinal("B");
        lista.insertaAlFinal("C");
        //lista.intercambiarNodo("B","K");
        lista.insertaDespues("B","K");
        lista.imprimir();
        //lista.devolverReferencia("B");
    }
}
