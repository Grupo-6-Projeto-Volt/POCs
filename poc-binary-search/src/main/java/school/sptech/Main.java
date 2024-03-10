package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Busca binária em um vetor inteiro
        int[] vetorInteiro = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Escolha um número a ser buscado\n");
        int numeroBuscadoInt = leitor.nextInt();
        System.out.println("O número " + numeroBuscadoInt + " foi encontrado na posição " + BinarySearch.buscarNoVetorInteiro(vetorInteiro,numeroBuscadoInt));

        //Busca binária em um vetor double
        double[] vetorDouble = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        System.out.println("Escolha um número a ser buscado\n");
        double numeroBuscadoDouble = leitor.nextDouble();
        System.out.println("O número " + numeroBuscadoDouble + " foi encontrado na posição " + BinarySearch.buscarNoVetorDouble(vetorDouble,numeroBuscadoDouble));
    }
}