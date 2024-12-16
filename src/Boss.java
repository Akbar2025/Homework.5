public class Main {
    public static void main(String[] args) {
        // Создаем босса
        Boss boss = new Boss(100, 20, "Магия");
        System.out.println("Босс: здоровье=" + boss.getHealth() + ", урон=" + boss.getDamage() + ", защита=" + boss.getProtection());

        // Создаем героев и помещаем их в массив
        Hero[] heroes = createHeroes();

        // Выводим информацию о героях
        for (Hero hero : heroes) {
            System.out.println("Герой: здоровье=" + hero.getHealth() + ", урон=" + hero.getDamage() + ", суперспособность=" + hero.getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 15, "Сила");
        Hero hero2 = new Hero(80, 20); // Использование конструктора с двумя параметрами
        Hero hero3 = new Hero(90, 18, "Скорость");

        return new Hero[]{hero1, hero2, hero3};
    }
}

class Hero {
    private int health;
    private int damage;
    private String superpower;

    // Конструктор для всех полей
    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    // Конструктор только для здоровья и урона
    public Hero(int health, int damage) {
        this(health, damage, "");
    }

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}

class Boss {
    private int health;
    private int damage;
    private String protection;

    // Конструктор (можно сделать и без него)
    public Boss(int health, int damage, String protection) {
        this.health = health;
        this.damage = damage;
        this.protection = protection;
    }

    // Геттеры и сеттеры
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // ... аналогично для остальных полей
}