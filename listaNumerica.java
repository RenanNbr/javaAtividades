import java.util.Scanner;

public class listaNumerica {
    /**
     *Esta função é responsavel por fazer a impressão dos numero na horrizontal e na verticl
     */
    public static void main(String[] arg){
        for (int i = 0; i < 21; i ++){
            System.out.println(i + " ");
        }

        for (int i = 0; i < 21; i ++){
            System.out.printf(i + " ");
        }




//progama que faz verifica qual número é maior
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Preencha todos 5 número com valores interiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maiorNumero = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        System.out.println("O maior número digitado por você foi: " + maiorNumero);

//     Calculando a média desse número e soma de todos eles

        int soma = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
        System.out.println("A somatoria de todos os números é:" + soma);

        float media;
        media = soma/numeros.length;
        System.out.println("Média de todo os números corresponde a:" + media);


//        Progama que exibe todos números ímpares ente 0 e 50
        System.out.println("Estes são todos o números ímpares existentes entre 0 e 50");
        for (int i = 0; i < 51; i ++){

            if (i % 2 == 1){
                System.out.print(i + "");
            }else {
                System.out.print(" - ");
            }
        }

    }

}