package model;

public class ContaPoupança extends ContaBancaria {
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        if (diaRendimento < 1) {
            this.diaRendimento = 1;
        } else if (diaRendimento > 31) {
            this.diaRendimento = 31;
        } else {
            this.diaRendimento = diaRendimento;
        }
    }

    public void calcularNovoSaldo() {
        float taxaRendimento = (float) diaRendimento / 100;
        setSaldo(getSaldo() + (getSaldo() * taxaRendimento));
        System.out.println("Novo Saldo após Rendimento: "+getSaldo());
    }
}
