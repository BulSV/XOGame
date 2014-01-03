package com.XOGame;

/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 01.01.14
 * Time: 2:40
 * To change this template use File | Settings | File Templates.
 */
public abstract class Figure {
    private final String name;

    public Figure (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void draw ();
}
