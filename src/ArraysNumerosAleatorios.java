import java.util.Random;

public class ArraysNumerosAleatorios {

    /* Exercício 3:
     * Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
     * Ao final mostre os números e seus sucessores. 
     */
    public static void main(String[] args) {
        //Random gerará números aleatórios:
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i=0; i<numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;             
        }

        System.out.println("Numeros Aleatórios:\t");
        for (int numero : numerosAleatorios) {
            System.out.println("Numero Aleatório: "+numero+ " Sucessor: " + (numero+1));
        }

    }
}
