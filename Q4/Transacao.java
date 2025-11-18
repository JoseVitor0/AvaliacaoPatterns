package Q4;

class Transacao {
    double valor;
    String localizacao;
    boolean historicoRuim;

    public Transacao(double valor, String localizacao, boolean historicoRuim) {
        this.valor = valor;
        this.localizacao = localizacao;
        this.historicoRuim = historicoRuim;
    }
}
