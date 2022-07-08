// package com.company;
import java.util.concurrent.locks.ReadWriteLock;

import com.codewithharry.shape.*;

/*
*** WRITE THIS CODE IN NOTEPAD ***
 You have to create a package named com.codewithharry.shape
 This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
 These classes should use inheritance to properly manage the code!
 Include methods like volume, surface area and getters/setters for dimensions
 */

class cwh_68_exercisee_5 extends Rectangle{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.set_rect(4,6);
        int res = rect.get_rect();
        System.out.println("Area of rectangle is : " + res);
    }
}
