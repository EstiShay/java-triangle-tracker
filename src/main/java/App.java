/**
 * Created by Guest on 7/31/17.
 */

import models.Triangle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Give me the length of one side of your triangle: ");
            int side1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Give me the length of the second side of your triangle: ");
            int side2 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Give me the length of the third side of your triangle: ");
            int side3 = Integer.parseInt(bufferedReader.readLine());

            Triangle userTriangle = new Triangle(side1, side2, side3);

            String triangleType = userTriangle.typeOfTriangle();
            System.out.println("Your triangle is a: " + triangleType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
