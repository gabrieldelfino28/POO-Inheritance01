package view;

import model.ContaEspecial;
import model.ContaPoupança;

public class Contas {

    public static void main(String[] args) {
        ContaPoupança cp = new ContaPoupança();
        ContaEspecial ce = new ContaEspecial();

        cp.setCliente("Claudio");
        cp.setSaldo(5000f);
        cp.setNumConta(12390);
        cp.setDiaRendimento(23);

        ce.setCliente("Renan");
        ce.setSaldo(1500f);
        ce.setNumConta(12390);
        ce.setLimite(2000);

        cp.sacarValor(200);
        ce.sacarValor(500);
        ce.sacarValor(3000);

        cp.depositarValor(200);
        ce.depositarValor(100);
        ce.sacarValor(150);

        cp.calcularNovoSaldo();

        System.out.println("Conta Poupança -> " + cp.getCliente() + ";" + cp.getNumConta() + ";" + cp.getSaldo()  + ";" + cp.getDiaRendimento());
        System.out.println("Conta Especial -> " +ce.getCliente() + ";" + ce.getNumConta() + ";" + ce.getSaldo() + ";" + ce.getLimite());
    }
}
