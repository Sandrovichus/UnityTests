import player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер от 1 до 5 чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            System.out.println(player.shotWithWeapon(slot));
        }

        System.out.println("Game over!");
    }
}
