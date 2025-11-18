package Q3;

class ModuloHistorico implements Observador {
    @Override
    public void atualizar(float temp, float umid, int pol) {
        System.out.println("[Histórico] Salvando dados no banco de dados");
    }
}
