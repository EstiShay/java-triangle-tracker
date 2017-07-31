package models;

/**
 * Created by Guest on 7/31/17.
 */


public class Triangle {
    public int side1;
    public int side2;
    public int side3;

    public Triangle (int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String typeOfTriangle() {
        if ((side1 + side2 < side3) || (side2 + side3 < side1) || (side1 + side3 < side2)){
          return "Not a valid triangle";
        } else if (side1 == side2 && side2 == side3){
            return "Equilateral";
        } else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

}