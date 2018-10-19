package com.play.web.cmm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.play.web.mbr.MemberService;

@Controller
public class HomeCtrl {
	@Autowired MemberService service;
	@GetMapping
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("----------- 1 ----------");
		String count = service.countAll();
		System.out.println("회원수는 총 "+count+"입니다.");
		model.addAttribute("count",count);
		return "index";
	}

	@GetMapping
	@RequestMapping("/piechart")
	public String piechart(Model model) {
		System.out.println("----------- piechart 진입 ----------");
		return "util/piechart";
	}
	
	@GetMapping
	@RequestMapping("/wordcloud")
	public String wordcloud(Model model) {
		System.out.println("----------- wordcloud 진입 ----------");
		return "util/wordcloud";
	}
	
	@GetMapping
	@RequestMapping("/gmap")
	public String gmap(Model model) {
		System.out.println("----------- wordcloud 진입 ----------");
		return "util/gmap";
	}
	
	@GetMapping
	@RequestMapping("/initmap")
	public String initmap(Model model) {
		System.out.println("----------- wordcloud 진입 ----------");
		return "util/initmap";
	}
	
}
