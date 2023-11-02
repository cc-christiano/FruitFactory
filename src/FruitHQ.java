public class FruitHQ {

    public static void main(String[] args) {
        FruitHQ myFactory = new FruitHQ();
    }

    // constructor method
    // a constructor is a method with no return type
    // that has the same name as the class its in
    // strawberry has red, triangle, 200, yes, 20
   public FruitHQ() {
       Fruit strawberry; //declare strawberry
       strawberry = new Fruit("red","triangle", 200, true ); //construct strawberry
//       strawberry.color = "red";
//       strawberry.shape = "triangle";
//       strawberry.numSeeds = 200;
//       strawberry.isRipe = true;
//       strawberry.numBush = 20;
       strawberry.printInfo();

       Fruit orange;
       orange = new Fruit("orange", "circle", 1, true); //construct strawberry
//       orange.color = "orange";
//       orange.shape = "circle";
//       orange.numSeeds = 1;
//       orange.isRipe = true;
//       orange.numBush = 200;
       orange.printInfo();


       Fruit lemon;
       lemon = new Fruit("yellow", "oval", 12, true);
       lemon.printInfo();
   }
}
