package br.com.Felype.atividade02;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.cor = "Preto";
        carro1.ano = 2000;
        carro1.marca = "Toyota";
        carro1.velocidadeAtual = 25;
        carro1.modelo="Corolla";

        carro1.imprimirDetalhes();
        carro1.acelerar();
        carro1.frear();
    }
}
