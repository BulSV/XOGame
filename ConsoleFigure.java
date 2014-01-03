package com.XOGame;

/**
 * Created with IntelliJ IDEA.
 * User: sergey
 * Date: 01.01.14
 * Time: 2:41
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleFigure extends Figure {

    public ConsoleFigure (String name) {
        super(name);
    }

    public void draw () {
        System.out.print("[" + getName() + "]");
    }
}
