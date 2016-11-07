package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
		//TODO: main() is missing

    public static void main(String[] args) {

        Main m = new Main();

        m.doIt();

    }

    private void doIt() {
        List<GeometricShape> shapeList = new ArrayList<>();

        fillList(shapeList);
        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();
        for (GeometricShape geometricShape : shapeList) {
            if(geometricShape instanceof Circle)
            {
                circleList.add((Circle)geometricShape);
            }
        }

        System.out.println("----------------------------------------------------------------------");

        for (Circle circle : circleList) {
            System.out.println(circle);
        }
    }

    public void fillList(List<GeometricShape> shapeList) {
		//TODO: Implement
        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(3,2,3.8));
        shapeList.add(new Circle(4,1,1.2));
        shapeList.add(new Circle(2,2,3.3));

        shapeList.add(new Rectangle(1,2,3,1));
        shapeList.add(new Rectangle(3,1,2,3));
        shapeList.add(new Rectangle(5,2,3,4));

        shapeList.add(new RightTriangle(1,1,1,1));
    }


    public void printList(List<GeometricShape> shapeList) {
		//TODO: Implement
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));
        }

        for (GeometricShape gs : shapeList){
            System.out.println(gs);
        }

        shapeList.stream()
                .forEach(gs -> System.out.println(gs));

        shapeList.stream()
                .forEach(System.out::println);
    }

}
