//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        listaEncadeada<String> lista = new listaEncadeada<>();


        lista.adicionar("Claudio");
        lista.adicionar("Camila");
        lista.adicionar("Miguel");
        lista.adicionar("Elis");


        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println("Inicio da lista: " + lista.getInicio().getElemento() );
        System.out.println("Fim da Lista: " + lista.getFim().getElemento());

        System.out.println("Elemento da posicao 2 = " + lista.get(0).getElemento());


        lista.remover("Camila");

        System.out.println("lista inteira: " + lista.toString());
    }
}