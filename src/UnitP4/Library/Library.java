package UnitP4.Library;

public class Library {
    private String[] bookTitles;
    private User[] users;
    int noBooks = 0;
    int noUsers = 0;

    public Library(int books, int noUsers){
        bookTitles = new String[books];
        users = new User[noUsers];
    }

    public void addBook(String title){
        if (noBooks < bookTitles.length){
            bookTitles[noBooks] = title;
            noBooks++;
        }
        else{
            System.out.println("Array full");
        }
    }

    public int findUser(String name){
        for(int i = 0; i < noUsers; i++){
            if(users[i].getName().equals(name)){
                return users[i].getCountOfBooks();
            }

        }
        return -1;
    }

    public void borrowBook(String bookTitle, String name){
        boolean found = false;
        for(int i = 0; i<noBooks; i++){
            if(bookTitles[i].equals(bookTitle)){
                found = true;
                for(int j = 0; j<noUsers; j++){
                    if(users[j].getName().equals(name)){
                        users[j].addBorrowedBook(bookTitle);
                    }
                }
            }
        }
        if (found == false){
            System.out.println("Book not available");
        }
    }

    public void registerUser(String name){
        if (noUsers < users.length){
            users[noUsers] = new User(name);
            noUsers++;
        }
        else{
            System.out.println("Array full");
        }
    }

    public void printUser(){
        for(int i = 0; i < noUsers; i++){
            System.out.println(users[i]);
        }
    }

    public String[] getBookTitles() {
        return bookTitles;
    }

    public void setBookTitles(String[] bookTitles) {
        this.bookTitles = bookTitles;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
