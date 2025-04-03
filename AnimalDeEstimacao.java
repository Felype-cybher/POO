package br.com.Felype.atividade01;

public class AnimalDeEstimacao {
    private String nome;
    private String tipo;
    private int idade;
    private String raca;

    public AnimalDeEstimacao() {
        System.out.println("Instanciando um objeto");
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRaca(String raca) {
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
