public class Bat extends Mammal{
    private boolean coldBlooded;
    private String skinType;
    private boolean tail;
    private int legs;
    private int arms;
    private int wings;

    Bat() {
        this.coldBlooded = false;
        this.skinType = "fur";
        this.tail = true;
        this.legs = 2;
        this.arms = 0;
        this.wings = 2;
    }

    public void move() {
        System.out.println("This animal flies");
    }

    public void eat() {
        System.out.println("This animal is an omnivore");
    }

    public void birth() {
        System.out.println("This animal gives birth to live young");
    }

    public void hibernate() {
        System.out.println("This animal hibernates");
    }

    public void getInfo() {
        System.out.println("Bat:");
        if (this.coldBlooded)
            System.out.println("This animal is cold-blooded");
        else
            System.out.println("This animal is warm-blooded");
        if (this.skinType != null)
            System.out.println("This animal is covered in " + this.skinType);
        if (this.tail)
            System.out.println("This animal has a tail");
        if (this.legs > 0)
            System.out.println("This animal has " + this.legs + " legs");
        if (this.arms > 0)
            System.out.println("This animal has " + this.arms + " arms");
        if (this.wings > 0)
            System.out.println("This animal has " + this.wings + " wings");
        this.move();
        this.eat();
        this.birth();
        this.hibernate();
        System.out.println();
    }


}
