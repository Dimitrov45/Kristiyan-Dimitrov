public class Butcher extends Monster{
    public Butcher(String name, int health, int power, String race) {
        super(name, health, power, race);
    }
    @Override
    public void attack(Character target) {
        int power = getPower();
        target.health -= power;
    }
}
