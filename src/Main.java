public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        SerialReader reader = new SerialReader(processor);
        reader.startMockReading();

        // Para fins de teste, o mock rodará por 20 segundos
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        reader.stopMockReading();
    }
}