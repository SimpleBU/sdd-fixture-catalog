package ru.testbed.catalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.catalog.dto.FileDto;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @GetMapping("/{fileId}")
    public ResponseEntity<FileDto> getFile(@PathVariable("fileId") String fileId) {
        return ResponseEntity.ok(new FileDto());
    }

}
