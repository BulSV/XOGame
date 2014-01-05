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
        draw();
    }

    @Override
    public void reDraw() {
        for (int i = 0; i < getDim().getI(); ++i) {
            for (int j = 0; j < getDim().getJ(); ++j) {
                if (isCellEmpty(new Coordinate(i, j))) {
                    System.out.print("[ ]");
                } else {
                    getCells()[i][j].reDraw();
                }
            }
            System.out.println();
        }
    }

//    @Override
    private void draw() {
        int pos = 1;
        for (int i = 0; i < getDim().getI(); ++i) {
            for (int j = 0; j < getDim().getJ(); ++j) {
                System.out.print("[" + pos++ + "]");
            }
            System.out.println();
        }
    }
}
