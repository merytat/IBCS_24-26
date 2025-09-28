package UnitP5.ExamStyleQClocks;

public class AlarmClock extends Clock {
    private int aHours;
    private int aMin;

    public AlarmClock(int h, int m, int ah, int am){
        super(h,m);
        this.aHours = ah;
        this.aMin = am;
    }

    public void defaultAlarm(){
        aHours = 5;
        aMin = 0;
    }

    @Override
    public void advance(){
        super.advance();
        if(getHours() == aHours && getMins() == aMin){
            System.out.println("Alarm!");
        }
        else{
            defaultAlarm();
        }
    }


}
