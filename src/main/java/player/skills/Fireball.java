package player.skills;

public class Fireball extends Skills{
    int damage;

    public Fireball() {
        name = "Fireball";
        damage = 5;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String cast() {
        return "You cast Fireball!";
    }
}
