public class Necroman extends Character{
    public Necroman(String name, int health, int power, String race){
        super(name, health, power, race);
    }

    @Override
    void attack(Monster target) {
        int power = getPower();
        target.health -= power;
    }
    @Override
    void defend(int attackPower) {
        int health = getHealth();
        health -= attackPower;
    }
}
