import java.util.Scanner;
public class SomarComFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, soma= 0, quantidade=1, total;


        System.out.println("Por gentileza digite a quantidade de numeros que voce deseja somar: ");
        total  = leitor.nextInt();

        for(quantidade = 1; quantidade<=total; quantidade++)
        {

            System.out.println("Informe o " + quantidade + "º numero : ");
            numero = leitor.nextInt();
            soma = soma + numero;

        }
        System.out.println("A soma dos numeros e igual a: " + soma);

    }
}