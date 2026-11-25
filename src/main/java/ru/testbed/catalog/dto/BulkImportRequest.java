package ru.testbed.catalog.dto;

import java.util.List;

/** Сгенерировано из manifest.yaml — не править руками. */
public class BulkImportRequest {

    private List<ProductDto> data;
    private Boolean dryRun;

    public List<ProductDto> getData() { return data; }
    public void setData(List<ProductDto> data) { this.data = data; }
    public Boolean getDryRun() { return dryRun; }
    public void setDryRun(Boolean dryRun) { this.dryRun = dryRun; }
}
