package UnitP4.Library;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Max number of books in the library: ");
        int maxBooks = kb.nextInt();
        System.out.println("Max number of users in the library: ");
        int maxUsers = kb.nextInt();

        Library l1 = new Library(maxBooks, maxUsers);
        System.out.println(l1.getBookTitles().length);
        System.out.println(l1.getUsers().length);

    }
}

class FiveMarks{
    public static void main(String[] args) {
        Library l1 = new Library(100,2);
        l1.addBook("100 years of solitude");
        l1.registerUser("Paulina");
        l1.registerUser("Monica");
        l1.registerUser("Peter");
        l1.printUser();
    }
}

class SixMarks{
    public static void main(String[] args) {
        Library l1 = new Library(100,2);
        l1.addBook("100 years of solitude");
        l1.registerUser("Paulina");
        System.out.println(l1.findUser("Peter"));
        System.out.println(l1.findUser("Paulina"));
        l1.borrowBook("100 years of solitude", "Paulina");
        l1.printUser();
        l1.borrowBook("Unbearable lightness of being","Paulina");
    }
}
