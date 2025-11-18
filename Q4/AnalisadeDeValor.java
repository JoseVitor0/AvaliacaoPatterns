package Q4;

class AnaliseDeValor extends VerificadorAntifraude {
    @Override
    public void verificar(Transacao t) {
        if (t.valor > 10000) {
            System.out.println("[X] BLOQUEIO: Valor muito alto para o perfil.");
        } else {
            System.out.println("[OK] Valor verificado.");
            aprovarEPassar(t);
        }
    }
}
