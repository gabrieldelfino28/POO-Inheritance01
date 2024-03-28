package model;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacarValor(float valor) {
       if(valor > getSaldo() + limite){
           System.out.println("Não é possivel realizar um saque.");
       }else {
           setSaldo(getSaldo() - valor);
           System.out.println("Saque bem sucedido! Novo saldo: "+ getSaldo());
       }
    }
}
