package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        double width;
        double height;
        double area = 0;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle");
        width = input.nextInt();
        System.out.println("Enter the height of the rectangle");
        height = input.nextInt();
        input.close();
        area = height * width;
        System.out.println("Rectangle area is " + area);

    }


}
