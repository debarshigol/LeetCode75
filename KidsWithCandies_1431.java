import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies_1431 {
    public static void main(String[] args) {
        //traverse through the array-each element
        // add the extra num to that ele
        // check if it is the greatest
        // return true if yes, else false
        // store the output in a arrList
        // print the list
        int[] candies = {4,2,1,1,2};
        int len = candies.length;
        int extraCandies = 1;
        List<String> list = new ArrayList<>();
        for(int i: candies){
            int modCandiesNum = extraCandies+i;
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (modCandiesNum>=candies[j]){
                    count++;
                }
            }
            if(count==len){
                list.add("true");
            }
            else {
                list.add("false");
            }
        }
        System.out.println(list.toString());
    }
}
