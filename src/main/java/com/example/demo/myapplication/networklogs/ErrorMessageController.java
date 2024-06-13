package com.example.demo.myapplication.networklogs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * REST controller class for handling error message related HTTP requests.
 */
@RestController
public class ErrorMessageController {

    /**
     * GET request handler for "/api/error-messages" endpoint.
     * Returns a list of sample error messages.
     *
     * @return A list of strings representing sample error messages.
     */
    @GetMapping("/api/error-messages")
    public List<String> getErrorMessages() {
        // Generate sample error messages
        return Arrays.asList("Device 1 is down", "Interface 2 has high traffic");
    }
}
