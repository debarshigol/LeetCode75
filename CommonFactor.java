import java.util.*;

public class CommonFactor {
    public static void main(String[] args) {
        //check whether element is present in both string
        // if yes load it in a list
        // print the common one
        String one = "ABCABAB";
        String two = "ABCAB";
        StringBuilder stringMod = new StringBuilder();
        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();
        int lenOne = oneArr.length;
        int lenTwo = twoArr.length;
        List<Character> list = new ArrayList<>();
        if(lenOne<lenTwo){
            for (int i = 0; i < lenOne; i++) {
                if (oneArr[i]==twoArr[i]){
                    list.add(oneArr[i]);
                }
            }
        }
        else{
            for (int i = 0; i < lenTwo; i++) {
                if (oneArr[i]==twoArr[i]){
                    list.add(oneArr[i]);
                }
            }
        }
        for(char ele: list){
            stringMod.append(ele);
        }
        System.out.println(stringMod);

    }
}
