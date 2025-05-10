package UnitP4.FieldTripOrganizer;

public class TripAllocator {
    private Trip[] allTrips = new Trip[16];
    // trips are stored in the ascending order of the trip number
    private Student[] allStudents = new Student[250];

    // assigns a trip to a student
    public void assignTrip(Student s) {
        // code missing
        //check the list of s preferences one by one
        for (int i = 0; i < s.sPreferenceList.length; ){
            if(allTrips[s.sPreferenceList[i]].getSpotsFilled() < 25){
                allTrips[s.sPreferenceList[i]].addStudentToTripList(s);
                allTrips[s.sPreferenceList[i]].updateSpotsFilled();
                i = s.sPreferenceList.length;
            }
        }
        //if a trip is available assign st to trip
        //update trip info
    }

    public void displayPlacesLeft() {// code missing
    }
}
