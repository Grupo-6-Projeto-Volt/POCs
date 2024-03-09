package school.sptech;

public class BubbleSort {

    public static int[] ordenaVetorInteiro(int[] v){
        int numeroTemp;

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {

                // O numero de agora(v[j]) é maior que o proximo (v[j + 1])?
                if(v[j] > v[j+1]){

                    numeroTemp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = numeroTemp;
                }
            }
        }
        return v;
    }

    public static double[] ordenaVetorDouble(double[] v){
        double numeroTemp;

        for (int i = 0; i < v.length; i++) {
            for (int y = 0; y < v.length - i - 1; y++) {
                if(v[y] > v[y+1]){
                    numeroTemp = v[y];
                    v[y] = v[y+1];
                    v[y+1] = numeroTemp;
                }
            }
        }
        return v;
    }

}
