package com.campbuxx.controllers;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.campbuxx.controllers.HomeController;
import com.campbuxx.pojo.Post;
import com.campbuxx.pojo.User;
import com.campbuxx.services.HomeService;

@Controller
@SessionAttributes
public class HomeController {
	private static final Logger logger = Logger.getLogger(HomeController.class);
	@Autowired
	private HomeService homeService;

	/**
	 * index demo
	 * 
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping( { "/", "/index" })
	public String showHomePage(Model model) throws IOException {
		
		return "index";
	}

	/**
	 * login
	 * 
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping( value ={ "/login" }, method = RequestMethod.POST)
	public String showAdminLoginPage(HttpServletRequest request,Model model, HttpSession session) throws IOException {
	    String sid = request.getParameter("sid");
	    String pwd = request.getParameter("pwd");
	    User user = new User();
	    user.setStudentID(Integer.parseInt(sid));
	    user.setPassword(pwd);
	    model.addAttribute("sid", sid);
	    
	    if(homeService.validateUser(user)){
	        session.setAttribute("student_ID", sid);
	        return "index";
	    }else{
	        model.addAttribute("message", "user not exist or password incorrect");
	        return "login";
	    }
	}
	
	/**
	 * Goto list page by page number
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value ="/listPage",method = RequestMethod.POST)
	public String showListPage(HttpServletRequest request,Model model,HttpSession session){
	    if(!checkLogin( session)){
	        return "login";
	    }
	    Integer pageNum = Integer.parseInt(request.getParameter("pageNum"));
	    Map<Integer,Object> map = homeService.getList(pageNum);
	    model.addAttribute("list", map.get(1));
	    model.addAttribute("pageCount", map.get(2));
	    model.addAttribute("pageNum", pageNum);
	    return "listPage";
	}
	
	/**
	 * Goto post detail page
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value ="/postDetail" , method = RequestMethod.GET) 
	public String showItemDetail(HttpServletRequest request,Model model,HttpSession session){
	    if(!checkLogin( session)){
            return "login";
        }
	    Integer id = Integer.parseInt(request.getParameter("id"));
	    Post post = homeService.getPostDetail(id);
	    model.addAttribute("post", post);
	    return "postDetail";
	}
	
	
	@RequestMapping(value = "/savePost" , method = RequestMethod.POST) 
	@ResponseBody
	public Map<String, Object> savePost(HttpServletRequest request,Model model,HttpSession session){
	    Post post = new Post();
	    post.setCategory(Integer.parseInt(request.getParameter("category")));
	    post.setContent(request.getParameter("content"));
	    post.setStudentID(Integer.parseInt(request.getParameter("studentID")));
	    post.setTitle(request.getParameter("title"));
	    post.setStudentID(Integer.parseInt((String) session.getAttribute("student_ID")));
	    Boolean result = homeService.savePost(post);
	    String message = "" ;
	    boolean success ;
	    if(result){
	        message = "information saved";
	        success = true ;
	    }else{
	        message = "error occur when saving";
	        success = false ;
	    }
	    Map<String, Object> map = new HashMap<String, Object>();
	    map.put("message", message);
	    map.put("success", success);
	    return map ;
	}

	/**
	 * admin_index demo
	 * 
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping( { "/admin/index", "/admin/" })
	public String showAdminIndex(Model model) throws IOException {
		return "/admin/adminindex";
	}
	
	public boolean checkLogin(HttpSession session){
	    String test = (String) session.getAttribute("student_ID");
	    if(test == null || test.equals("")){
	        return false ;
	    }
	    return true ;
	}

}
