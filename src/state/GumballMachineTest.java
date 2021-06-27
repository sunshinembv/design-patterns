package state;

public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        int count = gumballMachine.getCount();
        System.out.println(gumballMachine);

        for (int i = 0; i < count; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.refill(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
    }
}
