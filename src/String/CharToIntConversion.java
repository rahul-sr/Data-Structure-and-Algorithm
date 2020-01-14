package String;

public class CharToIntConversion {
    public static void main(String args[]) throws Exception {
        String test1 = "-88297 248252140B12 37";
        int number = getNumber(test1);
        System.out.println(number);

        String test2 = "75 6 ";
        number = getNumber(test2);
        System.out.println(number);

        String test3 = "+349A756";
        number = getNumber(test3);
        System.out.println(number);
    }

    static int getNumber(String str) {
        int n=0;
        int start = 0;
        int setSign = 1;

        if(str.charAt(0) == '-') {
            setSign = -1;
            start = 1;
        } else if (str.charAt(0) == '+') {
            setSign = 1;
            start = 1;
        }

        for(int i=start;i<str.length();i++) {
            if(str.charAt(i) >= (char) 48 && str.charAt(i) <= (char) 57) {
                int num = (int) str.charAt(i) - 48;
                n = n*10 + num;
            } else {
                break;
            }
        }

        return n*setSign;
    }
}
