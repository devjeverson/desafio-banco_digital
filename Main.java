public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Cliente jeverson = new Cliente();
        jeverson.setNome("Jeverson");

        Conta cc = new ContaCorrente(jeverson);
        Conta poupanca = new ContaPoupanca(jeverson);


        cc.depositar(100);
        cc.transfeir(50, poupanca);
        poupanca.render(1.01);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }



}