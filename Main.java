package com.XOGame;

import java.io.IOException;
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
        String player1Name = null;
        String player2Name = null;

        System.out.println("Введите имя первого игрока");
        player1Name = scan.next();
        System.out.println("Введите имя второго игрока");
        player2Name = scan.next();

        XOGame xoGame = null;
        try {
            xoGame = XOGame.startNewGame(player1Name, player2Name);
        } catch (InputNameException e) {
            e.printStackTrace();
        }
//        XOGame xoGame = XOGame.startNewGame(player1Name);

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