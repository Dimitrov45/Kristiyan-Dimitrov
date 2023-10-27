abstract class Monster {
    String name;
    int health;
    int power;
    String race;

    public  Monster(String name, int health, int power, String race){
        this.name = name;
        this.health = health;
        this.power = power;
        this.race = race;
    }

    abstract void attack(Character target);

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
    }

}
