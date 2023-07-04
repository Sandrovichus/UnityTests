import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import player.Player;


import java.util.List;


public class ShooterTest {
    Player player = new Player();

    @Test
    public void testPistolet() {
        // given:
        final int argument = 1;
        final String expected = "Пистолет: Пиф-паф!";
        // when:
        final String result = player.shotWithWeapon(argument);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAvtomat() {
        // given:
        final int argument = 2;
        final String expected = "Автомат: Тра-та-та!";
        // when:
        final String result = player.shotWithWeapon(argument);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testRPG() {
        // given:
        final int argument = 3;
        final String expected = "РПГ: Ба-бах!";
        // when:
        final String result = player.shotWithWeapon(argument);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testRogatka() {
        // given:
        final int argument = 4;
        final String expected = "Рогатка: Пиу!";
        // when:
        final String result = player.shotWithWeapon(argument);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testWaterPistolet() {
        // given:
        final int argument = 5;
        final String expected = "Водяной пистолет: Шшшшш!";
        // when:
        final String result = player.shotWithWeapon(argument);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testException() {
        // given:
        final int argument = -5;
        final String expected = "Введите правильный номер оружия!";
        // when:
        final String result = player.shotWithWeapon(argument);
        // then:
        Assertions.assertEquals(expected, result);
    }
}
