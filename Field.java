package com.XOGame;

import com.XOGame.exceptions.InputCellBusyException;

/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 01.01.14
 * Time: 2:35
 * To change this template use File | Settings | File Templates.
 */
public abstract class Field {
    protected int HEIGHT = 3;
    protected int WIDTH = 3;
    protected Cell[][] cells = new Cell[WIDTH][HEIGHT];

    public Field() {
        draw();
    }

    protected void draw() {
        for (int i = 0; i < WIDTH; ++i) {
            for (int j = 0; j < HEIGHT; ++j) {
                cells[i][j] = new Cell(new Coordinate(i, j));
            }
        }
    }

    protected boolean isCellEmpty(Coordinate pos) {
        if (cells[pos.getI()][pos.getJ()].getFigure() == null) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void reDraw();

    public void setFigure(Coordinate pos, Figure figure) throws InputCellBusyException {
        if (isCellEmpty(pos)) {
            cells[pos.getI()][pos.getJ()].setFigure(figure);
        } else {
            throw new InputCellBusyException("Занято!");
        }
    }
}
