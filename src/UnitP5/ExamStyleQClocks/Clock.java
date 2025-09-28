package UnitP5.ExamStyleQClocks;

public class Clock {
    private int hours, mins;

    public Clock(int h, int m){
        hours = h;
        mins = m;
    }

    public int getHours() {
        return hours;
    }

    public int getMins() {
        return mins;
    }

    public void advance(){
        mins++;
        if (mins >= 60){
            mins = 0;
            hours++;
        }

        if (hours >= 12){
            hours = 0;
        }
    }

}
