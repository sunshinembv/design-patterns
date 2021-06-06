package strategy.character;

import strategy.weapon_behavior.WeaponBehavior;

abstract public class Character {
    WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
