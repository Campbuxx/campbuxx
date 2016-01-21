package com.campbuxx.controllers;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

@Controller
@SessionAttributes
@RequestMapping("/ajax")
public class UploadFileController {
	private static final Logger logger = Logger.getLogger(HomeController.class);

	/**
	 * save file into The specified folder Demo
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String fileUpload(
			@RequestParam(value = "file", required = false) MultipartFile file,
			HttpServletRequest request, Model model) {
		
		String message = "";
		//get file name 
		 String fileName = file.getOriginalFilename();
		// get project address
		String dir = request.getSession().getServletContext().getRealPath("");
		// assemble the direction
		String savePath = dir + "/resources/upload/" ;
		
		File targetFile = new File(savePath, fileName);
		//if the file name is exists
		if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
		//save
        try {  
            file.transferTo(targetFile);  
            message = "save success";
        } catch (Exception e) {  
            e.printStackTrace();  
            message = "save failed";
        }  
		
        model.addAttribute("message",message);
        return "fileUpload";
	}
	
	@RequestMapping( { "/fileUpload" })
	public String showfileUpload(Model model) throws IOException {
		return "fileUpload";
	}

}
