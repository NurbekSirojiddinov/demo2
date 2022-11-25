package com.example.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v2")
public class TestController {

    @GetMapping
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Hello from Demo2");
    }

    @PostMapping(path = "message/{id}")
    public ResponseEntity<?> message(@PathVariable Long id) {
        final MessageDto dto = new MessageDto();
        dto.setId(id);
        dto.setMessage("Message from Demo2");
        return ResponseEntity.ok(dto);
    }
}
