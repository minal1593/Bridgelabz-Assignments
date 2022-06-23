//Calculating wages for a month
public class empwageuc5
{
    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int emp_rate_per_hour = 20;
    public static final int Number_of_working_days_per_month = 20;

    public static void main(String args[])
    {
        int emp_hour,emp_wage,totalempwage=0;
        for(int day=0; day < Number_of_working_days_per_month; day++)
        {
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
            totalempwage += emp_wage;
            System.out.println("Employee wage is = " + emp_wage);
        }
        System.out.println("Total employee wage is : "+totalempwage);
    }
}
