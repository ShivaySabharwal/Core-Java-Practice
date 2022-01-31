package com.shivay.shape;

public class Oops21_Packages3_Circle extends com.shivay.shape.Oops21_Packages3_Shape {
    Oops21_Packages3_Circle(int dim1){
        super(dim1, -1);
    }
    public int area(){
        return (int) (Math.PI*this.dim1*this.dim1);
    }
}
