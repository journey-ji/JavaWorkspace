package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교

        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        
        // 대소문자 구분 없이 비교
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화

        s1 = "1234";
        s2 = "1234";

        
    }
}
