package Programmers;


import java.util.HashMap;
import java.util.Map;

// getOrDefault를 활용하는 방법도 있음!
public class MaratonPlayer {

    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> hm = new HashMap<>();

        for(String s : participant) {
            if(hm.containsKey(s)) {
                hm.put(s, hm.get(s)+1);
            } else {
                hm.put(s,1);
            }
        }

        for(String s : completion) {
            if(hm.get(s)==1) {
                hm.remove(s);
            } else {
                hm.put(s,hm.get(s)-1);
            }
        }

        String answer = null;

        for(String s : hm.keySet()) {
            answer = s;
        }


        return answer;
    }

    public static void main(String args[]) {


        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        MaratonPlayer m = new MaratonPlayer();
        m.solution(participant, completion);


    }


}
