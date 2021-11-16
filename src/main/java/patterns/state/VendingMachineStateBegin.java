package patterns.state;

public class VendingMachineStateBegin extends VendingMachineState {
    private static VendingMachineStateBegin instance = new VendingMachineStateBegin();
    private int cash;

    public static VendingMachineStateBegin getInstance() {
        return instance;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        cash += money;
    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        if(cash >= 10) {
            System.out.println("One coffee");
            cash -= 10;
        }
        else {
            System.out.println("Pas possible");
        }
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        if(cash >= 10) {
            System.out.println("One the");
            cash -= 10;
        }
        else {
            System.out.println("Pas possible");
        }
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        int refundedCash = cash;
        if(cash > 0)
            cash = 0;
        return refundedCash;
    }
}
