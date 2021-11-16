public class AllumeState implements State{
    private static AllumeState instance = new AllumeState();

    public static AllumeState getInstance() {
        return instance;
    }

    @Override
    public void allume(LightManager lightManager) {
        System.out.println("Deja allume");
    }

    @Override
    public void demarre(LightManager lightManager) {
            lightManager.setState(AllumeState.getInstance());
    }

    @Override
    public void arrete(LightManager lightManager) {
        System.out.println("Impossible d'eteindre");
    }

    @Override
    public void eteint(LightManager lightManager) {
        System.out.println("Eteint");
        lightManager.setState(EteintState.getInstance());
    }

    @Override
    public void showState() {
        System.out.println("Allume");
    }


}
