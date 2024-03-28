package model;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacarValor(float valor) {
        if(valor > this.saldo){
            System.out.println("Não é possivel realizar um saque.");
        }else {
            this.saldo -= valor;
            System.out.println("Saque bem sucedido! Novo saldo: "+ getSaldo());
        }
    }

    public void depositarValor(float valor) {
        this.saldo += valor;
        System.out.println("Depósito bem sucedido! Novo saldo: "+ getSaldo());
    }
}
