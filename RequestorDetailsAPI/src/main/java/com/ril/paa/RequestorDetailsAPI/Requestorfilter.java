package com.ril.paa.RequestorDetailsAPI;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;



@Component
public class Requestorfilter implements Filter {
	@Override
	public void destroy()
	{
		
	}
	
	@Override
	public void init(FilterConfig filterconfig) throws ServletException{
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletResponse res=(HttpServletResponse) response;
		HttpServletRequest   req=(HttpServletRequest) request;
		
		res.setHeader("Access-Control-Allow-Origin", "*");
		res.setHeader("Access-Control-Allow-Methods", "POST,PUT,GET,DELETE");
		res.setHeader("Access-Control-Max-Age", "3600");
		res.setHeader("Access-Control-Allow-Headers", "content-type");

		if(!"OPTIONS".equalsIgnoreCase(req.getMethod())) {
			chain.doFilter(req, res);
		}

	}
}
