package com.atguigu.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//aspect����
@Aspect
public class MyLogAspect {
	
	//��ʹ��AOP���ʽʱҪʹ��execution==>������Ҫִ�еķ���
	@Pointcut("execution(public int com.atguigu.aop.MyDivision.*(..))")
	public void poinCut() {
		
	}

	@Before("poinCut()")
	public void logStart(JoinPoint joinPoint ) {
		Object[] args = joinPoint.getArgs();
		System.out.println(""+joinPoint.getSignature().getName()+"MyLogAspect......logStart."+Arrays.asList(args)+".������");
	}
	
	@After("poinCut()")
	public void logEnd(JoinPoint joinPoint) {
		System.out.println(""+joinPoint.getSignature().getName()+"��������ִ����");
	}
	
	@AfterReturning(value="poinCut()",returning="result")
	public void logReturn(JoinPoint joinPoint,Object result) {
		System.out.println(""+joinPoint.getSignature().getName()+"����ֵ����"+result+"");
	}
	
	@AfterThrowing(value="poinCut()",throwing="exception")
	public void logException(JoinPoint joinPoint,Exception exception) {
		System.out.println(""+joinPoint.getSignature().getName()+"����ֵ����"+exception+"");
	}
}
