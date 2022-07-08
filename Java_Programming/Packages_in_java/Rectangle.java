package com;

public class Rectangle {
    public int dim1,dim2;
    public Rectangle(int dim1,int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int area() {
        return this.dim1 * this.dim2;
    }
}
