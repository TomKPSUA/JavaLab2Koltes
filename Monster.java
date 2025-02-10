/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Practice Abstraction, Inheritance, Polymorphism
 * Course: IST 242
 * Author: Thomas Koltes
 * Date Developed: 2/9/2025
 * Last Date Changed: 2/9/2025
 * Rev: 1

 */

//Parent Class for Monsters
public abstract class Monster {
    protected String name;
    protected int health;
    protected int attackDamage;
    protected SpecialPower specialPower;

    //Constructor

    /**
     *
     * @param name is name of Monster
     * @param health is amount of health the monster has
     * @param attackDamage is the amount of damage an attack does
     */
    public Monster(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public int setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    public SpecialPower getSpecialPower() {
        return specialPower;
    }
    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }
    public abstract void specialPower();
}
