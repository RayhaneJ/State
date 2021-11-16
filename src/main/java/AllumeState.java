public class AllumeState implements State{
    @Override
    public void allume(LightManager lightManager) {
        System.out.println("Deja allume");
    }

    @Override
    public void demarre(LightManager lightManager) {
            lightManager.setState(new DemarreState());
    }

    @Override
    public void arrete(LightManager lightManager) {
        System.out.println("Impossible d'eteindre");
    }

    @Override
    public void eteint(LightManager lightManager) {
        System.out.println("Eteint");
        lightManager.setState(new EteintState());
    }


}
