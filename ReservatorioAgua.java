public class ReservatorioAgua {

    private static ReservatorioAgua instancia;
    private ReservatorioAgua() {
        System.out.println("Reservatório criado!");
    }

    public static ReservatorioAgua getInstancia() {
        if (instancia == null) {
            instancia = new ReservatorioAgua();
        }
        return instancia;
    }
}