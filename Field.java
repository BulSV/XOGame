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
    private int HEIGHT = 3;
    private int WIDTH = 3;
    private int height = HEIGHT;
    private int width = WIDTH;
    private Cell[][] cells = new Cell[height][width];

    public Cell[][] getCells() {
        return cells;
    }

    public Coordinate getDim() {
        return new Coordinate(height, width);

    }

    public Field() {
        draw();
    }

    private void draw() {
        for (int i = 0; i < HEIGHT; ++i) {
            for (int j = 0; j < WIDTH; ++j) {
                cells[i][j] = new Cell(new Coordinate(i, j));
            }
        }
    }

    public boolean isCellEmpty(Coordinate pos) {
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
