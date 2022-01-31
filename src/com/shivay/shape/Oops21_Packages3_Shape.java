package com.shivay.shape;

/**
 * This class is to demonstrate what Package is and how it is used in the java industry
 * @author Shivay Sabharwal
 * @version 1.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

public class Oops21_Packages3_Shape {
    int dim1, dim2;
    Oops21_Packages3_Shape(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim1() {
        return dim1;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }

    public int getDim2() {
        return dim2;
    }
}
