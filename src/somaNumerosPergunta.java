import java.util.Scanner;
public class somaNumerosPergunta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, soma= 0, quantidade=1, total;
        String continuar = "N";

        do
        {

            System.out.println("Por gentileza digite a quantidade de numeros que voce deseja somar: ");
            total  = leitor.nextInt();


            while (quantidade <=total){
                System.out.println("Informe o " + quantidade + "º numero : ");
                numero = leitor.nextInt();
                soma = soma + numero;
                quantidade++;
                //quantidade = quantidade+1;
            }
            System.out.println("A soma dos numeros e igual a: " + soma);
            System.out.println("Quer efetuar mais uma soma? Digite [S] - Sim e [N] para Nao ");
            continuar = leitor.nextLine();

        } while (continuar.equalsIgnoreCase("S"));
    }
}