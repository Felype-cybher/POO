package br.com.Felype.atividade01;

public class TesteAnimalDeEstimacao {
    public static void main(String[] args) {
        AnimalDeEstimacao Animal1 = new AnimalDeEstimacao();

        Animal1.setNome("Bob");
        Animal1.setIdade(2);
        Animal1.setRaca("Pitbull");
        Animal1.setTipo("Cachorro");

        Animal1.status();
        Animal1.emitirSom();
    }
}
