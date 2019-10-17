package com.donald.sb2.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class OrderItemsDTO implements Serializable {
    private String order_number;
    @NotNull
    @NotBlank
    private String material;
    private Integer quantity;

    public OrderItemsDTO() {
    }

    @Override
    public String toString() {
        return "OrderItemsDTO{" +
                "order_number='" + order_number + '\'' +
                ", material='" + material + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItemsDTO that = (OrderItemsDTO) o;

        if (order_number != null ? !order_number.equals(that.order_number) : that.order_number != null) return false;
        return material != null ? material.equals(that.material) : that.material == null;

    }

    @Override
    public int hashCode() {
        int result = order_number != null ? order_number.hashCode() : 0;
        result = 31 * result + (material != null ? material.hashCode() : 0);
        return result;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
