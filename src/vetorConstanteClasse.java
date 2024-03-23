import java.util.Scanner;
public class vetorConstanteClasse {
    public static final int qtdNumeros = 3;
    public static void main(String[] args)
    {

        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[qtdNumeros];
        int ind;
        double maiorNumero=-999999999, media=0;
        String nomeUsuario;

        System.out.println("Digite o nome seu nome por gentileza: ") ;
        nomeUsuario =leitor.nextLine();

        for(ind=0; ind < vetor.length; ind++)
        {
            System.out.println("Digite o " + (ind+1) + "º numero: ");
            vetor[ind] = leitor.nextInt();
            if(maiorNumero < vetor[ind])
                maiorNumero=vetor[ind];
            media=media+vetor[ind];

        }

        System.out.println(
                "**********************************************************\n" +
                        "A media dos numeros digitados é: " +(media/qtdNumeros)+ "\n"+
                        "O maior numero digitado foi o : " + (maiorNumero) +"\n" +
                        "A Soma dos numeros é igual a :" +media+ "\n" +
                        "**********************************************************\n" +
                        " TENHA UMA OTIMA NOITE "+nomeUsuario);

    }
}