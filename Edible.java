package Task3;

public interface Edible {

       public void greedily();
       public void eatfast();


        /**
         * describe how to eat
         */
        public abstract String howToEat();


        abstract class Animal {
            private double weight;

            public double getWeight() {
                return weight;
            }

            public void setWeight(double weight) {
                this.weight = weight;
            }

           public String soundOfAnimal(){
                return sound();

           }
            public abstract String sound();
        }

        abstract class Fruit implements Edible {
            String color;
            String size;
            public Fruit(String color){
            this.color=color;
            }
            public Fruit(String size, String color){
                this.color = color;
                this.size= size;


            }
            public void greedily(){
                boolean isgreedily ;
                if(isgreedily= true )
                System.out.println("this animal is wild");
                else {
                    if (isgreedily == false){
                        System.out.println("this animal is a pet ");
                    }
                }




        }
            public void eatfast(){
                System.out.println("this anmial eat fast");
                }

            }

        }
