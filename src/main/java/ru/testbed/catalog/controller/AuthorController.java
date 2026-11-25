package ru.testbed.catalog.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.catalog.dto.AuthorDto;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @GetMapping
    public ResponseEntity<List<AuthorDto>> listAuthors() {
        return ResponseEntity.ok(List.of());
    }

}
