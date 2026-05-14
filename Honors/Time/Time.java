public class Time {
    private int hour;
    private int min;
    private int sec;
    private int pm;
    private int milHour;

    // default constructor
    public Time() {
        hour = 0;
        min = 0;
        sec = 0;
        pm = 0;
        milHour = 0;
    }
    
    // specific constructor
    public Time(int hour, int min, int sec, int pm) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.pm = pm;
        calcMilHour();
    }
    
    public void calcMilHour() {
        if (hour == 12) {
            if (pm == 0) {
                milHour = 0;
            } else if (pm == 1) {
                milHour = 12;
            }
        } else if (pm == 1 && hour != 12) {
            milHour = hour + 12;
        }
    }
    
    public void setTime(int h, int m, int p) {
        hour = h;
        min = m;
        pm = p;
        calcMilHour();
    }
    
    public void displayMilTime() {
        System.out.printf("%02d:%02d:%02d\n", milHour, min, sec);
    }
    
    public String toString() {
        if (pm == 1) {
            return (String.format("%02d", hour)) + ":" + (String.format("%02d", min)) + ":" + (String.format("%02d", sec)) + " PM";
        } else {
            return (String.format("%02d", hour)) + ":" + (String.format("%02d", min)) + ":" + (String.format("%02d", sec)) + " AM";
        }
    }
}
