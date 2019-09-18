package com.company;

public class ContaCorrente {
	int numero;
	String titular;
	double saldo;
	String dataDeAbertura;
	String agencia;
	double calculaRendimento;
	
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
				return true;
	    }
	}
	
	boolean deposita(double valor) {
		if (valor >= 0) {
			this.saldo = this.saldo + valor;
		}
		else{
			
		}
		return false;
	}
	double calculaRendimento() {
        return saldo = saldo + (0.01*  saldo)-saldo;
	}
	String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgencia:" + this.agencia;
        dados += "\nData de abertura da conta: " + this.dataDeAbertura;
        dados += "\nSaldo:" + this.saldo;
        dados += "\nRendimento:" + this.calculaRendimento;
        return dados;
    }
}