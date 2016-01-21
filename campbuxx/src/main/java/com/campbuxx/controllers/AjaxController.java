package com.campbuxx.controllers;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.campbuxx.services.HomeService;

@Controller
@SessionAttributes
@RequestMapping("/ajax")
public class AjaxController
{
    private static final Logger logger = Logger.getLogger(AjaxController.class);

    @Autowired
    private HomeService homeService;

    /**
     * ajax get data test demo
     * 
     * @return
     */
    @RequestMapping(value = "/getText", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getDataText(HttpServletRequest request, Model model)
    {
        String distance = request.getParameter("distance");
        String a = "";
        if (distance != null)
        {
            a = homeService.getRandom(Integer.parseInt(distance));
        }else{
            a = homeService.getRandom(null);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("result", a);
        map.put("success", true);
        logger.info("success to get data__Ajax waiting for response....");
        System.out.println("success to get data__Ajax waiting for response....");
        return map;
    }


    @RequestMapping( { "/ajaxUpload" })
    public String showUpload(Model model) throws IOException
    {
        return "ajaxUpload";
    }
}
