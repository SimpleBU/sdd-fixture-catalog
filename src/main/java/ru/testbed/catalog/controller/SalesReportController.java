package ru.testbed.catalog.controller;

import java.time.LocalDate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.catalog.dto.SalesReportDto;

@RestController
@RequestMapping("/api/reports")
public class SalesReportController {

    @GetMapping("/sales")
    public ResponseEntity<SalesReportDto> salesReport(
            @RequestParam(name = "from", required = false) LocalDate from,
            @RequestParam(name = "to", required = false) LocalDate to) {
        return ResponseEntity.ok(new SalesReportDto());
    }

}
