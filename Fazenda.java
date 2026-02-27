public abstract class Fazenda {

    public abstract Cultura criarCultura();

    public void iniciarPlantio() {
        Cultura cultura = criarCultura();
        cultura.plantar();
    }
}