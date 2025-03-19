package UnitP4.Library;

import java.util.Arrays;

public class User {
    private String name;
    private String[] booksBorrowed = new String[10];
    private int countOfBooks = 0;

    public User(String name) {
        this.name = name;
    }

    public void addBorrowedBook(String title){
        if(countOfBooks<booksBorrowed.length){
            booksBorrowed[countOfBooks]= title;
            countOfBooks++;
        }
        else{
            System.out.println("You cannot borrow more books at the moment");
        }
    }

    @Override
    public String toString() {
        return name + ':' +  "Total books borrowed: "  + countOfBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(String[] booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    public int getCountOfBooks() {
        return countOfBooks;
    }

    public void setCountOfBooks(int countOfBooks) {
        this.countOfBooks = countOfBooks;
    }
}
