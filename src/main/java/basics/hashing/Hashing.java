package basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public int[] countFrequency(int n, int x, int[] nums){
        int max = n < x ? x :n;
        int[] arr = new int[max];
        for(int i : nums){
            arr[i-1]++;
        }
        if(max == n)return arr;
        int[] f = new int[n];
        for(int i = 0;i < n;i++){
            f[i] = arr[i];
        }
        return f;
    }

    public int[] getFrequenciesOfAllUniqueElements(int []v) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : v){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int maxfreq=0,minfreq=v.length;
        int maxele=0, minele=0;
        for(Map.Entry<Integer,Integer> it : map.entrySet()){

            int count=it.getValue();
            int element=it.getKey();

            if(count>maxfreq || (count==maxfreq && element<maxele) ){

                maxele=element;
                maxfreq=count;
            }
            if(count<minfreq || (count==minfreq && element<minele)){
                minele=element;
                minfreq=count;
            }
        }

        return new int[]{maxele,minele};
    }
}
