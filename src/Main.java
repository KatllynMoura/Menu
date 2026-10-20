import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bank = new Scanner(System.in);
        String name;
        name = "Katllyn";
        Double saldo = 2750.00;

        String mensage =    """
                            Olá, %s! Como posso te ajudar hoje? 
                            Selecione uma das operações para podermos da incio ao atendimento:
                            1. Acessar saldo de conta.                      
                            2. Transferir.
                            3. Receber.
                            4. Encerrar atendimento.
                            
                            Qual opção gostaria de seguir?
                                         """.formatted(name);
        System.out.println(mensage);
        int action = bank.nextInt();

        String option = """
                Qual operação deseja executar?
                  1. Acessar saldo de conta.
                  2. Transferir.
                  3. Receber.
                  4. Encerrar atendimento.
                """;

        while (action != 4) {

            if (action == 1) {
                System.out.println("Seu saldo atual é R$ " + String.format("%.2f", saldo));
            }
             else if (action == 2) {
                System.out.println("Qual o valor a ser transferido?");
                int transfer = bank.nextInt();
                    while (saldo < transfer) {
                        System.out.println("Saldo insuficiente para transferir. Tente outro valor menor que seja menor ou igual a R$ " + saldo);
                        transfer = bank.nextInt();
                    }
                    System.out.println("O valor a ser transferido será de R$ " + transfer +
                                " O saldo atual agora é de R$ " + (saldo - transfer));
                    saldo = saldo - transfer;
            }
             else if (action == 3) {
                System.out.println("Qual o valor a ser recebido?");
                int receive = bank.nextInt();
                System.out.println("O valor a ser recebido será de R$ " + receive +
                        " O saldo atual agora é de R$ " + (saldo + receive));
                saldo = saldo + receive;
            }
             else {
                 System.out.println("Desculpe, opção inválida. Tente novamente.");
            }
             System.out.println(option);
            action = bank.nextInt();
        }
        System.out.println("Encerrando atendimento, um ótimo dia %s!".formatted(name));
    }

}




