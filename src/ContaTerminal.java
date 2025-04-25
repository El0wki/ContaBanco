public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        saudação();
        System.out.print("Por favor, digite seu nome completo: ");
        String nomeCliente = System.console().readLine();
        gerarMensagem("número", "agência");
        String agenciaCliente = System.console().readLine();
       gerarMensagem("número", "conta");
        String numeroContaCliente = System.console().readLine();
       gerarMensagem("saldo", "conta");
        double saldoCliente = Double.parseDouble(System.console().readLine());
        System.out.print(retornarDadosCliente(nomeCliente, agenciaCliente, numeroContaCliente, saldoCliente));
    }

    public static void saudação(){
        System.out.print("Olá! Seja bem-vindo ao projeto Banco Digital do bootcamp Java Cloud Nativa da DIO! ");
    }
    public static void gerarMensagem(String parametro1, String parametro2) {
        System.out.print("Por favor, digite o " + parametro1 + " da " + parametro2 + ": ");
    }

    public static String retornarDadosCliente(String nome, String agencia, String numeroConta, double saldoConta) {
         return String.format("Olá %1s, sua agência é %s, conta %s e seu saldo R$%.2f já está disponível para saque.", nome, agencia, numeroConta, saldoConta);
}

}
    
