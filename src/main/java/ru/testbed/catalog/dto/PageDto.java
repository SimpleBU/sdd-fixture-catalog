package ru.testbed.catalog.dto;

import java.util.List;

/** Сгенерировано из manifest.yaml — не править руками. */
public class PageDto {

    private List<ProductDto> data;
    private Long total;
    private String nextPageToken;

    public List<ProductDto> getData() { return data; }
    public void setData(List<ProductDto> data) { this.data = data; }
    public Long getTotal() { return total; }
    public void setTotal(Long total) { this.total = total; }
    public String getNextPageToken() { return nextPageToken; }
    public void setNextPageToken(String nextPageToken) { this.nextPageToken = nextPageToken; }
}
