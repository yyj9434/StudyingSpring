package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {
	public void printLog() {
		System.out.println("[공통로그] 비지니스 로직 수행 전 동작");
	}

}
