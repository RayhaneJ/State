package patterns.state;

public class SimpleVendingMachineStateBegin extends SimpleVendingMachineState {
    private static SimpleVendingMachineState instance = new SimpleVendingMachineStateBegin();

    public static SimpleVendingMachineState getInstance(){
        return instance;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) {
        if(money >= 10)
            c.setState(SimpleVendingMachineStateChoice.getInstance());
    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Cant ask coffee in this state");
    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Cant ask the in this state");
    }
}
