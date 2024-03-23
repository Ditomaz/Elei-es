import java.util.Scanner;

public class DecisaoSimples
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Por gentileza, digite a sua idade!");
        idade =leitor.nextInt();

        //Decisao simples so executa o lado verdadeiro
        if (idade < 16)
            System.out.println("Voce ainda nao pode votar, idade minima 16 anos");
        else if (idade >= 18)
        {
              System.out.println("Voce deve votar - Obrigatorio");
        }
        else
        {
              System.out.println("Voce pode votar mas nao é obrigatorio");
        }

        if (idade < 12)
        {
            System.out.println("Voce ainda nao pode jogar, idade minima 12 anos");
            System.out.println("Este jogo nao é recomendado por conta da violencia");
            leitor.close();
        }

    }
}
