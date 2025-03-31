public class MargeString_1768 {
    public static void main(String[] args) {
        String one = "abc";
        String two = "pqrstuv";
        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();
        StringBuilder mod = new StringBuilder();
        int lenOne = one.length();
        int lenTwo = two.length();
        if (lenOne >= lenTwo) {
            for (int i = 0; i < lenTwo; i++) {
                mod.append(oneArr[i]);
                mod.append(twoArr[i]);
            }
            for (int j = lenTwo; j < lenOne; j++) {
                mod.append(oneArr[j]);
            }
        }
        else{
            for (int i = 0; i < lenOne; i++) {
                mod.append(oneArr[i]);
                mod.append(twoArr[i]);
            }
            for (int j = lenOne; j < lenTwo; j++) {
                mod.append(twoArr[j]);
            }

        }
        System.out.println(mod);
    }
}
