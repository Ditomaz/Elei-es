import java.util.Scanner;

public class calculadoraWhile {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int op = 0, resultado = 0;
        op=1;

        System.out.println("Calculadora\n1 - Soma\n2 - Subtração\n3 - multiplicacao\n4 - divisao\n5 - sair");
        op = leitor.nextInt();

        while (op != 5)
        {

            System.out.println("Digite um valor: ");
            int v1 = leitor.nextInt();
            System.out.println("Digite um segundo valor: ");
            int v2 = leitor.nextInt();

           switch(op)
            {
               case 1: resultado = v1 + v2; System.out.println("Resultado = "  + resultado);break;
               case 2: resultado = v1 - v2; System.out.println("Resultado = "  + resultado);break;
               case 3: resultado = v1 * v2; System.out.println("Resultado = "  + resultado);break;
               case 4: resultado = v1 / v2; System.out.println("Resultado = "  + resultado);break;

            }

            System.out.println("Calculadora\n1 - Soma\n2 - Subtração\n3 - multiplicacao\n4 - divisao\n5 - sair");
            op = leitor.nextInt();

        }

    }}
