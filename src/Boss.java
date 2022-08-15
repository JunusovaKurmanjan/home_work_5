public class Boss {
    private int health;
    private int damage;
    private String protectinType;


    public Boss(int health) {
        this.health = health;
    }

    public Boss(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getProtectinType() {
        return protectinType;
    }

    public void setProtectinType(String protectinType) {
        this.protectinType = protectinType;
    }

    public Boss(int health, int damage, String protectinType) {
        this.health = health;
        this.damage = damage;
        this.protectinType = protectinType;

    }
}

