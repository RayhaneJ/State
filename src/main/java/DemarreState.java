public class DemarreState implements State{
    @Override
    public void allume(LightManager lightManager) {

    }

    @Override
    public void demarre(LightManager lightManager) {

    }

    @Override
    public void arrete(LightManager lightManager) {
        if(lightManager.getState()
                .getClass().getTypeName()== "DemarreState")
            lightManager.setState(new ArreteState());
    }

    @Override
    public void eteint(LightManager lightManager) {

    }
}
