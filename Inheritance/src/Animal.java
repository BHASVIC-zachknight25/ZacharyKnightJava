public abstract class Animal {
    public boolean coldBlooded;
    public String skinType;
    public boolean tail;
    public int legs;
    public int arms;
    public boolean wings;

    public Animal(boolean coldBlooded, String skinType, boolean tail, int legs, int arms, boolean wings) {
    }
    public abstract void move();
    public abstract void eat();
    public abstract void hibernate();
    public abstract void birth();

}
