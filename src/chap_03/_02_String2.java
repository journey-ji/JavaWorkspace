package chap_03;

public class _02_String2 {
    public static void main(String[] args) {

        String s = "          I like Java and Python and C.         ";

        // 문자열 반환
        System.out.println(s.replace(" and",","));


        // 공백 제거
        System.out.println(s.trim());

        System.out.println(s.trim().concat("test!!"));
    }
}
