public class StringExample{
    public static void main(String ar[]){
        //Case-1
        /*String str1="Hello";
        String str2="Hello";
        if(str1==str2){
            System.out.println("str1 & str2 are equal");
        }else{
            System.out.println("str1 & str2 are not equal");
        }
        if(str1.equals(str2)){
            System.out.println("str1 & str2 content are equal");
        }else{
            System.out.println("str1 & str2 content are not equal");
        }*/
        //Case-2
        String str1="Hello";
        String str3=new String("Hello");
        if(str1==str3){
            System.out.println("str1 & str3 are equal");
        }else{
            System.out.println("str1 & str3 are not equal");
        }

        if(str1.equals(str3)){
            System.out.println("str1 & str3 contents are equal");
        }else{
            System.out.println("str1 & str3 contents are not equal");
        }
    }
}