public interface State {
    public void allume(LightManager lightManager);
    public void demarre(LightManager lightManager);
    public void arrete(LightManager lightManager);
    public void eteint(LightManager lightManager);
}
