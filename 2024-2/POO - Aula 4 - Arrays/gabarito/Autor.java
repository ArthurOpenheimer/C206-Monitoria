public class Autor {
    String nome;
    Saga[] sagas = new Saga[10];

    public void listarSagas() {
        for (Saga saga : sagas) {
            if(saga != null) {
                System.out.println("Nota da saga: " + saga.nota);
                saga.listarLivros();
            }
        }
    }

    public void adicionarSaga(Saga saga) {
        for (int i = 0; i < sagas.length; i++) {
            if (sagas[i] == null) {
                sagas[i] = saga;
                break;
            }
        }
    }
}
