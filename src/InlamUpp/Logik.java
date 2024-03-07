package InlamUpp;

import java.util.HashMap;

public class Logik {

    HashMap<String, String> logik = new HashMap<>();

    public Logik() {

        logik.put("A", "*-");
        logik.put("*-", "A");

        logik.put("B", "-***");
        logik.put("-***", "B");

        logik.put("C", "-*-*");
        logik.put("-*-*", "C");

        logik.put("D", "-**");
        logik.put("-**", "D");

        logik.put("E", "*");
        logik.put("*", "E");

        logik.put("F", "**-*");
        logik.put("**-*", "F");

        logik.put("G", "--*");
        logik.put("--*", "G");

        logik.put("H", "****");
        logik.put("****", "H");

        logik.put("I", "**");
        logik.put("**", "I");

        logik.put("J", "*--");
        logik.put("*--", "J");

        logik.put("K", "-*-");
        logik.put("-*-", "K");

        logik.put("L", "*-**");
        logik.put("*-**", "L");

        logik.put("M", "--");
        logik.put("--", "M");

        logik.put("N", "-*");
        logik.put("-*", "N");

        logik.put("O", "---");
        logik.put("---", "O");

        logik.put("P", "*--*");
        logik.put("*--*", "P");

        logik.put("Q", "--*-");
        logik.put("--*-", "Q");

        logik.put("R", "*-*");
        logik.put("*-*", "R");

        logik.put("S", "***");
        logik.put("***", "S");

        logik.put("T", "-");
        logik.put("-", "T");

        logik.put("U", "**-");
        logik.put("**-", "U");

        logik.put("V", "***-");
        logik.put("***-", "V");

        logik.put("W", "*--");
        logik.put("*--", "W");

        logik.put("X", "-**-");
        logik.put("-**-", "X");

        logik.put("Y", "-*--");
        logik.put("-*--", "Y");

        logik.put("Z", "--**");
        logik.put("--**", "Z");

        logik.put("1", "*----");
        logik.put("*----", "1");

        logik.put("2", "**---");
        logik.put("**---", "2");

        logik.put("3", "***--");
        logik.put("***--", "3");

        logik.put("4", "****-");
        logik.put("****-", "4");

        logik.put("5", "*****");
        logik.put("*****", "5");

        logik.put("6", "-****");
        logik.put("-****", "6");

        logik.put("7", "--***");
        logik.put("--***", "7");

        logik.put("8", "---**");
        logik.put("---**", "8");

        logik.put("9", "----*");
        logik.put("----*", "9");

        logik.put("0", "-----");
        logik.put("-----", "0");

        logik.put(".", "*-*-*-");
        logik.put("*-*-*-", ".");

        logik.put(",", "--**--");
        logik.put("--**--", ",");

        logik.put("?", "**--**");
        logik.put("**--**", "?");
    }


    public String getMorse(String testdata) {
        testdata = testdata.toUpperCase();
        String Morse = logik.get(testdata); // om morse är null så ska error komma fram
        if (Morse == null) {
            Morse = "Error";
        }
        return Morse;

    }

    public String getAlpha(String testdata) {
        testdata = testdata.toUpperCase();
        String Alpha = logik.get(testdata);
        if (Alpha == null){
            Alpha = "Error";
        }
        return Alpha;
    }
}
