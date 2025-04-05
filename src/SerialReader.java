import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class SerialReader {

    private DataProcessor processor;
    private Timer timer;
    private Random random;

    public SerialReader(DataProcessor processor) {
        this.processor = processor;
        this.timer = new Timer();
        this.random = new Random();
    }

    public void startMockReading() {
        System.out.println("Iniciando leitura mockada dos sensores...");

        // Simula leitura a cada 2 segundos
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Simula os valores como se fossem do Arduino
                double temp = 20 + random.nextDouble() * 10; // 20°C a 30°C
                double um = 30 + random.nextDouble() * 30;  // 30% a 60%
                int lum = 500 + random.nextInt(500); // 500 a 1000 (intensidade luminosa)

                String fakeData = String.format("temp:%.2f;um:%.2f;lum:%d", temp, um, lum);
                processor.processLine(fakeData);
            }
        }, 0, 2000);
    }

    public void stopMockReading() {
        timer.cancel();
        System.out.println("Leitura mockada interrompida.");
    }
}
