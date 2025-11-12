package dev.lps;

public class Main {

    public static void main (String[] args){

        Integer boxedInt = Integer.valueOf(15);
       // Integer deprecatedBoxing = new Integer(15); //old code nok
        int unboxedInt = boxedInt.intValue();

        //Automatic boxing
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        //System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        }

        private static Double getDoubleObject(){
        return Double.valueOf(100.00);
        }

        private static Double getLiteralDoublePrimitive() {
            return 100.00;
        }
}
