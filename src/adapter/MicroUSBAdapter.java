package adapter;

public class MicroUSBAdapter implements USBTypeC {
    MicroUSB microUSB;

    public MicroUSBAdapter(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }

    @Override
    public void rechargePhone() {
        microUSB.rechargePhone();
    }
}
