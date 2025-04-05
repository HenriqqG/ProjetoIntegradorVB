public class SensorData {
    private double temperatura;
    private double umidade;
    private int luminosidade;

    public SensorData(double temperatura, double umidade, int luminosidade) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.luminosidade = luminosidade;
    }

    public double getTemperatura() { return temperatura; }
    public double getUmidade() { return umidade; }
    public int getLuminosidade() { return luminosidade; }

    @Override
    public String toString() {
        return String.format("Temperatura: %.2f°C | Umidade: %.2f%% | Luminosidade: %d",
                temperatura, umidade, luminosidade);
    }
}
