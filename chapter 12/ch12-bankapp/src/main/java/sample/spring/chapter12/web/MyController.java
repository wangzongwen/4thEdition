package sample.spring.chapter12.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(path = "/myController")
public class MyController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listFixedDeposits() {
		throw new RuntimeException("test");
	}
	
}
