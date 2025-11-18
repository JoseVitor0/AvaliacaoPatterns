
package Q4;
class AnaliseGeolocalizacao extends VerificadorAntifraude {
    @Override
    public void verificar(Transacao t) {
        if ("Exterior".equalsIgnoreCase(t.localizacao)) {
            System.out.println("[X] BLOQUEIO: Transação fora do país de origem.");
        } else {
            System.out.println("[OK] Localização verificada.");
            aprovarEPassar(t);
        }
    }
}
