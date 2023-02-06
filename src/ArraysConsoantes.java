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
        int qtdConsoantes =0;

        int cont = 0;

        do {
            System.out.println("Digite as Letras:\t");
            String letra = leitura.next();
        //com o equalsIgnoreCase eu consigo 
            if(!letra.equalsIgnoreCase("a")){
                if(! letra.equalsIgnoreCase("e")){
                    if(!letra.equalsIgnoreCase("i")){
                        if(!letra.equalsIgnoreCase("o")){
                            if(!letra.equalsIgnoreCase("u")){
                                consoantes[cont] = letra;
                                qtdConsoantes++;
                                
                                System.out.println("Consoante:\t" + letra);
                            }
                        }
                    }
                 }
            }
            cont++;          

        } while (cont < consoantes.length);

        System.out.println("Quantidade de Consoantes:\t" + qtdConsoantes);
    }


}