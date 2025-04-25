public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String saudação = "Olá! Seja bem-vindo ao projeto Banco Digital do bootcamp Java Cloud Nativa da DIO!";
        System.out.println(saudação + "Por favor, digite seu nome completo:");
        String nomeCliente = System.console().readLine();
        System.out.println("Por favor, digite o número da agência:");
        String agenciaCliente = System.console().readLine();
        System.out.println("Por favor, digite o número da conta:");
        String numeroContaCliente = System.console().readLine();
        System.out.println("Por favor, digite o saldo da conta:");
        double saldoCliente = Double.parseDouble(System.console().readLine());
        System.out.print(retornarDadosCliente(nomeCliente, agenciaCliente, numeroContaCliente, saldoCliente));
    }


    public static String retornarDadosCliente(String nome, String agencia, String numeroConta, double saldoConta) {
         return String.format("Olá %1s, sua agência é %s, conta %s e seu saldo R$%.2f já está disponível para saque.", nome, agencia, numeroConta, saldoConta);
}

}
    
