package org.memoryextension.nngm.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.memoryextension.nngm.core.RhymingPattern;


@Controller
public class WelcomeController {

  @GetMapping("/")
  public String greetingForm(Model model) {
	model.addAttribute("pattern", new RhymingPattern());
    return "form";
  }

  @PostMapping("/generate")
  public String generator(@ModelAttribute RhymingPattern pattern, Model model) {
    model.addAttribute("pattern", pattern);
    return "result";
  }

}