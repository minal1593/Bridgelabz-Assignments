//calculate employee wage using switch
public class empwageuc4
{
    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int emp_rate_per_hour = 20;

    public static void main(String args[])
    {

        int emp_rate_per_hour = 20;
        int emp_hour,emp_wage;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck)
        {
            case Is_Part_Time:
                emp_hour = 4;
                break;
            case Is_Full_Time:
                emp_hour = 8;
                break;
            default:
                emp_hour = 0;
        }
        emp_wage = emp_hour * emp_rate_per_hour;
        System.out.println("Employee wage is = "+emp_wage);

    }
}

