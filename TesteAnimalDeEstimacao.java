package br.com.Felype.atividade01;

public class TesteAnimalDeEstimacao {
    public static void main(String[] args) {
        AnimalDeEstimacao Animal1 = new AnimalDeEstimacao();
        Animal1.nome = "Bob";
        Animal1.idade = 2;
        Animal1.raca = "Pitbull";
        Animal1.tipo = "Cachorro";

        Animal1.status();
        Animal1.emitirSom();
    }
}
