public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        System.out.println(" Boss’s health is " + boss.getHealth() +
                " " + " Boss's damage is " + boss.getDamage() +
                " Boss's protectionType is " + boss.getProtectinType());
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Health " + createHeroes()[i].getHealth()
                    + " Damage " + createHeroes()[i].getDamage()
                    + " SuperPower" + createHeroes()[i].getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero[] commands;
        Hero hero = new Hero(24, 45, "run");
        Hero hero2 = new Hero(55, "jump");
        Hero hero3 = new Hero(67, 88, "beat");
        commands = new Hero[]{hero, hero2, hero3};
        return commands;
    }
}


