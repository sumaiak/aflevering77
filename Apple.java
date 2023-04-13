package Task3;

public class Apple extends Edible.Fruit {
    String Shape;
    public Apple(String size, String color,String Shape) {
        super(size, color);
    }

    @Override
    public String howToEat() {
        String s = "there are to colors for apple you can make juice or eat";
        return s;

    }

    public String getShape() {
        return Shape;
    }
    public void ShapeApple(){
        System.out.println("an apple is round and has 2 different color");

    }
}
