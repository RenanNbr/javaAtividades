import java.util.Scanner;

public class Equacao{
    //    Função para calcular o delta
    public static double calcularDelta(double a, double b, double c){
        return (b*b) - (4 * a * c);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        Lendo o valor de 'a'
        System.out.print("Digite o valor de A:");
        double a = sc.nextDouble();

//        Verificação se 'a' é igual a zero
        if (a == 0){
            System.out.println("A equação nao e do segundo grau.");
            return;
        }

//        Lendo os valores de 'b' e 'c'
        System.out.print("Digite o valor de B:");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de C:");
        double c = sc.nextDouble();

//        Calculando o delta
        double delta = calcularDelta(a, b, c);
        System.out.println("O delta calculado:" +delta);

//        Verificação do valor do delta
        if (delta < 0){
            System.out.println("A equaçao não possui raizes reais.");
        } else if (delta == 0) {
            double raizUnica = -b/(2*a);
            System.out.println("A equaçao possui apenas um raiz real:"+raizUnica);
        }else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raizes reais:");
            System.out.println("A primeira raiz;" + raiz1);
            System.out.println("A segunda raiz;"+ raiz2);
        }
        sc.close();
    }
}