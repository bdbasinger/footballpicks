package com.basinger.footballpicks.controller;

import com.basinger.footballpicks.model.Contestant;
import com.basinger.footballpicks.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

    private final ResultsService resultsService;

    @Autowired
    public ScheduleController(ResultsService resultsService) {
        this.resultsService = resultsService;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("contestant", new Contestant());
        return "register";
    }

    @PostMapping("/register")
    public String processRegistration(Contestant contestant) {
        // You'd typically save the contestant to the database here
        return "redirect:/schedule";
    }

    @GetMapping("/schedule")
    public String showScheduleForm(Model model) {
        model.addAttribute("picks", new Contestant()); // Assuming 'picks' hold the game selections
        return "schedule";
    }

    @PostMapping("/schedule")
    public String processSchedule(Contestant picks) {
        // Process and save the picks to the database here
        return "redirect:/results";
    }

    @GetMapping("/results")
    public String showResults(Model model) {
        model.addAttribute("results", resultsService.getWeeklyResults());
        return "results";
    }
}
