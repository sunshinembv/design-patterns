package strategy.weapon_behavior;

public class BowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Bow shot");
    }
}
