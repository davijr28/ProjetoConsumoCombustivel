package model;

public class Veiculo {

    private double distancia;
    private double combustivel;

    public Veiculo() {
        this(0,0);
    }

    public Veiculo(double distancia, double combustivel) {
        this.distancia = distancia;
        this.combustivel = combustivel;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumo() {
        return (getDistancia()/getCombustivel());
    }
}
