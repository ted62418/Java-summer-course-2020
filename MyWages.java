public class MyWages
{
    public static void main(String[] arg)
    {
        double Pay = 13;
        
        double MonHours = 0; 
        double TuesHours = 6.5;
        double WedHours = 0;
        double ThursHours = 6.5;
        double FriHours = 6.5;
                
        double weekHours = MonHours + TuesHours + WedHours + ThursHours + 
                FriHours;
        double weekMoney = weekHours * Pay;
        
        double PayCheck = 2 * weekMoney;
        
        System.out.println("If you take off Monday and Wednesday...");
        System.out.println("and work as usual Tues, Thurs, and Fri");
        System.out.println("you will make approximately ");
        System.out.println(weekMoney + " per week and " + PayCheck + 
                " gross per paycheck.");
    }
}