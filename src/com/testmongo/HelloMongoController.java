package com.testmongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testmongo.repositories.UsersRepository;

@Controller
public class HelloMongoController {
@Autowired
private UsersRepository repository;
@RequestMapping(value = "/test", method = RequestMethod.GET)
public ModelAndView helloWorld( ModelMap model ) {
List<Users> users = repository.findAll();

System.out.println("USer size"+users.size()+users.get(0).getFirstName());
ModelAndView modelAndView = new ModelAndView("index");
modelAndView.addObject("users", users );
return modelAndView;
}
}