import java.util.Scanner;

public class ArraysConsoantes {

    /*Exercício 2:
     * Faça um Programa que leia um vetor de 6 caracteres,
     * e diga quantas consoantes foram lidas.
     * Imprima as consoantes.
     */

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite as Letras:\t");
            String letra = leitura.next();
            if (!letra.equalsIgnoreCase("a") && !letra.equalsIgnoreCase("e") && !letra.equalsIgnoreCase("i")
                    && !letra.equalsIgnoreCase("o") && !letra.equalsIgnoreCase("u"))  {
                consoantes[qtdConsoantes] = letra;
                qtdConsoantes++;
            }
        }

        System.out.println("Quantidade de Consoantes:\t" + qtdConsoantes);

        //agora aqui utilizarei um for each que só imprimirá as consoantes
        System.out.println("Consoantes:");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }

    }


}
