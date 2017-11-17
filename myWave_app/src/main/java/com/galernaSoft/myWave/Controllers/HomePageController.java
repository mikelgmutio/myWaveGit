package com.galernaSoft.myWave.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomePageController {

	@RequestMapping(method = RequestMethod.GET)
	public String HomePage(Model model)	
	{
		model.addAttribute("hasierakoAgurra", "Kaixo Egoitz");
		return "homePage";
	}
}
