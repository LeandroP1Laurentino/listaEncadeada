public class No<Tipo> {
    private Tipo elemento;
    private No proximo;

    public No(Tipo elemento) {
        this.elemento = elemento;
    }

    public No(Tipo elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Tipo getElemento() {
        return elemento;
    }

    public void setElemento(Tipo elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
