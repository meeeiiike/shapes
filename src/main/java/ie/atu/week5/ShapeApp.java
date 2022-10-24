package ie.atu.week5;

import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args) {
        System.out.println("Please enter the lenght of the rectangle");
        Scanner input = new Scanner(System.in);
        double lenght = input.nextDouble();
        System.out.println("You enetered: " + lenght);

        System.out.println("Please enter the width of the rectangle");
        double width = input.nextDouble();
        System.out.println("You enetered: " + width);
    }


}
