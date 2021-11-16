package patterns.state;

public class SimpleVendingMachineStateBegin extends SimpleVendingMachineState {
    private static SimpleVendingMachineState instance = new SimpleVendingMachineStateBegin();
    private int cash;

    public static SimpleVendingMachineState getInstance(){
        return instance;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) {
        cash += money;
    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c){
        if(cash >= 10) {
            cash = 0;
            System.out.println("One Coffee");
        }
        else
            System.out.println("Pas possible");
    }

    @Override
    public void askTea(SimpleVendingMachineContext c) {
        if(cash >= 10) {
            cash = 0;
            System.out.println("One tea");
        }
        else {
            System.out.println("Pas possible");
        }
    }
}
