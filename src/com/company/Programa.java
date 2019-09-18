package com.company;

public class Programa {

	public static void main(String[] args) {
		
		ContaCorrente C1 = new ContaCorrente();

		C1.titular = "Murillo";
		C1.numero = 123456;
        C1.agencia = "45678-9";
        C1.saldo = 1000.0;
        C1.dataDeAbertura = "02/09/2019";
        System.out.println(C1.recuperaDadosParaImpressao());

        C1.deposita(100.0);
        System.out.println("saldo atual:" + C1.saldo);
        System.out.println("rendimento mensal:" + C1.calculaRendimento());
        
        ContaCorrente C2 = new ContaCorrente();        
        C2.titular = "Danilo";
        C2.saldo = 100;

        ContaCorrente C3 = new ContaCorrente();        
        C3.titular = "Danilo";
        C3.saldo = 100;
        
        if (C2 == C3) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");        
        }
        
    }
}