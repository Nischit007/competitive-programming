
import java.util.HashMap;

class Main3 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))&& map1.get(s.charAt(i))!=t.charAt(i)){
                
                // return false;
            }
            if(map2.containsKey(t.charAt(i))&& map2.get(t.charAt(1))!=s.charAt(i)){
                // return false;
            }
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),t.charAt(i));
            }
            if(!map2.containsKey(t.charAt(i))){
                 map2.put(t.charAt(i),s.charAt(i));
            }

           

        }
        System.out.println(map1);
        System.out.println(map2);
        return true;
    }
    public static void main(String[] args){
        System.out.println(isIsomorphic("paper","title"));
    }
}