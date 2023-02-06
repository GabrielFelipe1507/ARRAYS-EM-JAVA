import java.util.Random;

public class ArraysMultidimencionais {

    /*Exercício 4:
     * Gere e imprima uma matriz M 4X4 com valores aleatórios entre 0-9.
     */
    public static void main(String[] args) {
        Random random = new Random();
        // podemos citar o exemplo de uma matriz 4 X 4: 4 linhas e 4 colunas
        int[][] M = new int[4][4];

        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[i].length; j++){
                //aqui os numeros aleatórios sorteados serão postos dentro desta matriz(M):
                M[i][j]=random.nextInt(9);
            }
        }

        System.out.println("MATRIZ A SEGUIR:");

        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");                
            }
            System.out.println();
        }  
      
    }
}
