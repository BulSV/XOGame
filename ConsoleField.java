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
//        super.draw();
    }

    @Override
    public void reDraw() {
        for (int i = 0; i < WIDTH; ++i) {
            for (int j = 0; j < HEIGHT; ++j) {
                if (isCellEmpty(new Coordinate(i, j))) {
                    System.out.print("[ ]");
                } else {
                    cells[i][j].reDraw();
                }
            }
            System.out.println();
        }
    }

    @Override
    protected void draw() {
        super.draw();
        int pos = 1;
        for (int i = 0; i < WIDTH; ++i) {
            for (int j = 0; j < HEIGHT; ++j) {
                System.out.print("[" + pos++ + "]");
            }
            System.out.println();
        }
    }
}
