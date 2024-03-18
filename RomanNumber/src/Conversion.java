public class Conversion {

    public String solution(int n) {
        String miles = "", cientos = "",
                decenas = "", unidades = "",
                numero="";

        miles = miles(n);
        n = miles.equals("MMM")  ? n -3000 : n-0;
        n = miles.equals("MM") ? n -2000 : n-0;
        n = miles.equals("M") ? n - 1000: n-0;

        cientos = cientos(n);

        n = cientos.equals("CM")  ? n -900 : n-0;
        n = cientos.equals("DCCC") ? n -800 : n-0;
        n = cientos.equals("DCC") ? n - 700: n-0;
        n = cientos.equals("DC")  ? n -600 : n-0;
        n = cientos.equals("D") ? n -500 : n-0;
        n = cientos.equals("CD") ? n - 400: n-0;
        n = cientos.equals("CCC")  ? n -300 : n-0;
        n = cientos.equals("CC") ? n -200 : n-0;
        n = cientos.equals("C") ? n - 100: n-0;

        decenas = decenas(n);

        n = decenas.equals("XC")  ? n -90 : n-0;
        n = decenas.equals("LXXX") ? n -80 : n-0;
        n = decenas.equals("LXX") ? n - 70: n-0;
        n = decenas.equals("LX")  ? n -60 : n-0;
        n = decenas.equals("L") ? n -50 : n-0;
        n = decenas.equals("XL") ? n - 40: n-0;
        n = decenas.equals("XXX")  ? n -30 : n-0;
        n = decenas.equals("XX") ? n -20 : n-0;
        n = decenas.equals("X") ? n - 10: n-0;

        unidades = unidades(n);

        numero = miles + cientos + decenas + unidades + numero;

        System.out.println(numero);

        return numero;
    }

    public static String miles (int n) {

        String Rnum="";
        if (n >= 1000) {
            if ( n >=3000) {
                Rnum= Rnum + "MMM";
                return Rnum;
            }

            else if (n >= 2000) {

                Rnum = Rnum + "MM";
                return Rnum;
            }

            else if (n >= 1000) {
                Rnum = Rnum +"M";
                return Rnum;
            }

        }
        return Rnum;
    }

    public static String cientos (int n){

        String Rnum ="";

        if (n >= 900) {
            Rnum = Rnum + "CM";
            return Rnum;
        }
        else if (n >= 800) {
            Rnum = Rnum + "DCCC";
            return Rnum;
        }

        else if (n >= 700) {
            Rnum = Rnum + "DCC";
            return Rnum;
        }
        else if (n >= 600) {
            Rnum = Rnum + "DC";
            return Rnum;
        }
        else if (n >= 500) {
            Rnum = Rnum + "D";
            return Rnum;
        }
        else if (n >= 400) {
            Rnum = Rnum + "CD";
            return Rnum;
        }
        else if (n >= 300) {
            Rnum = Rnum + "CCC";
            return Rnum;
        }
        else if (n >= 200) {
            Rnum = Rnum + "CC";
            return Rnum;
        }
        else if (n >= 100) {
            Rnum = Rnum + "C";
            return Rnum;
        }
        return Rnum;
    }
    public static String decenas (int n) {

        String Rnum="";
        if (n >=90) {
            Rnum = Rnum + "XC";
            return Rnum;
        }

        else if (n >= 80) {
            Rnum = Rnum + "LXXX";
            return Rnum;
        }

        else if (n >= 70) {
            Rnum = Rnum + "LXX";
            return Rnum;
        }

        else if (n >= 60) {
            Rnum = Rnum + "LX";
            return Rnum;
        }

        else if (n >= 50) {
            Rnum = Rnum + "L";
            return Rnum;
        }

        else if (n >=40) {
            Rnum = Rnum + "XL";
            return Rnum;
        }
        else if (n >=30) {
            Rnum = Rnum + "XXX";
            return Rnum;
        }

        else if (n >=20) {
            Rnum = Rnum + "XX";
            return Rnum;
        }

        else if (n >=10) {
            Rnum = Rnum + "X";
            return Rnum;
        }
        return Rnum;


    }
    public static String unidades (int n) {

        String Rnum ="";
        if (n ==9) {
            Rnum = Rnum + "IX";
            return Rnum;
        }
        else if (n == 8) {
            Rnum = Rnum + "VIII";
            return Rnum;
        }
        else if (n == 7) {
            Rnum = Rnum + "VII";
            return Rnum;
        }
        else if (n == 6) {
            Rnum = Rnum + "VI";
            return Rnum;
        }
        else if (n == 5) {
            Rnum = Rnum + "V";
            return Rnum;
        }
        else if (n == 4) {
            Rnum = Rnum + "IV";
            return Rnum;
        }
        else if (n == 3) {
            Rnum = Rnum + "III";
            return Rnum;
        }
        else if (n == 2) {
            Rnum = Rnum + "II";
            return Rnum;
        }
        else if (n == 1) {
            Rnum = Rnum + "I";
            return Rnum;
        }
        return Rnum;
    }
}


