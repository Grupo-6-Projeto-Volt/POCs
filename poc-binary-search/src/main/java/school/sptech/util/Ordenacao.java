package school.sptech.util;

import school.sptech.Produto;

import java.util.Arrays;
import java.util.List;

public class Ordenacao {
    public static List<Produto> bubbleSortMaiorPreco(List<Produto> lp){
        Produto produtoTemp;

        for (int i = 0; i < lp.size(); i++) {
            for (int y = 0; y < lp.size() - i - 1; y++) {

                if(lp.get(y).getPreco() < lp.get(y+1).getPreco()){
                    produtoTemp = lp.get(y);
                    lp.set(y, lp.get(y+1));
                    lp.set(y+1, produtoTemp);
                }
            }
        }

        return lp;
    }

    public static List<Produto> selectionSortMaiorQtdEstoque(List<Produto> lp){
        Produto produtoTemp;
        int indMenor = 0;

        for (int i = 0; i < lp.size() - 1; i++) {
            indMenor = i;
            for (int j = i+1; j < lp.size(); j++) {

                if(lp.get(j).getQtdEstoque() > lp.get(indMenor).getQtdEstoque()){
                    indMenor = j;
                }

            }
            produtoTemp = lp.get(i);
            lp.set(i, lp.get(indMenor));
            lp.set(indMenor, produtoTemp);
        }

        return lp;
    }

    public static List<Produto> insertionSortUltimosInseridos(List<Produto> lp){
        int i,j,n = 0;

        Produto x;

        for (i = 1; i < lp.size(); i++) {
            x = lp.get(i);

            j = i - 1;

            while (j >= 0 && lp.get(j).getId() < x.getId()){

                lp.set(j+1, lp.get(j));
                j = j - 1;
                n++;

            }

            lp.set(j+1, x);
        }

        return lp;

    }

}
