package hello.hellospring.Controller;


import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;
    @Autowired // MemberService를 Controller에 연결
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
