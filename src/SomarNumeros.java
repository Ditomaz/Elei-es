import java.util.Scanner;
public class SomarNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, soma= 0;

        System.out.println("Digite o numero 1 :");
        numero = leitor.nextInt();
        soma = soma + numero;

        System.out.println("Digite o numero 2 :");
        numero = leitor.nextInt();
        soma = soma + numero;

        System.out.println("Digite o numero 3 :");
        numero = leitor.nextInt();
        soma = soma + numero;

        System.out.println("Digite o numero 4 :");
        numero = leitor.nextInt();
        soma = soma + numero;

        System.out.println("A soma dos numeros e igual a: " + soma);

    }
}