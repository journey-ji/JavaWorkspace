package chap_03;

public class _01_String {
    public static void main(String[] args) {
        // 문자열

        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);

        // 포함 관계
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("C#"));
    }
}
