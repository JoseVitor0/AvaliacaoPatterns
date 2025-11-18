package Q4;

abstract class VerificadorAntifraude {
    protected VerificadorAntifraude proximo;

    public void setProximo(VerificadorAntifraude proximo) {
        this.proximo = proximo;
    }

    public abstract void verificar(Transacao t);

    protected void aprovarEPassar(Transacao t) {
        if (proximo != null) {
            proximo.verificar(t);
        } else {
            System.out.println("Sucesso: Transação aprovada em todas as etapas!");
        }
    }
}
