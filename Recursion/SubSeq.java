


// public class SubSeq {

//     static void subSeq(String p,String up){
//         if(up.isEmpty()){
//         System.out.println(p);
//         return;
//         }
//         char ch=up.charAt(0);
//         subSeq(p+ch,up.substring(1));
//         subSeq(p,up.substring(1));
        
//     }

//     public static void main(String[] args) {
//         subSeq("", "abc");
//     }
// }

import java.util.ArrayList;

public class SubSeq {

    static ArrayList<String> subSeq(String p,String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
        list.add(p);
        return list;
        }
        
        char ch=up.charAt(0);
        ArrayList<String> newString= subSeq(p+ch,up.substring(1));
        ArrayList<String> newStr=subSeq(p,up.substring(1));
         list.addAll(newString);
        list.addAll(newStr);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String>str= subSeq("", "abc");
        for(String s:str){
            System.out.println("in subset "+s);
        }
    }
}