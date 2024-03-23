import java.util.Scanner;

public class DescontoOperadorOu
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        double valorTotalCompra, desconto, valorFinal;
        String cupom;
        desconto=0;
        valorFinal=0;

        System.out.println("Informe o valor total da compra!!");
        valorTotalCompra =leitor.nextDouble();

        System.out.println("Informe o cupom!!");
        cupom =leitor.nextLine();

        if (valorTotalCompra >= 1000 || cupom.equals("DESCONTO20"))
        {
            desconto = valorTotalCompra * 0.2;
            valorFinal = valorTotalCompra - desconto;
        }

        System.out.println("\nCupom FISCAL"+
                           "\nValor Total da Compra: " + valorTotalCompra +
                           "\nDesconto compra : " + desconto +
                           "\nValor Final Compra: " + valorFinal);
    }
}
