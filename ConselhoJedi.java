import java.util.Scanner;

public class ConselhoJedi {
    //quase consegui essa

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] vetor = {1, 5, 2, 4, 3};
        System.out.println(verPontuacao(vetor));
    }

    public static int verPontuacao(int[] vetor){
        
        int inicio = vetor[0];
        int n = vetor.length - 1;
        int k = 2;
        int[] tempv = new int[vetor.length];
        int temp = 0;
        int meio = (inicio + n) / 2;

        merge(vetor, tempv, inicio, meio, n);
        
        for (int i = 0; i < vetor.length; i++) {
            
            if(k < vetor[i]){
                temp += vetor[i];
            }

            if(n <= i){
                break;
            }
        }
        return temp;
    }

    public static void mergeSort(int[] array, int[] temp, int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim) / 2;
            mergeSort(array, temp, inicio, meio);
            mergeSort(array, temp, meio + 1, fim);
            merge(array,temp,inicio,meio,fim);
        }
    }

    public static void sort(int[]array){
        if(array == null || array.length <2) return;
        int temp[] = new int[array.length];
        mergeSort(array, temp, 0, array.length -1);
    }

    public static void merge (int[] array, int[] temp, int inicio, int meio, int fim){
        for (int i = inicio; i <= fim; i++) {
            temp[i] = array[i];
        }

        int i = inicio;
        int j = meio+1;
        int k = inicio;

        while(i <=meio && j <= fim){
            if(temp[i] <= temp[j]){
                array[k++] = temp[i++];
            } else{
                array[k++] = temp[j++];
            }
        }

        while(i <=meio){
            array[k++] = temp[i++];
        }
    }

}
