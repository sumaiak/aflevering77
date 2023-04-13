package Task3;

 class Orange extends Edible.Fruit {
     String benefit;
     public Orange(String color, String size, String benefit) {
         super(color, size);
         this.benefit =benefit;
     }

     @Override
     public String howToEat() {
         String s = "you can eat it by enjoying the juice";
         return s;

     }
  public String getBenefit() {
      return benefit;
  }

     public void benefitOfOrange(){
         System.out.println("the benefit of an orange is that it contain vitamen C");


     }



     }
