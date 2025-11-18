package Q3;

class PainelDeControle implements Observador {
    @Override
    public void atualizar(float temp, float umid, int pol) {
        System.out.printf("[Painel] Atualizando display: %.1f°C | Umidade: %.1f%% | Poluição: %d%n", temp, umid, pol);
    }
}
