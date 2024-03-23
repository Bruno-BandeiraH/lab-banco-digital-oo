public abstract class Conta implements IConta{

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    // GETTERS AND SETTERS
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // METHODS
    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println(String.format("seu saldo é: %.2f", this.saldo));
    }
   
}
