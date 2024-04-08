package com.example.springboottest.Controller;

import com.example.springboottest.Model.Bruger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BrugerController {
    @GetMapping("/bruger")
    public String brugerForm(Model model) {
        model.addAttribute("bruger", new Bruger());
        return "bruger";
    }

    @PostMapping("/bruger")
    public String brugerSubmit(@ModelAttribute Bruger bruger, Model model) {
        model.addAttribute("bruger", bruger);
        return "result";
    }
}
