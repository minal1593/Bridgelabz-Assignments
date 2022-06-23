//Calculate wages till a condition of total working hours or days is reached for a month
class empwageuc6
{
    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int emp_rate_per_hour = 20;
    public static final int Number_of_working_days_per_month = 20;
    public static final int Max_hours_in_month = 100;

    public static void main(String args[])
    {
        int emp_hour,emp_wage,total_emp_hours=0,totalworkingdays=0;
        while(total_emp_hours <= Max_hours_in_month && totalworkingdays < Number_of_working_days_per_month)
        {
            totalworkingdays++;
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
            total_emp_hours=emp_hour;
            System.out.println("day"+totalworkingdays+"employee hours"+emp_hour);
        }
        int totalempwage = total_emp_hours * emp_rate_per_hour;
        System.out.println("Total employee wage is = "+totalempwage);
    }

}

