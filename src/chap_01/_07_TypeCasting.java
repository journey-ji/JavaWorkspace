package chap_01;

// 형변환 예시
public class _07_TypeCasting {
    public static void main(String[] args) {


        int score = 93;
        System.out.println(score);

        // 아래와 같이 변환하고 싶은 형을 괄호 안에 넣어서 표현함
        System.out.println((float) score);

        float score_f = 93.3f;
        double score_d = 98.8;

        System.out.println((int) score_f);
        System.out.println((int) score_d);


        score = 93 + (int)98.8;
        System.out.println(score);


        // 자동 형변환 기준.
        // int -> long -> float -> double
        // 위와 반대의 경우는 자동 형변환 불가. 명시해줘야함



        // 숫자 -> 문자열로

        String s1 = String.valueOf(93.3);
        System.out.println(s1+"입니다");
        
        s1 = Integer.toString(93);
        System.out.println(s1+"입니다");

        // 문자열 -> 숫자로
        int s2 = Integer.parseInt("82");
        System.out.println(s2+2);


    }
}
