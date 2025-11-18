package Q3;

import java.util.ArrayList;
import java.util.List;

class SensorAmbiental {
    private List<Observador> observadores = new ArrayList<>();
    private float temperatura;
    private float umidade;
    private int poluicao;

    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void removerObservador(Observador obs) {
        observadores.remove(obs);
    }

    private void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.atualizar(temperatura, umidade, poluicao);
        }
    }

    public void setMedicoes(float temperatura, float umidade, int poluicao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.poluicao = poluicao;
        System.out.println("\n[Sensor] Novos dados detectados! *Notificando módulos.");
        notificarObservadores();
    }
}
