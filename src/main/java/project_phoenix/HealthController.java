package project_phoenix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Project Phoenix is Running Successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application Status : UP";
    }
}