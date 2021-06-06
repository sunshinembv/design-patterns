package strategy.weapon_behavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Ax blow");
    }
}
