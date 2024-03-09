package school.sptech;

public class SelecionSort {

    public static void selectionSort(int[] v){
        int temp = 0;
        int indMenor = 0;

        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < v.length - 1; i++) {
            indMenor = i;
            for (int j = i+1; j < v.length; j++) {
                if(v[j] < v[indMenor]){
                    indMenor = j;
                }
            }
            temp = v[i];
            v[i] = v[indMenor];
            v[indMenor] = temp;
        }
        long tempoFinal = System.currentTimeMillis() - tempoInicial;
        System.out.println(("Tempo de execussão: %d ms").formatted(tempoFinal));
    }
}
