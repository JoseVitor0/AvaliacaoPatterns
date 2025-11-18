package Q4;

class AnaliseHistorico extends VerificadorAntifraude {
    @Override
    public void verificar(Transacao t) {
        if (t.historicoRuim) {
            System.out.println("[X] BLOQUEIO: Cliente com histórico de fraudes.");
        } else {
            System.out.println("[OK] Histórico limpo.");
            aprovarEPassar(t);
        }
    }
}
