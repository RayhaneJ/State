public class ArreteState implements State {
    @Override
    public void allume(LightManager lightManager) {
        System.out.println("Impossible d'allume");
    }

    @Override
    public void demarre(LightManager lightManager) {
        System.out.println("Demarre");
        lightManager.setState(new DemarreState());
    }

    @Override
    public void arrete(LightManager lightManager) {
        System.out.println("Deja arrete");
    }

    @Override
    public void eteint(LightManager lightManager) {
        System.out.println("Eteint");
        lightManager.setState(new EteintState());
    }
}
