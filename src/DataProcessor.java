public class DataProcessor {

    public void processLine(String line) {
        try {
            // Formato Esperado: "temp:24.5;hum:40.0;lum:350"
            String[] parts = line.split(";");
            double temp =  formatDouble(parts[0].split(":")[1]);
            double hum = formatDouble(parts[1].split(":")[1]);
            int lum = Integer.parseInt(parts[2].split(":")[1]);

            SensorData data = new SensorData(temp, hum, lum);
            System.out.println(data);
        } catch (Exception e) {
            System.out.println("Erro ao processar linha: " + line);
        }
    }

    private Double formatDouble(String value){
        return Double.parseDouble(value.replace(",","."));
    }
}
