package hello.core.scan;

import hello.core.AutoAppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoAppConfigTest {

    @DisplayName("")
    @Test
    public void basicScan() {
    	// given
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

    	// when
        MemberService memberService = ac.getBean(MemberService.class);
    	// then
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
