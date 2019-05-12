package practiceboard.aop;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BoardSession {
	
	public int checksession(HttpSession session){
		return (Integer)session.getAttribute("personpid");
	}
	
}
