package com.xworkz.springBootDemo.peerproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeerController{
	
	public PeerController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	@RequestMapping("message")
	public String onMessage()
	{
		System.out.println("Invoked onMessage");
		return "welcome.jsp";
	}
	
	@RequestMapping("messageSave")
	public String onDisplayMes(@RequestParam("name") String name,
			@RequestParam("message") String message,Model model) {
		System.out.println("Invoked onDisplayMes");

		model.addAttribute("name", name);
		model.addAttribute("message", message);

		
		
		return "deshboard.jsp";
		
	}
}