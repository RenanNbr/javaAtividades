import java.util.Scanner;

public class ABC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//     Lendo os valores de A, B e C

        System.out.print("Digite o valor de A:");
        int A = sc.nextInt();

        System.out.print("Digite o valor de B:");
        int B = sc.nextInt();

        System.out.print("Digite o valor de C:");
        int C = sc.nextInt();


//        Verificando se a soma de A + B é menor que C
        if (A + B < C){
            System.out.println("A soma de A + B e menor que C");
        }else {
            System.out.println("A soma de A + B nao e 'menor que C");
        }
        sc.close();
    }
}