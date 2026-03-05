public abstract class Animal {
    public boolean coldBlooded;
    public String skinType;
    public boolean tail;
    public int legs;
    public int arms;
    public boolean wings;
    public abstract void move();
    public abstract void eat();
    public abstract void hibernate();
    public abstract void birth();

    public void getInfo(){
        System.out.println("The animal is " + this.getClass().getName()+ ":");
        System.out.println("This animal is " + (coldBlooded? "cold blooded" : "Warm blooded"));
        if (skinType != null) System.out.println("This animal is covered in " + skinType);
        if (tail) System.out.println("This animal is tail");
        if (legs > 0) System.out.println("This animal has"+ legs +"legs");
        if (arms > 0) System.out.println("This animal has"+ arms +"arms");
        if (wings) System.out.println("This animal has"+ wings +"wings");
        move();
        eat();
        hibernate();
        birth();
        System.out.println();
    }


}

