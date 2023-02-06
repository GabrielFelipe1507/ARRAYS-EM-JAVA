public class ArraysOrdemInversa {
    public static void main(String[] args) throws Exception {

        /* Exercicio 1:
         * Crie um Vetor de 6 numeros inteiros
         * e mostre - os na ordem inversa;
         */
        // declaração do vetor unidimensional em Java
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int count = 0;

        System.out.println("Tamanho do meu Vetor:\t" + vetor.length);
        
        while(count < (vetor.length)){
            System.out.println("Valor da Posição "+ count + " " + "do Vetor:\t" + vetor[count]);
            count++;
        }
        
        System.out.println("\nVetor de Ordem Inversa:");
        for(int i = (vetor.length-1); i >= 0; i--){
   
            System.out.println("Valor da Posição "+ i + " " + "do Vetor Invertido:\t" + vetor[i]);
        }

    }
}
