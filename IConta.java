public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transfeir(double valor, Conta contaDestino);

    void render(double valor);

    void imprimirExtrato();


}
