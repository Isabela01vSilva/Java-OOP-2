public class ContaBancaria {
    protected double saldo = 2500;

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque no valor: R$" + valor + " realizado. Saldo Atual: R$" + saldo);
        }else {
            System.out.println("Saldo insuficiente para saque");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo Atual: R$" + saldo);
    }
}
