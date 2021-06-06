package strategy;

import strategy.character.Archer;
import strategy.character.Character;
import strategy.character.King;
import strategy.character.Knight;
import strategy.weapon_behavior.AxeBehavior;
import strategy.weapon_behavior.BowBehavior;
import strategy.weapon_behavior.SwordBehavior;

public class BattleGrounds {
    public static void main(String[] args) {
        Character king = new King();
        Character knight = new Knight();
        Character archer = new Archer();

        king.setWeapon(new AxeBehavior());
        knight.setWeapon(new SwordBehavior());
        archer.setWeapon(new BowBehavior());

        king.fight();
        knight.fight();
        archer.fight();

        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}
