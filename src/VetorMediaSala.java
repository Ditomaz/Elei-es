import java.util.Scanner;
public class VetorMediaSala {
    public static void main(String[] args)
    {

        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[5];
        double[] notas = {0, 0, 0, 0, 0};
        int ind;
        int seq=1;
        double total=0;
        String nomeAluno;

            System.out.println("Digite o nome do(a) aluno(a), nome por gentileza: ") ;
            nomeAluno =leitor.nextLine();

            for(ind=0; ind <= 4; ind++)
            {
                System.out.println("Digite a " + seq + "º Nota do(a) " +nomeAluno+":");
                vetor[ind] = leitor.nextInt();
                total += vetor[ind];
                seq++;

            }

            System.out.println("**********************************************************\nA media do(a) aluno(a) " +nomeAluno+
                    " é : " + (total/5) +"\n**********************************************************");

    }
}