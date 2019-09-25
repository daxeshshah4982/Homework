public class CompareStrings {


    public static void main(String[] args) {
        if(compare1() == true){
            System.out.println("str1 and str2 are same string");
        }
        System.out.println("str1 and str2 are different string");

        compare2();
    }
    public static boolean compare1() {
        String str1 = "I love java";
        String str2 = "I love java";
                                       // without using java's direct method
        if (str1 == str2) {
            return true;
        } else {
            return false;
        }
    }
    public static void compare2(){
        String str3 = "Java is dynamic";
        String str4 = "java is DYNAMIC";
                                         // with direct method equals.to
        if (str3.equals(str4)){
            System.out.println("str3 and str4 are same string");
        }
        System.out.println("str3 and str4 are different string");

    }
}
