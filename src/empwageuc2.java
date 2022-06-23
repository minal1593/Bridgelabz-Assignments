
//calculate daily employee wage
class empwegeuc2
{
    public static void main(String args[])
    {
        int Full_Time = 1;
        int emp_rate_per_hour = 20;
        int emp_hour,emp_wage;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Full_Time)
        {
            emp_hour = 8;
            emp_wage = emp_hour * emp_rate_per_hour;
            System.out.println("Employee wage ="+emp_wage);

        }
        else
        {
            emp_hour = 0;
        }

    }

}


