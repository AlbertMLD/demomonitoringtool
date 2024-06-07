package com.example.demo.myapplication.networklogs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class ErrorMessageController {

    @GetMapping("/api/error-messages")
    public List<String> getErrorMessages() {
        // Generate sample error messages
        return Arrays.asList("Device 1 is down", "Interface 2 has high traffic");
    }
}
