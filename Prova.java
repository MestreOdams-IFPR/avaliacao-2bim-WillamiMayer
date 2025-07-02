public class Prova{
    public static void main(String[] args) {
        tribonacci(5);
    }

    public static int tribonacci(int n){
        int num = 0;
        int[] vetor = new int[n + 1];

        for (int i = 0; i < vetor.length; i++) {
            if(n <= 1){
                return 0;
            } else if(n == 2){
                return 1;
            } else{
                
                num = tribonacci((vetor[n - 1]) + (vetor[n - 2]) + (vetor[n - 3]) );
                System.out.println(num);
                n--;
            }
        }
        return num;
    }

    public static int pell(int[] n){
        int num = 0;
        
        int fim = n.length -1;

        for (int i = 0; i < n.length; i++) {
            if(n[fim] < 1){
                return 0;
            } else if(n[fim] == 1){
                return 1;
            } else{
                
                
                System.out.println(num);
                fim--;
            }
        }
        return num;
    }

    //as de string eu só não tive tempo, fiquei um tempo preso nessa
    //A tribonacci e a pell ficaram incompletas, eu até entendi a lógica da tribonacci só que não soube aplicar, a pell só foi triste
}