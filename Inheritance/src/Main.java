public class Main {

    public Main() {
        Tortoise myTortoise = new Tortoise();
        Turtle myTurtle = new Turtle();
        Snake mySnake = new Snake();
        Otter myOtter = new Otter();
        Gorilla myGorilla = new Gorilla();
        Bat myBat = new Bat();

        myTortoise.getInfo();
        myTurtle.getInfo();
        mySnake.getInfo();
        myOtter.getInfo();
        myGorilla.getInfo();
        myBat.getInfo();
        Console.readLine();
    }

    public static void main(String[] args) {
        new Main();
    }

}