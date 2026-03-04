import java.util.Scanner;

public class Receptionist {
    private String name;
    private int roomNo;


    Receptionist(String name) {
        this.name = name;
    }
    public void checkIn(Hotel myhotel, Customer customer) {
        System.out.println("Welcome to check in!");
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("What room number do you want to have "+name+" ?");
        int roomNo = in.nextInt();
        System.out.println(name+" has been checked into room "+roomNo);

    }

    public void checkOut(Hotel myHotel, Customer customer1, Manager myManager) {
        System.out.println("Welcome to check out!");
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("What room number are you checking out of "+name+" ?");
        int roomNo = in.nextInt();
        System.out.println(name+" has been checked out of room "+roomNo);
    }
}