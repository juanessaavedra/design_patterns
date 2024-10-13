package patrones_estructurales.flyweight.flyweight_example;

public class FlywiehghtPattern {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            Circle circle = (Circle) FlyweightFactory.getCircle(getRandomColor());
            circle.draw(getRandomX(), getRandomY(), getRandomRadius());
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX(){
        return (int)(Math.random()*100);
    }

    private static int getRandomY(){
        return (int)(Math.random()*100);
    }

    private static int getRandomRadius(){
        return (int)(Math.random()*100);
    }
}
