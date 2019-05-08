package pl.flez.reactboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import pl.flez.reactboot.data.Person;

@Controller
public class HomeControler {

	@GetMapping("/")
	String getHome(Model model) {
		Person person = new Person();
		person.setName("Jan");
		person.setSurname("Kowalski");
		model.addAttribute("person", person);
		return "home";
	}

	@GetMapping("/other")
	String getOtherHome(Model model) {
		Person person = new Person();
		person.setName("Janusz");
		person.setSurname("Nosacz");
		model.addAttribute("person", person);
		return "home";
	}

	@GetMapping("/react")
	String getReact(Model model) {
		Person person = new Person();
		person.setName("Janusz");
		person.setSurname("Nosacz");
		model.addAttribute("person", person);
		return "react-app";
	}
	
	@GetMapping("/redirect")
	String getRedirect() {
		return "redirect:/other";
	}

	@GetMapping("/forward")
	String getForward() {
		return "forward:/other";
	}
	
	@PostMapping("/add")
	public String postAddDocument(@ModelAttribute(name="person") Person person) {
		System.out.println(person.getName());
		System.out.println(person.getSurname());
		return "redirect:/";
	}
	

}
