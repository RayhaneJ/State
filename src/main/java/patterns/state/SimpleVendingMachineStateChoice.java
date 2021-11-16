package patterns.state;

public class SimpleVendingMachineStateChoice extends SimpleVendingMachineState {
    private static SimpleVendingMachineStateChoice instance = new SimpleVendingMachineStateChoice();

    public static SimpleVendingMachineStateChoice getInstance(){
        return instance;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {
        throw new IncorrectStateException("Can't give money in this state");
    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {
        System.out.println("Coffee");
        c.setState(SimpleVendingMachineStateBegin.getInstance());
    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {
        System.out.println("The");
        c.setState(SimpleVendingMachineStateBegin.getInstance());
    }
}
