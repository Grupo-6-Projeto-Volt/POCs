package school.sptech;

public class MergeSort {

    public static int[] intercala(int p, int q, int r, int[] v){
        int i = p;
        int j = q;
        int k = 0;
        int[] w = new int[r-p];

        while ((i < p) && (j < r)){
            if(v[i] <= v[j]){
                w[k++] = v[i++];
            }
            else {
                w[k++] = v[j++];
            }
        }
        while (i<q){
            w[k++] = v[i++];
        }

        while (j<r){
            w[k++] = v[j++];
        }

        for ( ; i < r; i++) {
            v[i] = w[i-p];
        }
        return v;
    }

    public static int[] ordenacaoInteiro(int p, int r, int[] v){
        if(p < r-1){
            int q = (p + r) / 2;
            ordenacaoInteiro(p, q, v);
            ordenacaoInteiro(q, r, v);
            intercala(p, q, r, v);
        }

        return v;
    }
}
