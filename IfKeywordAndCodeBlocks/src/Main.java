public class SpeedConverter {
    public static int toMilesPerHour (double KilometersPerHour){

        long status;

        if(KilometersPerHour < 0)
        {
            status = -1;
        }
        else
        {
            status = Math.round(KilometersPerHour * 0.621371192);
        }

        return (int) status;
    }


    public static void printConversion (double kilometersPerHour){

        long milesPerHour;

        milesPerHour = Math.round(kilometersPerHour * 0.621371192);

        if (kilometersPerHour >= 0)
        {
            System.out.print (kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
        else
        {
            System.out.print ("Invalid Value");
        }
    }
}

