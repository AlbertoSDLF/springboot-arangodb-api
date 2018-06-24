package com.asitc.neo4japi.mq;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MqInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void afterCompletion(final HttpServletRequest request, final HttpServletResponse response,
			final Object handler, final Exception ex) throws Exception {
		if (ex != null) {
			ex.printStackTrace();
		}
	}
}
