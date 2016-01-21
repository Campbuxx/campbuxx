package com.campbuxx.controllers;


import java.io.IOException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.campbuxx.controllers.HomeController;
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
	 * admin_login demo
	 * 
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping( { "/login" })
	public String showAdminLoginPage(Model model) throws IOException {
		return "login";
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
