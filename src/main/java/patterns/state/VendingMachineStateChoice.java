package patterns.state;

public class VendingMachineStateChoice extends VendingMachineState {
    private static VendingMachineStateChoice instance = new VendingMachineStateChoice();

    public static VendingMachineStateChoice getInstance(){
        return instance;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        throw new IncorrectStateException("Cant give money in this state");
    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("Coffee");
        int calculatedCash = c.getCash();
        calculatedCash -= 10;

        if(calculatedCash < 10)
            c.setState(VendingMachineStateRefund.getInstance());

        c.setCash(calculatedCash);
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("Tea");
        int calculatedCash = c.getCash();
        calculatedCash -=10;

        if(calculatedCash < 10)
            c.setState(VendingMachineStateBegin.getInstance());

        c.setCash(calculatedCash);
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Cant refund in this state");
    }
}
