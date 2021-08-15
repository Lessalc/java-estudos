package estruturadados.filas;

public class No<T> {
    /*
    Vamos usar generics para amarra o tipo de objeto que será passado
    Assim, quando criarmos uma fila com objeto do tipo String, só poderemos receber Strings
     */
    private T object;
    private No<T> refNo;

    public No(T object) {
        this.refNo = null;
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
