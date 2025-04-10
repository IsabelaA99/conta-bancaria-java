import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuário:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.next();

        float saldo = 0;

        System.out.println("Olá " + nomeCliente + " obrigado(a) por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "R$ já está disponível para saque.");
        

        System.out.println("Deseja solicitar um serviço? Digite: ");
        System.out.println("1 -  NÃO QUERO SOLICITAR UM SERVIÇO");
        System.out.println("2 -  SAQUE");
        System.out.println("3 -  DEPOSITO");
        System.out.println("4 -  CONSULTA DE SALDO");
        System.out.println("5 -  EMPRESTIMO");

        int numeroServico = scanner.nextInt();

        switch (numeroServico) {
            case 1:
                System.out.println("Atendimento concluído");
            break;
            
            case 2:
                System.out.println("Digite o valor do saque:");
                float valorSaque = scanner.nextFloat();
                
                if (valorSaque> saldo) {
                    System.out.println("Erro, valor do saque maior que o saldo!");
                }else{
                    saldo = saldo - valorSaque;
                }System.out.println("Seu saldo é: " + saldo + "R$");
                break;

            case 3:
                System.out.println("Digite o valor do depósito:");
                float valorDeposito = scanner.nextFloat();
                if (valorDeposito< 0) {
                    System.out.println("Erro, número inválido!");
                }else{
                    saldo = saldo + valorDeposito;
                }System.out.println("Seu saldo é: " + saldo + "R$");
                break;

            case 4:
                System.out.println("Seu saldo: " + saldo + "R$");
                break;
            
            case 5:
                System.out.println("Obrigada pela preferência, iremos repassar o atendimento para um vendedor.");

            default:
                break;
        }
        
    }
    
}
