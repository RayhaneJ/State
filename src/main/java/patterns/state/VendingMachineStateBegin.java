package patterns.state;

public class VendingMachineStateBegin extends VendingMachineState {
    private static VendingMachineStateBegin instance = new VendingMachineStateBegin();
    public static VendingMachineStateBegin getInstance() {
        return instance;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        int calculatedCash = c.getCash();
        calculatedCash += money;
        c.setCash(calculatedCash);
        if(calculatedCash >= 10)
            c.setState(VendingMachineStateChoice.getInstance());
    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Cant ask coffee in this state");
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Cant ask tea in this state");
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Cant refund in this state");
    }
}
