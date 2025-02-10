/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Practice Abstraction, Inheritance, Polymorphism
 * Course: IST 242
 * Author: Thomas Koltes
 * Date Developed: 2/9/2025
 * Last Date Changed: 2/9/2025
 * Rev: 1

 */

/**
 * Extending Monster class to create Dragon Final Class
 */
public final class Dragon extends Monster {
    private int fireBlastDamage;

    //constructor

    public Dragon(String name, int health, int attackDamage, int fireBlastDamage) {
        super(name, health, attackDamage)
        this.fireBlastDamage = fireBlastDamage;
    }

    //getters and setters
    public int getFireBlastDamage() {
        return fireBlastDamage;
    }
    public void setFireBlastDamage(int fireBlastDamage) {
        this.fireBlastDamage = fireBlastDamage;
    }
    @Override
    public void specialPowers() {
        System.out.println(getName() + "uses Fire Blast with" + fireBlastDamage + "damage.");
    }
}
