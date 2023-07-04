package player;

import weapon.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                new Pistolet(),
                new Avtomat(),
                new RPG(),
                new Rogatka(),
                new WaterPistolet()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public String shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        if (slot > getSlotsCount() || slot <= 0) {
            return "Введите правильный номер оружия!";
        }
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot - 1];
        // Огонь!
        return weapon.shot();
    }
}

