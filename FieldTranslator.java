package com.XOGame;

import com.XOGame.exceptions.InputCellRangeException;

/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 02.01.14
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */
public class FieldTranslator {
    private static final int WIDTH = 3;
    private static final int HEIGHT = 3;
    private static final int CELLS = WIDTH * HEIGHT;

    private int width = WIDTH;
    private int height = HEIGHT;
    private int cells = CELLS;
    private Coordinate[] coordinates = new Coordinate[cells];

    private void fillBoard() {
        int k = 0;
        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                coordinates[k++] = new Coordinate(i, j);
            }
        }
    }

    public FieldTranslator(int width, int height) {
        this.width = width;
        this.height = height;
        fillBoard();
    }

    public FieldTranslator() {
        this(WIDTH, HEIGHT);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Coordinate getCoordinates(int pos) throws InputCellRangeException {
        if ((pos >= 1) && (pos <= cells)) {
            return coordinates[pos - 1];
        } else {
            throw new InputCellRangeException("Неправильный ввод координаты");
        }
    }
}
