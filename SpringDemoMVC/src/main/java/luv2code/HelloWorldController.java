package luv2code;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// a new controller method to read from data and
	// add data to the model
	
	@RequestMapping("/processFormTwo")
	public String letsShout(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! "+ theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormThree")
	public String processFormThree(
			@RequestParam("studentName") String theName, 
			Model model) {
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hey from v3! "+ theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}