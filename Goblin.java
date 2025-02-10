/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Practice Abstraction, Inheritance, Polymorphism
 * Course: IST 242
 * Author: Thomas Koltes
 * Date Developed: 2/9/2025
 * Last Date Changed: 2/9/2025
 * Rev: 1

 */

/**
 * Extending Monster class to create Goblin Final Class
 */
public final class Goblin extends Monster {
    private int ambushDamage;

    public Goblin(String name, int health, int attackDamage, int ambushDamage) {
        super(name, health, attackDamage);
        this.ambushDamage = ambushDamage;
    }
    //getters and setters
    public int getAmbushDamage() {
        return ambushDamage;
    }
    public void setAmbushDamage(int ambushDamage) {
        this.ambushDamage = ambushDamage;
    }
    @Override
    public void specialPower() {
        System.out.println(getName() + "Ambushes and does" + ambushDamage + "damage.");
    }
}
