import java.util.Scanner;

public class DecisaoEncadeada
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Por gentileza, digite a sua idade!");
        idade =leitor.nextInt();

        //Decisao simples so executa o lado verdadeiro
        if (idade >= 16){
            System.out.println("Voce ja pode votar");
        }else
            System.out.println("Voce ainda nao pode votar");
    
        if (idade < 12)
        {
            System.out.println("Voce ainda nao pode jogar, idade minima 12 anos");
            System.out.println("Este jogo nao é recomendado por conta da violencia");
        }
        else
        {
            System.out.println("Voce ja pode jogar, idade maior que a idade minima 12 anos");
            System.out.println("Advertimos que esse jogo possui cenas de da violencia");
        }

    }
}
