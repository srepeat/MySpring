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

//aspect的类
@Aspect
public class MyLogAspect {
	
	//在使用AOP表达式时要使用execution==>加上需要执行的方法
	@Pointcut("execution(public int com.atguigu.aop.MyDivision.*(..))")
	public void poinCut() {
		
	}

	@Before("poinCut()")
	public void logStart(JoinPoint joinPoint ) {
		Object[] args = joinPoint.getArgs();
		System.out.println(""+joinPoint.getSignature().getName()+"MyLogAspect......logStart."+Arrays.asList(args)+".运行了");
	}
	
	@After("poinCut()")
	public void logEnd(JoinPoint joinPoint) {
		System.out.println(""+joinPoint.getSignature().getName()+"结束方法执行了");
	}
	
	@AfterReturning(value="poinCut()",returning="result")
	public void logReturn(JoinPoint joinPoint,Object result) {
		System.out.println(""+joinPoint.getSignature().getName()+"返回值方法"+result+"");
	}
	
	@AfterThrowing(value="poinCut()",throwing="exception")
	public void logException(JoinPoint joinPoint,Exception exception) {
		System.out.println(""+joinPoint.getSignature().getName()+"返回值方法"+exception+"");
	}
}
