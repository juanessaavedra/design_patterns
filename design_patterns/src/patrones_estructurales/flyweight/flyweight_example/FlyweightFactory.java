package patrones_estructurales.flyweight.flyweight_example;

import java.util.HashMap;

public class FlyweightFactory {

    private static final HashMap<String, Flyweight> circleMap = new HashMap<>();

    public static Flyweight getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color " + color);
        }

        return circle;
    }
}
