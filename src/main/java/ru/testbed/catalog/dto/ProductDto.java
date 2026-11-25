package ru.testbed.catalog.dto;

import java.math.BigDecimal;
import java.util.List;

/** Сгенерировано из manifest.yaml — не править руками. */
public class ProductDto {

    private Long id;
    private String sku;
    private String title;
    private String description;
    private BigDecimal price;
    private String currency;
    private String panel;
    private Integer cardboardThickness;
    private List<String> tags;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public String getPanel() { return panel; }
    public void setPanel(String panel) { this.panel = panel; }
    public Integer getCardboardThickness() { return cardboardThickness; }
    public void setCardboardThickness(Integer cardboardThickness) { this.cardboardThickness = cardboardThickness; }
    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }
}
