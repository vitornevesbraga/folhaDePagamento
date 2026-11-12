import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        System.out.println("==== MENU ====");
        System.out.println(" 1 - Cadastrar Colaborador Padrão");
        System.out.println(" 2 - Cadastrar Colaborador Comissionado");
        System.out.println(" 3 - Cadastrar Colaborador Produção");
        System.out.println(" 4 - Gerar Folha de Pagamento");
        System.out.println(" 5 - Exibir Resumo da Folha");
        System.out.println(" 0 - Sair do Programa");

        System.out.println("Selecione uma opção");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Teste - cadastrar colaborador padrão");
                break;
            case 2:
                System.out.println("Teste - cadastrar colaborador comissionado");
                break;
            case 3:
                System.out.println("Teste - cadastrar colaborador produção");
                break;
            case 4:
                System.out.println("Teste - gerar folha de pagamento");
                break;
            case 5:
                System.out.println("Teste - exibir resumo da folha");
                break;
            case 0:
                System.out.println("Saiu do programa");
            default:
                System.out.println("Informe uma opção informada no menu");
        }
    }
}