package egovframework.sample.service.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class SampleAdvice {
	public Object aroundLogic(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().getName();

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		Object obj = pjp.proceed();
		stopWatch.stop();

		System.out.println(method + "() 메소드 수행에 걸린 시간: " + stopWatch.getTotalTimeMillis() + "(ms)초");
		return obj;
	}
}
