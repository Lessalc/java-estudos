package estruturadados.arvorebinaria;

import estruturadados.arvorebinaria.model.Obj;

public class MainArvoreBinaria {

    public static void main(String[] args) {

        ArvoreBinaria<Obj> minhaArvoreBinaria = new ArvoreBinaria<>();
        minhaArvoreBinaria.inserir(new Obj(13));
        minhaArvoreBinaria.inserir(new Obj(10));
        minhaArvoreBinaria.inserir(new Obj(2));
        minhaArvoreBinaria.inserir(new Obj(12));
        minhaArvoreBinaria.inserir(new Obj(25));
        minhaArvoreBinaria.inserir(new Obj(20));
        minhaArvoreBinaria.inserir(new Obj(31));
        minhaArvoreBinaria.inserir(new Obj(29));

        minhaArvoreBinaria.exibirEmOrdem();
        minhaArvoreBinaria.exibirPosOrdem();
        minhaArvoreBinaria.exibirPreOrdem();

        System.out.println("\n\n-------- Acrescentando um novo valor ------------------");
        minhaArvoreBinaria.inserir(new Obj(32));
        minhaArvoreBinaria.exibirEmOrdem();
        minhaArvoreBinaria.exibirPosOrdem();
        minhaArvoreBinaria.exibirPreOrdem();

        System.out.println("\n\n-------- Apagando um novo valor ------------------");
        minhaArvoreBinaria.revome(new Obj(29));
        minhaArvoreBinaria.exibirEmOrdem();
        minhaArvoreBinaria.exibirPosOrdem();
        minhaArvoreBinaria.exibirPreOrdem();
    }
}
