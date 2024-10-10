package patrones_estructurales.composite.composite_presentation;

public class Main {
    public static void main(String[] args) {

        PartEnemy head = new PartEnemy("Head");
        PartEnemy body = new PartEnemy("Body");
        PartEnemy leftArm = new PartEnemy("Left Arm");
        PartEnemy rightArm = new PartEnemy("Right Arm");
        PartEnemy leftLeg = new PartEnemy("Left Leg");
        PartEnemy rightLeg = new PartEnemy("Right Leg");

        CompositeEnemy enemy = new CompositeEnemy();
        enemy.add(head);
        enemy.add(body);
        enemy.add(leftArm);
        enemy.add(rightArm);
        enemy.add(leftLeg);
        enemy.add(rightLeg);

        enemy.render(); //Print all parts before adding miniBoss

        //Create miniBoss
        CompositeEnemy miniBoss = new CompositeEnemy();
        miniBoss.add(new PartEnemy("Head miniboss"));
        miniBoss.add(new PartEnemy("Body miniboss"));

        enemy.add(miniBoss);

        System.out.println("After adding miniBoss");
        enemy.render();
    }
}
