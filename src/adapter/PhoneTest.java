package adapter;

public class PhoneTest {
    public static void main(String[] args) {
        MicroUSB microUSB = new MicroUSBTest();
        USBTypeC usbTypeC = new USBTypeCTest();

        USBTypeC microUSBAdapter = new MicroUSBAdapter(microUSB);

        System.out.println("Micro USB");
        microUSB.rechargePhone();

        System.out.println("USB Type-C");
        testRechargePhone(usbTypeC);

        System.out.println("Micro USB Adapter");
        testRechargePhone(microUSBAdapter);
    }

    static void testRechargePhone(USBTypeC usbTypeC){
        usbTypeC.rechargePhone();
    }
}
