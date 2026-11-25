package ru.testbed.catalog.dto;

import java.math.BigDecimal;

/** Сгенерировано из manifest.yaml — не править руками. */
public class SalesReportDto {

    private String period;
    private BigDecimal totalRevenue;
    private Long ordersCount;
    private Integer statusCode;

    public String getPeriod() { return period; }
    public void setPeriod(String period) { this.period = period; }
    public BigDecimal getTotalRevenue() { return totalRevenue; }
    public void setTotalRevenue(BigDecimal totalRevenue) { this.totalRevenue = totalRevenue; }
    public Long getOrdersCount() { return ordersCount; }
    public void setOrdersCount(Long ordersCount) { this.ordersCount = ordersCount; }
    public Integer getStatusCode() { return statusCode; }
    public void setStatusCode(Integer statusCode) { this.statusCode = statusCode; }
}
