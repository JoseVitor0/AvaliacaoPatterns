package Q5;

public class LoggerCentral {

    private static LoggerCentral instanciaUnica;

    private LoggerCentral() {
        System.out.println("Inicializando motor de logs (Arquivo/Servidor)");
    }

    public static synchronized LoggerCentral getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new LoggerCentral();
        }
        return instanciaUnica;
    }

    public void registrarLog(String mensagem) {
        System.out.println("[LOG REGISTRADO]: " + mensagem);
    }
}
