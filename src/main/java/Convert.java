

public class  Convert {

    static String convertRub(double result) {
        String rub="рубл";

        if ( result>=11 &&  result<=14) {
           rub += "ей";
       }else {
            result %= 10;
           if (result == 1) {
               rub += "ь";
           } else if (result >= 2 && result<= 4) {
               rub += "я";
           } else {
               rub += "ей";
           }
       }
        return rub;
    }
    }


