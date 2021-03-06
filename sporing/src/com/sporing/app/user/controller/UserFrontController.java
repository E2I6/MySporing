package com.sporing.app.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sporing.app.action.ActionForward;

public class UserFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length());
		ActionForward forward = null;
		
		if(command.equals("/user/UserJoinOk.us")) {
			
		}else if(command.equals("/user/UserJoin.us")) {
			
		}else if(command.equals("/user/UserLoginOk.us")) {
			
		}else if(command.equals("/app/UserLogin.us")) {
	          forward = new ActionForward();
	          forward.setRedirect(false);
	          forward.setPath("/app/login.jsp");
	    }else if(command.equals("/user/UserLoginOk.us")) {
	          try {
	              forward = new UserLoginOk().execute(req, resp);
	           } catch (Exception e) {
	              System.out.println("로그인 오류 " + e);
	           }
	           
	    }else if(command.equals("/user/UserLogoutOk.us")) {
			
		}else if(command.equals("/user/UserFindId.us")) {
			
			
			
			
			
			
			
			
		}else if(command.equals("/user/UserDeleteOk.us")) {
			try {
				forward=new UserDeleteOk().execute(req, resp);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
		}else if(command.equals("/user/UserDelete.us")) {
		
		}else if(command.equals("/user/UserModifyOk.us")) {
			
			
		}else if(command.equals("/user/UserModify.us")) {
			forward=new ActionForward();
			
			
		}else if(command.equals("/user/UserWriteListOk.us")) {
			
			
		}else if(command.equals("/user/UserRecruitWriteListOk.us")) {
			
		}else if(command.equals("/user/UserIntroWriteListOk.us")) {
			
		}else if(command.equals("/user/UserRecruitReqListOk.us")) {
			
		}else if(command.equals("/user/UserRecruitReqYesOk.us")) {
			
		}else if(command.equals("/user/UserTeamListOk.us")) {
			
		}else if(command.equals("/user/UserTeamReqListOk.us")) {
			
		}else if(command.equals("/user/UserTeamReqYesOk.us")) {
			
		}else if(command.equals("/user/UserRecruitWriteDetailOk.us")) {
			
		}else if(command.equals("/user/UserIntroWriteDetailOk.us")) {
			
		}else if(command.equals("/user/UserTeamWriteDetailOk.us")) {
			
		}
		
		if(forward != null) {
			 if(forward.isRedirect()) {
				 resp.sendRedirect(forward.getPath());
			 }else {
				 RequestDispatcher dispatcher = req.getRequestDispatcher(forward.getPath());
				 dispatcher.forward(req, resp);
			 }
		 }
		
		
		
	}
}

