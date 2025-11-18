package Q1;
class RelatorioEmergencial implements Relatorio {
    @Override
    public void prepararDados() {
        System.out.println("[URGENTE] Conectando em API de incidentes em tempo real");
    }

    @Override
    public void gerar() {
        System.out.println("[URGENTE] Enviando alerta imediato para gerência.");
    }
}
