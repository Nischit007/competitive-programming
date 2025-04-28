// public class SkipCharacter {
// 	static String skip(String c,int index,char skipChar){
// 	String newString="";
// 	if(index==c.length())return newString;
// 	if(c.charAt(index)!=skipChar){
// 	newString+=c.charAt(index);
// 	}
	
// 	String afterCall=skip(c,index+1,skipChar);
// 	newString+=afterCall;
// 	return newString;
// 	}


//     public static void main(String[] args) {
//        String newString= skip("baccda",0,'a');

//          System.out.println(newString);
//     }
// }







public class SkipCharacter {
    static String skip(String c, int index, String skipString) {
        String newString = "";
        if (index == c.length()) return newString;

        int skipCharLength = skipString.length();

        if (index <= c.length() - skipCharLength && c.substring(index, index + skipCharLength).equals(skipString)) {
           
            return skip(c, index + skipCharLength, skipString);
        } else {
            newString += c.charAt(index);
            String afterCall = skip(c, index + 1, skipString);
            newString += afterCall;
            return newString;
        }
    }

    public static void main(String[] args) {
        String newString = skip("helloappleball", 0, "apple");
        System.out.println(newString);
    }
}
