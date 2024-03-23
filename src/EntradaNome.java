import java.util.Scanner;

public class EntradaNome {
   public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       System.out.println("Digite seu nome por gentileza: ") ;
       //declarar uma variavel
       //tipo nomeVariavel
       String nomeAluno;
       //entrada de dados
       nomeAluno = leitor.nextLine();
       System.out.println("Boa Noite, " + nomeAluno) ;

       byte quantidadeDeFilhos = leitor.nextByte();

   }
}
