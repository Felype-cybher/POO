package br.com.Felype.atividade01;

public class AnimalDeEstimacao {
    public String nome;
    public String tipo;
    public int idade;
    public String raca;

    public AnimalDeEstimacao(){
        System.out.println("Instanciando um objeto");
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.raca = raca;
    }


    public void status(){
        System.out.println("Nome do Animal: "+this.nome);
        System.out.println("Raça do Animal: "+this.raca);
        System.out.println("Tipo de Animal: "+this.tipo);
        System.out.println("Idade do Animal: "+this.idade);
    }
    public void emitirSom(){
        if (this.tipo== "Cachorro"){
            System.out.println("AU AU");    
        } else if (this.tipo== "Gato") {
            System.out.println("Miau Miau");
        } else if (this.tipo=="Passaro") {
            System.out.println("Piu Piu");
        }else {
            System.out.println(this.tipo+" faz algum som");
        }

    }
}
