import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Solicite a placa do carro ex: GBP 2584
        //Verifique e informa o dia do rodizio
        //1-2 segunda 3-4 terca 5-6 quarta 7-8 quinta 9-0 sexta
        int placa, digito;
        System.out.println("Digite a placa do seu veiculo: ");
        placa = leitor.nextInt();
        digito = placa % 10;

        switch (digito) {
            case 1:
            case 2:
                System.out.println("Rodizio de segunda-feira");
                break;
            case 3:
            case 4:
                System.out.println("Rodizio de terca-feira");
                break;
            case 5:
            case 6:
                System.out.println("Rodizio de quarta-feira");
            case 7:
            case 8:
                System.out.println("Rodizio de quinta-feira");
                break;
            case 9:
            case 0:
                System.out.println("Rodizio de quinta-feira");
                break;
            default:
                System.out.println("Rodizio de sexta-feira");
                break;
        }
    }
}

