package patterns.state;

public class VendingMachineStateRefund extends VendingMachineState {
    private static VendingMachineStateRefund instance = new VendingMachineStateRefund();

    public static VendingMachineStateRefund getInstance(){
        return instance;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        throw new IncorrectStateException("Cant give in this state");
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
        int refundedCash = c.getCash();
        c.setCash(0);
        if(refundedCash == 0)
            c.setState(VendingMachineStateBegin.getInstance());
        return refundedCash;
    }
}
