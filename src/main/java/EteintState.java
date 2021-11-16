public class EteintState implements State {
    @Override
    public void allume(LightManager lightManager) {
        System.out.println("Allume");
        lightManager.setState(new AllumeState());
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
