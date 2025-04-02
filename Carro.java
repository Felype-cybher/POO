package br.com.Felype.atividade02;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public float velocidadeAtual;

    public Carro() {
        System.out.println("Instanciando um objeto");
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0;
    }

    public void imprimirDetalhes(){
        System.out.println("Marca do Carro: "+this.marca);
        System.out.println("Modelo do Carro: "+this.modelo);
        System.out.println("Ano do Carro: "+this.ano);
        System.out.println("Cor do Carro: "+this.cor);
        System.out.println("Velocidade atual do Carro: "+this.velocidadeAtual);
    }

    public void acelerar(){
        if (velocidadeAtual>=20){
            System.out.println("Carro acelerando");
        }
    }

    public void frear(){
        if (velocidadeAtual>=100){
            System.out.println("Carro freando");
        }
    }
}
