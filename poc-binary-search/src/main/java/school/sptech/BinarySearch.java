package school.sptech;


import java.util.List;

public class BinarySearch {
    public static Produto buscarPreco(List<Produto> lp, double preco){
        Produto produtoEncontrado = null;
        int inicio = 0;
        int fim = lp.size()-1;
        while(inicio <= fim){
            int meio = (inicio + fim)/2;
            double comparacao = lp.get(meio).getPreco();
            if(preco == comparacao){
                produtoEncontrado = lp.get(meio);
                return produtoEncontrado;
            }else if(preco > lp.get(meio).getPreco()){
                fim = meio-1;
            }else{
                inicio = meio+ 1;
            }
        }
        return produtoEncontrado;
    }
    public static Produto buscarQtdEstoque(List<Produto> lp, int qtd){
        Produto produtoEncontrado = null;
        int inicio = 0;
        int fim = lp.size()-1;
        while(inicio <= fim){
            int meio = (inicio + fim)/2;
            int comparacao = lp.get(meio).getQtdEstoque();
            if(qtd == comparacao){
                produtoEncontrado = lp.get(meio);
                return produtoEncontrado;
            }else if(qtd < lp.get(meio).getQtdEstoque()){
                inicio = meio+1;
            }else{
                fim = meio-1;
            }
        }
        return produtoEncontrado;
    }
    public static Produto buscarId(List<Produto> lp, int id){
        Produto produtoEncontrado = null;
        int inicio = 0;
        int fim = lp.size()-1;
        while(inicio <= fim){
            int meio = (inicio + fim)/2;
            double comparacao = lp.get(meio).getId();
            if(id == comparacao){
                produtoEncontrado = lp.get(meio);
                return produtoEncontrado;
            }else if(id > lp.get(meio).getId()){
                fim = meio-1;
            }else{
                inicio = meio+ 1;
            }
        }
        return produtoEncontrado;
    }


}
