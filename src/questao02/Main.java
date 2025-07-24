package questao02;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Velar", "Azul");
        Carro c2 = new Carro("Opala", "Preto");
        Carro c3 = new Carro("Fusca", "Azul");

        System.out.println("CARRO 1");
        System.out.println("COR: " + c1.cor);
        System.out.println("MODELO: " + c1.modelo);

        System.out.println("\nCARRO 2");
        System.out.println("COR: " + c2.cor);
        System.out.println("MODELO: " + c2.modelo);

        System.out.println("\nCARRO 3");
        System.out.println("COR: " + c3.cor);
        System.out.println("MODELO: " + c3.modelo);

        System.out.println("\n\nTOTAL DE CARROS: " + Carro.retornaTotalDeCarros());
    }
}