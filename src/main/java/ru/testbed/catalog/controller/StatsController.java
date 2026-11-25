package ru.testbed.catalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.catalog.dto.CardinalityStatsDto;

@RestController
@RequestMapping("/api/stats")
public class StatsController {

    @GetMapping("/cardinality")
    public ResponseEntity<CardinalityStatsDto> cardinality(@RequestParam(name = "field", required = false) String field) {
        return ResponseEntity.ok(new CardinalityStatsDto());
    }

}
