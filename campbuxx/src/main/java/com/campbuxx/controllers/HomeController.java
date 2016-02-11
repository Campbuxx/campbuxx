package com.campbuxx.controllers;


import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@RequestMapping( { "/login" })
	public String showAdminLoginPage(HttpServletRequest request,Model model) throws IOException {
	    String sid = request.getParameter("sid");
	    String pwd = request.getParameter("pwd");
	    User user = new User();
	    user.setStudentID(Integer.parseInt(sid));
	    user.setPassword(pwd);
	    model.addAttribute("sid", sid);
	    
	    if(homeService.validateUser(user)){
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
	@RequestMapping("/listPage")
	public String showListPage(HttpServletRequest request,Model model){
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
	@RequestMapping("/postDetail")
	public String showItemDetail(HttpServletRequest request,Model model){
	    Integer id = Integer.parseInt(request.getParameter("id"));
	    Post post = homeService.getPostDetail(id);
	    model.addAttribute("post", post);
	    return "postDetail";
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
	
	

}
