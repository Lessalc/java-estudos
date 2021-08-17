package estruturadados.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    // Queremos ser performaticos na contagem de itens de uma lista.
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i=0; (i<index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public void add(T objeto){
        NoDuplo<T> novoNo = new NoDuplo<>(objeto);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo ==  null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        this.tamanhoLista++;
    }

    public void add(int index, T objeto){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(objeto);
        // Primeiro vamos deslocar o noAuxiliar, logo o novoNo.setNoProximo passa a ser o auxiliar
        novoNo.setNoProximo(noAuxiliar);

        // Para qualquer posição que não a última
        if(novoNo.getNoProximo() != null){
            // Referencia prévia do novoNo
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            // Setando a prévia do noAuxiliar para o novoNo
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else{
            // Caso seja o último, a referência anterior é o ultimo nó e o último nó passa a se referiar ao novoNo
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        // Por fim verificar se estamos na primeira posição
        if(index == 0){
            // Sendo a primeira, setamos apenas o primeiro nó para apontar ao novoNo
            primeiroNo = novoNo;
        }else {
            // Caso não, o nó anterior deve apontar posteriormente para esse novo Nó
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultimoNo = noAuxiliar.getNoPrevio();
            }
        }

        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i<tamanhoLista;i++){
            strRetorno += "[No{Conteudo= "+noAuxiliar.getConteudo()+"}] -->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }

    public int size(){
        return tamanhoLista;
    }



}
