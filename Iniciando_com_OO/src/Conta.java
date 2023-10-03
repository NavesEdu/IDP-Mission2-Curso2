public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é: "+ Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Criando uma nova conta");
    }

    public void deposita (double valor){
        this.saldo += valor;
        System.out.println(saldo);
    }

    public boolean saca (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean transfere (double valor, Conta destino){
        if(this.saldo >= valor){
            //this.saldo -= valor;
            saca(valor);
            destino.deposita(valor);
            System.out.println(saldo);
            return true;
        }else {
            return false;
        }
    }

    public double getsaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        if (novoNumero <= 0){
            System.out.println("erro");
            return;
        }
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("erro");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }
}
