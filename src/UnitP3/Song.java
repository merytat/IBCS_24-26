package UnitP3;

public class Song {
    private String artist;
    private String album;
    private String title;
    private double length;
    private boolean isRemastered;


    public Song(String artist, String album, String title, double length, boolean isRemastered) {
        this.artist = artist;
        this.album = album;
        this.title = title;
        this.length = length;
        this.isRemastered = isRemastered;
    }

    @Override
    public boolean equals(Object o){
        Song ob = (Song)o;
        if(this.length == ob.length){
            if(this.isRemastered == false || !ob.isRemastered){
                return false;
            }
            return true;
        }
        return false;
    }

}

class SongRunner {
    public static void main(String[] args) {
        Song song1 = new Song("ABBA", "Arrival", "Dancing Queen", 3.46, true);
        Song song2 = new Song("ABBA", "Arrival", "Dancing Queen", 3.46, true);
        Song song3 = new Song("ABBA", "Arrival", "Dancing Queen", 3.46, false);
        Song song4 = new Song("ABA", "Arrival", "Dancing Queen", 3.46, false);


        System.out.println("Deleting repeated songs:  ");
        boolean song1song2areEqual = song1.equals(song2);//complete this statement (should be true)
        boolean song1song3areEqual = song1.equals(song3);//complete this statement (should be false)
        boolean song1song4areEqual = song1.equals(song4);//complete this statement (should be false)
        System.out.println(song1song2areEqual);
        System.out.println(song1song3areEqual);
        System.out.println(song1song4areEqual);

        if(song1song2areEqual){
            song2 = null;
        }
        if(song1song3areEqual){
            song3 = null;
        }
        if(song1song4areEqual){
            song4 = null;
        }


    }
}

