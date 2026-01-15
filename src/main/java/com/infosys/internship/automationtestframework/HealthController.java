package com.infosys.internship.automationtestframework;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Automation Test Framework is running successfully 🚀";
    }
}
