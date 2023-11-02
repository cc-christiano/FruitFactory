public class Fruit {

    // variable declarations
    public String color;
    public String shape;
    public int numSeeds;
    public boolean isRipe;
    public int numBush;

    public void printInfo(){
            System.out.println("The fruit's color: " + color);
            System.out.println("The fruit's shape is: " + shape);
            System.out.println("The seed count: " + numSeeds);
            if(isRipe == true){
                System.out.println("The fruit is ripe");
            }
            else{
                System.out.println("The fruit is not ripe");
            }
            System.out.println("The number on a bush: " + numBush);

            // orange has orange, circle, one, yes, 200

        }


    public Fruit(){

    }

}
