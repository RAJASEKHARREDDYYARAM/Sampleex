package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.LookupDispatchAction;
import org.apache.struts.actions.MappingDispatchAction;

import bean.RegForm;
import dao.EmployeeDao;

public class RegController extends MappingDispatchAction {
	
	
	
	public ActionForward employeesave(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//read data using req object
		/*int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		float salary=Float.parseFloat("salary");*/
		
		
		//read data from formbean
		RegForm rf=(RegForm) form;
		int id=rf.getId();
		String name=rf.getName();
		String email=rf.getEmail();
		float salary=rf.getSalary();
		EmployeeDao dao=new EmployeeDao();
		int i=dao.save(id, name, email, salary);
		if(i!=0)
			return mapping.findForward("sucess");
		else
			return mapping.findForward("fail");
	
	}

	public ActionForward employeeupdate(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//read data using req object
		/*int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		float salary=Float.parseFloat("salary");*/
		
		
		//read data from formbean
		RegForm rf=(RegForm) form;
		int id=rf.getId();
		String name=rf.getName();
		String email=rf.getEmail();
		float salary=rf.getSalary();
		EmployeeDao dao=new EmployeeDao();
		int i=dao.update(id, name, email, salary);
		if(i!=0)
			return mapping.findForward("sucess");
		else
			return mapping.findForward("fail");
	
	}

	
}
