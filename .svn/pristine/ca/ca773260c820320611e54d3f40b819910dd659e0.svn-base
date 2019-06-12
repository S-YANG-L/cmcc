package com.htyw.app.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenFilter extends HttpServlet implements Filter{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		String a =  request.getRequestURI();
		System.out.println("过滤器获取到a = "+ a);
		if("/cmcc/MyInfo/login".equals(a) || "/cmcc/MyInfo/selectByPhone".equals(a) || "/cmcc/CustodianLongin/gologin".equals(a)){
			arg2.doFilter(arg0, arg1);     
			return;
		}else{
			String token = request.getParameter("token");
			System.out.println("过滤器获取到token = "+ token);
			/*Long tokenExpiryTime = Long.valueOf(request.getParameter("tokenExpiryTime")).longValue();
			long now = System.currentTimeMillis();
			if(now > tokenExpiryTime){
				response.sendRedirect("127.0.0.1:9090/cmcc/html/home.html");
			}else{
				arg2.doFilter(arg0, arg1);
			}*/
			if("null".equals(token) || "".equals(token) || null==token){
	//			String str = new String("Token已过期，请重新登录", "UTF-8");
				String str = "Token已过期，请重新登录";
				response.setCharacterEncoding("UTF-8");
				ServletOutputStream out = response.getOutputStream();
				out.write(str.getBytes("UTF-8"));
				out.flush();
				out.close();
				return;
			}
		}
		arg2.doFilter(arg0, arg1);     
		return;   
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
}
