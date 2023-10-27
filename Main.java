public class Main {
    public static void main(String[] args) {
        Character Witcher = new Witcher("Geralth", 49, 3, "Dwarf");
        Monster Butcher = new Butcher("Jaundice", 50, 3, "Undead");

        System.out.println("You encounter a monster");
        System.out.println("It has " + Butcher.health + " health");
        while (Witcher.health > 0 && Butcher.health > 0) {
            System.out.println("You attack the monster");
            Witcher.attack(Butcher);
            if (Butcher.health > 0) {
                System.out.println("It has " + Butcher.health + " health remaining");
                System.out.println("It retaliates and hits you back.");
                Butcher.attack(Witcher);
                if (Witcher.health <= 0) {
                    System.out.println("You are dead");
                } else {
                    System.out.println("You are left with " + Witcher.health + " health");
                }
            } else {
                System.out.println("You defeated the monster");
            }
        }
    }
}
