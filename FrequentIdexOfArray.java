import java.util.HashMap;
import java.util.Map;

public class FrequentIdexOfArray {
    public int findMostFrequent(int [] entry){
        Map<Integer, Integer> countmAP = new HashMap<>();
        int mostFrequent = entry[0];
        int maxCount = 0;
        for (int i = 0; i < entry.length; i++){
            int num = entry[i];
            int count = countmAP.getOrDefault(num, 0) +1;
            countmAP.put(num, count);
            if (count > maxCount){
                mostFrequent = num;
                maxCount = count;
            }
        }
        return  mostFrequent;
    }
}
