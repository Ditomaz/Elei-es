import java.util.Scanner;
public class Eleicoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, soma= 0, quantidade=1, total=1, cand1=0, cand2=0, cand3=0, candnulo=0, totalvotos=0;
        double cand1porcen=0, cand2porcen=0, cand3porcen=0, candnuloporcen=0;

        do
        {

            System.out.println("Por gentileza digite em qual candidato deseja votar:˜/n" +
                    "\n 1 - ENEAS\n 2 - Brizola\n 3 - Itamar Franco\n 0 - Para Sair e Finalizar Apuracao");
            total  = leitor.nextInt();

            switch(total)
            {
                case 1: cand1 = cand1+1 ;break;
                case 2: cand2 = cand2+1 ;break;
                case 3: cand3 = cand3+1 ;break;
                case 0: System.out.println("Votacao Finalizada!!"); break;
                default: candnulo = candnulo+1 ;break;

            }


        }while (total != 0);

        totalvotos = cand1 + cand2 + cand3 + candnulo;
        cand1porcen = (double) (100*cand1)/totalvotos ;
        cand2porcen = (double) (100*cand2)/totalvotos ;
        cand3porcen = (double) (100*cand3)/totalvotos ;
        candnuloporcen = (double) (100*candnulo)/totalvotos ;

        System.out.println("Total de votos : " + totalvotos);
        System.out.println("Porcentagem de dados candidatos: " +
                "\nEneas - " + cand1porcen +
                "\nBrizola - " + cand2porcen +
                "\nItamar Franco - " + cand3porcen +
                "\nNulos e brancos: " + candnuloporcen);

    }
}