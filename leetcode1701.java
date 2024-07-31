package Test;

class gcdofstring{
    public String gcdofstrings(String str1,String str2){
        if(str2.equals(str1)){
            return str1;
        }
        if(str1.startsWith(str2)){
          return  gcdofstrings(str1.substring(str2.length()), str2);
        }
        return "";
    }
}
public class leetcode1701 {
    public static void main(String[] args) {
        gcdofstring gcdofstring = new gcdofstring();
        String str1 = "ABABABAB";
        String str2 = "AB";
       String result =  gcdofstring.gcdofstrings(str1,str2);
        System.out.println(result);
    }
}
