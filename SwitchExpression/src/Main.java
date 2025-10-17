public class Main {

    public static void main (String[] args)
    {
        int[] days = {0,1,2,3,4,5,6,7};

        for (int i=0;i<8;i++)
        {
            dayOfTheWeek(days[i]);
        }

    }

    public static void dayOfTheWeek(int day)
    {
        String nameOfTheDay =  switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day!";

        };

        System.out.println("The " + day + "'s day of the week is " +  nameOfTheDay);
    }

}
