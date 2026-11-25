package ru.testbed.catalog.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.catalog.dto.ProductDto;

/** Подборка открыток (cards) — ловушка для платёжного правила. */
@RestController
@RequestMapping("/api/collections")
public class CollectionController {

    @GetMapping("/cards")
    public ResponseEntity<List<ProductDto>> greetingCards() {
        return ResponseEntity.ok(List.of());
    }

}
