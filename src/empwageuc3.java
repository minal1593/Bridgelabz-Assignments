//part time employee and wage
public class empwageuc3
{
    public static void main(String args[])
    {
        int Part_Time = 1;
        int Full_Time = 1;
        int emp_rate_per_hour = 20;
        int emp_hour, emp_wage;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Part_Time)
            emp_hour = 8;
        else
            emp_hour = 0;
        emp_wage = emp_hour * emp_rate_per_hour;
        System.out.println("Employee's  part time wage is= " + emp_wage);
    }
}
