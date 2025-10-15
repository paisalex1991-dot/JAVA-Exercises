public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello tim ");

        boolean isAlien = true;
        if (!isAlien)
        {
            System.out.println("It is not an Alien !");
        }
        else
        {
            System.out.println("Tim is the Alien !");
        }

        int topScore = 100;
        if (topScore >= 100)
        {
            System.out.println("You got the high scorre");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) || (topScore < 100))
        {
            System.out.println("greater than second top score and less than 100");
        }

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        String makeOfCar = "Audi";
        boolean isDomestic = makeOfCar == "GM" ? false : true;

        if (isDomestic)
        {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "Is Domestic" : "Not domestic";
        System.out.println(s);

        double val1 = 20.00;
        double val2 = 80.00;
        double rez = 0.00;

        rez = (val1 + val2) * 100;

        double remainder = rez % 40.00;

        boolean status = (remainder == 0.00) ? true : false;

        System.out.println(status);

        if (status == false)
        {
            System.out.println("got some remainder");
        }

    }

}
