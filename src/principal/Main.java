package principal;

import java.util.Scanner;
import entidade.Clt;
import entidade.PJ;
import entidade.Funcionario;
import entidade.Cargo;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos começar. Digite o nome do funcionario: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionario: ");
        double salario = scanner.nextDouble();

        System.out.println("Qual o cargo do funcionario? ");
        System.out.println("1 - DEV");
        System.out.println("2 - CONTADOR");
        System.out.println("3 - PROFESSOR");
        Cargo cargo = Cargo.values()[scanner.nextInt() - 1];

        System.out.println("Qual o tipo de Funcionario? ");
        System.out.println("1 - Pj");
        System.out.println("2 - Clt");
        int tipo = scanner.nextInt();

        Funcionario funcionario = null;

        switch (tipo) {
            case 1:
                System.out.println("Qual o valor adicional? ");
                double adicional = scanner.nextDouble();
                funcionario = new PJ(nome, salario, cargo, adicional);
                break;

            case 2:
                System.out.println("Digite o valor do convênio: ");
                double convenio = scanner.nextDouble();
                funcionario = new Clt(nome, salario, cargo, convenio);
                break;

            default:
                System.out.println("Tipo de funcionário inválido.");
                break;
        }

        if (funcionario != null) {
            System.out.println(funcionario);
        }

        scanner.close();
    }
}
