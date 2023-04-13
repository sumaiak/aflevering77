package Task3;

public class Tiger extends Edible.Animal {
    private final String size;

    public Tiger(double weight, String size) {
        getWeight();
        this.size = size;
    }

    @Override
    public String sound() {
        return soundOfAnimal();


    }



  }

