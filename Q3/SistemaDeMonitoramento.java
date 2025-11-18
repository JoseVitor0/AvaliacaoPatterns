package Q3;

public class SistemaDeMonitoramento {
    public static void main(String[] args) {
        SensorAmbiental sensor = new SensorAmbiental();

        PainelDeControle painel = new PainelDeControle();
        ModuloDeAlertas alertas = new ModuloDeAlertas();
        ModuloHistorico historico = new ModuloHistorico();

        sensor.adicionarObservador(painel);
        sensor.adicionarObservador(alertas);
        sensor.adicionarObservador(historico);

        sensor.setMedicoes(25.0f, 60.0f, 40);

        sensor.setMedicoes(42.5f, 30.0f, 150);
    }
}
