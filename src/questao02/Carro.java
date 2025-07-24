package questao02;

public class Carro {
    private String modelo;
    private String cor;
    private static int totalDeCarros = 0;

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        totalDeCarros++;
    }

    public static int retornaTotalDeCarros(){
        return totalDeCarros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static int getTotalDeCarros() {
        return totalDeCarros;
    }

    public static void setTotalDeCarros(int totalDeCarros) {
        Carro.totalDeCarros = totalDeCarros;
    }
}
