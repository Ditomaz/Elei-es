import java.util.Scanner;

public class Login
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        String user, password, token;
        System.out.println("Por gentileza, informe seu usuario!");
        user =leitor.nextLine();

        System.out.println("Por gentileza, digite sua senha");
        password =leitor.nextLine();

        System.out.println("Por gentileza, digite seu token");
        token =leitor.nextLine();

        if (user.equalsIgnoreCase("admin") && password.equals("admin123") && token.equals("123"))
        {
            System.out.println("Administrador seja bem vindo ao sistema FIAP");
        }else
            System.out.println("Operador seja bem vindo ao sistema FIAP");
    }
}
