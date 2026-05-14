public class MyProgram
{
    public static void main(String[] args)
    {
        Time clock1 = new Time(12, 10, 0, 0);
        Time clock2 = new Time();
        Time clock3 = new Time(12, 9, 5, 1);
        
        System.out.println(clock1.toString());
        clock1.displayMilTime();
        // 12:10:00 AM
        
        clock2.setTime(3, 30, 1);
        clock2.displayMilTime();
        // 15:30:00
        
        System.out.println(clock3.toString());
        clock3.displayMilTime();
    }
}
