package br.com.Felype.atividade02;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setAno(2003);
        carro1.setCor("Preto");
        carro1.setModelo("Corolla");
        carro1.setVelocidadeAtual(25);

        carro1.imprimirDetalhes();
        carro1.acelerar();
        carro1.frear();
    }
}
