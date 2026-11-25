package ru.testbed.catalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.catalog.dto.BulkImportRequest;
import ru.testbed.catalog.dto.PageDto;
import ru.testbed.catalog.dto.ProductDto;
import ru.testbed.catalog.dto.StockSubscriptionDto;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<PageDto> listProducts(
            @RequestParam(name = "pageToken", required = false) String pageToken,
            @RequestParam(name = "pageSize", required = false) Integer pageSize,
            @RequestParam(name = "sortOrder", required = false) String sortOrder,
            @RequestParam(name = "countryCode", required = false) String countryCode) {
        return ResponseEntity.ok(new PageDto());
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable("productId") Long productId) {
        return ResponseEntity.ok(new ProductDto());
    }

    @PostMapping("/bulk")
    public ResponseEntity<Void> bulkImport(@RequestBody BulkImportRequest request) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/export")
    public ResponseEntity<String> exportProducts(
            @RequestParam(name = "zip", required = false) Boolean zip,
            @RequestParam(name = "format", required = false) String format) {
        return ResponseEntity.ok("");
    }

    @PostMapping("/{productId}/subscriptions")
    public ResponseEntity<Void> subscribe(
            @PathVariable("productId") Long productId,
            @RequestBody StockSubscriptionDto request) {
        return ResponseEntity.noContent().build();
    }

}
