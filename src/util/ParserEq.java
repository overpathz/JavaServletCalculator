package util;

public class ParserEq {

    private static double result;

    public static double getResult() {
        return result;
    }

    public static void setResult(double result) {
        ParserEq.result = result;
    }

    public static double parse(String string) {
        String[] splittedArray = string.strip().split("");

        String left = "";
        String right = "";
        String sign = "";
        int indexNext= 0;
        int indexS = 0;
        double result = 0;

        for (int i = 0; i < splittedArray.length; i++) {
            if (splittedArray[i].equals("+") || splittedArray[i].equals("-") || splittedArray[i].equals("/") || splittedArray[i].equals("*")) {
                sign = splittedArray[i];
                indexNext = i+1;
                indexS = i;
            }
        }

        for (int i = 0; i < indexS; i++) {
            left += splittedArray[i];
        }

        for (int i = indexNext; i < splittedArray.length; i++) {
            right += splittedArray[i];
        }


        double leftD = Double.parseDouble(left);
        double rightD = Double.parseDouble(right);


        if (sign.equals("+")) {
            result = leftD + rightD;
        } else if (sign.equals("-")) {
            result = leftD - rightD;
        } else if (sign.equals("/")) {
            result = leftD / rightD;
        } else if (sign.equals("*")) {
            result = leftD * rightD;
        }

        return result;
    }
}

