package school.sptech;


public class BinarySearch {
    public static int buscarNoVetorInteiro(int v[],int x){
        int inicio = 0;
        int fim = v.length-1;
        int meio = 0;
        while(inicio <= fim) {
            meio = (inicio + fim)/2;
            if(x == v[meio]){
                return meio;
            }else if(x < v[meio]){
                fim = meio-1;
            }else{
                inicio = meio +1;
            }
        }
        return -1;
    }

    public static int buscarNoVetorDouble(double v[],double x){
        int inicio = 0;
        int fim = v.length-1;
        int meio = 0;
        while(inicio <= fim) {
            meio = (inicio + fim)/2;
            if(x == v[meio]){
                return meio;
            }else if(x < v[meio]){
                fim = meio-1;
            }else{
                inicio = meio +1;
            }
        }
        return -1;
    }

}
