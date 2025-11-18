package Q3;

class ModuloDeAlertas implements Observador {
    @Override
    public void atualizar(float temp, float umid, int pol) {
        if (temp > 40 || pol > 100) {
            System.out.println("[ALERTA] Níveis críticos detectados! Enviando SMS!!");
        }
    }
}
