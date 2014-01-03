package com.XOGame;

/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 01.01.14
 * Time: 2:44
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleField extends Field {

    public ConsoleField() {
//        super();
//        System.out.println("ConsoleField constructor");
//        super.draw();
    }

    @Override
    public void reDraw() {
//        System.out.println("reDraw");
        for (int i = 0; i < WIDTH; ++i) {
            for (int j = 0; j < HEIGHT; ++j) {
                if (isCellEmpty(new Coordinate(i, j))) {
                    System.out.print("[ ]");
                } else {
//                    System.out.println("ConsoleField::reDraw: false");
//                    System.out.println("ConsoleField::reDraw: cells[" + i + "][" + j + "]: " + cells[i][j]);
                    cells[i][j].reDraw();
                }
            }
            System.out.println();
        }
    }

    @Override
    protected void draw() {
        super.draw();
//        System.out.println("ConsoleField::draw");
        int pos = 1;
        for (int i = 0; i < WIDTH; ++i) {
            for (int j = 0; j < HEIGHT; ++j) {
                System.out.print("[" + pos++ + "]");
            }
            System.out.println();
        }
    }
}
