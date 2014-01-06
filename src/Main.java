import XOGame.exceptions.InputCellBusyException;
import XOGame.exceptions.InputCellRangeException;
import XOGame.exceptions.InputNameException;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 01.01.14
 * Time: 2:19
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PVPorPVC pvporpvc = null;
        String player1Name = null;
        String player2Name = null;
        XorO xOrO = null;
        XOGame xoGame = null;

        while (true) {
            System.out.println("Выберите с кем играть:\nС человеком - PVP\nС компьютером - PVC");
            pvporpvc = PVPorPVC.valueOf(scan.next().toUpperCase());
            System.out.println("Введите имя игрока");
            player1Name = scan.next();
            System.out.println("Крестиками или ноликами?");
            xOrO = XorO.valueOf(scan.next().toUpperCase());
            if (pvporpvc == PVPorPVC.PVP) {
                System.out.println("Введите имя второго игрока");
                player2Name = scan.next();
            }


            try {
                if (pvporpvc == PVPorPVC.PVP) {
                    xoGame = XOGame.startNewGame(player1Name, player2Name, xOrO);
                } else {
                    xoGame = XOGame.startNewGame(player1Name, xOrO);
                }
            } catch (InputNameException e) {
                System.out.println("Ошибка!\nВведено не правильное имя!");
                System.out.println("Прийдётся из-за " + e.getMessage() + " вводить имена заново");
                continue;
            }
            break;
        }

        System.out.println();

        int k = 1;
        while (k < 10) {
            if (k % 2 == 1) {
                inputPos(xoGame.getPlayer1());

            } else {
                inputPos(xoGame.getPlayer2());
            }
            xoGame.getField().reDraw();
            k++;
            System.out.println();
        }
    }

    private static void inputPos(Player player) {
        System.out.println(player.getName() + ", введите номер поля");
        Scanner scanner = new Scanner(System.in);
        FieldTranslator fieldTranslator = new FieldTranslator();
        int pos = scanner.nextInt();
        try {
            player.move(fieldTranslator.getCoordinates(pos));
        } catch (InputCellRangeException e) {
            System.out.println("Ошибка!\nВведите номер поля в диапазоне от 1 до 9 включительно");
            inputPos(player);
        } catch (InputCellBusyException e) {
            System.out.println("Ошибка!\nПоле занято! Введите другой номер поля");
            inputPos(player);
        }
    }
}