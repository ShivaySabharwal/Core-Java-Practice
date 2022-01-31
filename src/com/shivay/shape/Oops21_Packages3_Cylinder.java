package com.shivay.shape;

public class Oops21_Packages3_Cylinder extends Oops21_Packages3_Shape{
    Oops21_Packages3_Cylinder (int dim1, int dim2){
        super(dim1, dim2);
    }
    public int area(){
        return (this.dim1*this.dim2);
    }
}
