package questao02;

public class Carro {
    String modelo;
    String cor;
    static int totalDeCarros = 0;

    Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        totalDeCarros++;
    }

    static int retornaTotalDeCarros(){
        return totalDeCarros;
    }
}
