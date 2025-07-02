import java.util.Scanner;

public class Cristais {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int N = teclado.nextInt();
        int Q = teclado.nextInt();
        cristaits(N, Q);
    }

    public static void cristaits(int N, int Q){
        int[] vetor = new int[N];
        int i = 0;
        int temp = 0;
        int num = teclado.nextInt();
        vetor[i] = num;
        while(true){
            vetor[i] = num;
            temp = buscaBinaria(vetor, Q);
            i++;
            if(temp == Q){
                System.out.println("CASE# " + i + ":");
                System.out.println(Q +"found at "+ vetor[i]);
            }else{
                System.out.println(Q +"not found");
            }

            if(N == 0 && Q == 0){
                break;
            }
            
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
