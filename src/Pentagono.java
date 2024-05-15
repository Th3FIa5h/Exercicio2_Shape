public class Pentagono {
    private double lado;
    private double apotema;

    public Pentagono(String nome, double lado, double apotema) {
        super();
        this.lado = lado;
        this.apotema =apotema;
    }

    public double calcularArea() {
        return (lado * 5) * apotema;
    }

    public double calcularPerimetro() {
        return 5 * lado;
    }
}
