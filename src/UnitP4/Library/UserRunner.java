package UnitP4.Library;

public class UserRunner {
    public static void main(String[] args) {
        User u1 = new User("Luisa");
        User u2 = new User("Peter");

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u1.getBooksBorrowed().length);
    }
}
