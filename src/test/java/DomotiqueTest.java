import org.junit.Test;

public class DomotiqueTest {
    @Test
    public void DomotiquesTest(){
        LightManager lightManager = new LightManager();
        lightManager.show();
        lightManager.allume();
        lightManager.show();
        lightManager.demarre();
        lightManager.show();
        lightManager.arrete();
        lightManager.show();
        lightManager.eteitn();
        lightManager.show();
    }
}
