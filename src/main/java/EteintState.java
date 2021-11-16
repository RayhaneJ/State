public class EteintState implements State {
    private static EteintState instance = new EteintState();

    public static EteintState getInstance() {
        return instance;
    }

    @Override
    public void allume(LightManager lightManager) {
        System.out.println("Allume");
        lightManager.setState(AllumeState.getInstance());
    }

    @Override
    public void demarre(LightManager lightManager) {
        System.out.println("Impossible de demarre");
    }

    @Override
    public void arrete(LightManager lightManager) {
        System.out.println("Impossible d'arrete");
    }

    @Override
    public void eteint(LightManager lightManager) {
        System.out.println("Deja eteint");
    }
}
