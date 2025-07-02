public class ColaOficial {
    public static void main(String[] args) {
        
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

    public static int buscaBinaria(int[]vetor, int valor){
        int inicio = 0;
        int fim = vetor.length - 1;
        
        while(inicio <= fim){
            int meio = (inicio+fim) / 2;

            if(vetor[meio] == valor){
                return meio;
            }else if(vetor[meio] < valor){
                inicio = meio + 1;
            }else{
                fim = meio -1;
            }
        }
        return -1;
    }
}

