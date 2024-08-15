package E_Commerce.Microservies.dto;

import java.math.BigDecimal;

public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;

    // Constructor with all arguments
    public ProductRequest(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // No-argument constructor
    public ProductRequest() {
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // Builder pattern
    public static ProductRequestBuilder builder() {
        return new ProductRequestBuilder();
    }

    // Builder class
    public static class ProductRequestBuilder {
        private String name;
        private String description;
        private BigDecimal price;

        ProductRequestBuilder() {
        }

        public ProductRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ProductRequestBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public ProductRequest build() {
            return new ProductRequest(name, description, price);
        }

        public String toString() {
            return "ProductRequest.ProductRequestBuilder(name=" + this.name + ", description=" + this.description + ", price=" + this.price + ")";
        }
    }

    // Overriding the toString method for a meaningful representation
    @Override
    public String toString() {
        return "ProductRequest{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
