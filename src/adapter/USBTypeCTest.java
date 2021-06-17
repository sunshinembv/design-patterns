package adapter;

public class USBTypeCTest implements USBTypeC {
    @Override
    public void rechargePhone() {
        System.out.println("Recharge phone with a USB Type-C");
    }
}
