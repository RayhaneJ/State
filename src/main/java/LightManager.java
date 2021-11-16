public class LightManager {
    private State state;

    public LightManager(){
        state = new EteintState();
    }

    public void setState(State state){
        state = state;
    }

    public State getState(){
        return state;
    }

    public void allume(){
        state.allume(this);
    }

    public void demarre(){
        state.eteint(this);
    }

    public void arrete(){
        state.arrete(this);
    }

    public void eteitn(){
        state.eteint(this);
    }
}
