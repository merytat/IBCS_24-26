package UnitP4.FieldTripOrganizer;

import java.util.ArrayList;

public class Trip {
    private int tripNumber;
    private String tripTitle;
    private String tripDesc;
    private int spotsFilled;
    private boolean isRunning;
    private ArrayList<String> tList = new ArrayList<>();

    public Trip(int tn, String tt, String td, int sf, boolean ir){
        this.tripNumber = tn;
        this.spotsFilled = sf;
        this.tripDesc = td;
        this.isRunning = ir;
        this.tripTitle = tt;
    }

    public void updateSpotsFilled(){
        this.spotsFilled++;
    }

    public void addStudentToTripList(Student a){
        
    }

    public int getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(int tripNumber) {
        this.tripNumber = tripNumber;
    }

    public String getTripTitle() {
        return tripTitle;
    }

    public void setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle;
    }

    public String getTripDesc() {
        return tripDesc;
    }

    public void setTripDesc(String tripDesc) {
        this.tripDesc = tripDesc;
    }

    public int getSpotsFilled() {
        return spotsFilled;
    }

    public void setSpotsFilled(int spotsFilled) {
        this.spotsFilled = spotsFilled;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public ArrayList<String> gettList() {
        return tList;
    }

    public void settList(ArrayList<String> tList) {
        this.tList = tList;
    }
}
