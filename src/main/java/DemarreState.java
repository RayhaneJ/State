public class DemarreState implements State{
    private static DemarreState instance = new DemarreState();

    public static DemarreState getInstance() {
        return instance;
    }

    @Override
    public void allume(LightManager lightManager) {
        System.out.println("Impossible d'allume");
    }

    @Override
    public void demarre(LightManager lightManager) {
        System.out.println("Deja allume");
    }

    @Override
    public void arrete(LightManager lightManager) {
        lightManager.setState(ArreteState.getInstance());
    }

    @Override
    public void eteint(LightManager lightManager) {
        System.out.println("Impossible d'eteindre");
    }

    @Override
    public void showState() {
        System.out.println("Demarre");
    }
}
