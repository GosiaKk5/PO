package agh.ics.oop;

public class World {
    public static void main(String[] args) {
        Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));

        System.out.println("North to " + MapDirection.NORTH.toString());
        System.out.println("Po NORTH jest " + MapDirection.NORTH.next());
        System.out.println("Przed NORTH jest " + MapDirection.NORTH.previous());
        System.out.println("Wektor NORTH to " + MapDirection.NORTH.toUnitVector());
    }
}
