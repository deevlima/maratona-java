import java.util.Scanner;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        System.out.println("Digite seu nome");
        String nome = userInput.nextLine();


        System.out.println("Digite seu endereco");
        String endereco = userInput.nextLine();

        System.out.println("Digite seu salario");
        double saldo = userInput.nextDouble();

        System.out.println("Digite a data que recebeu seu ultimo pagamento");
        String data = userInput.next();

        System.out.println("Eu, " + nome + " morando no endereco " + endereco + " confirmo que recebi o salario de  " + saldo + "$, na data  " + data);
    }
}
