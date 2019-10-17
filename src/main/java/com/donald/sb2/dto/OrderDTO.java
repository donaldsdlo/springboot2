package com.donald.sb2.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrderDTO implements Serializable {
    @NotNull
    @NotBlank
    private String customer_name;
    @NotNull
    @NotBlank
    private String order_number;
    @NotNull
    @Valid
    private List<OrderItemsDTO> orderItemsDTOList;

    @Override
    public String toString() {
        return "OrderDTO{" +
                "customer_name='" + customer_name + '\'' +
                ", order_number='" + order_number + '\'' +
                ", orderItemsDTOList=" + orderItemsDTOList +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @Valid
    private User user;

    public List<OrderItemsDTO> getOrderItemsDTOList() {
        return orderItemsDTOList;
    }

    public void setOrderItemsDTOList(List<OrderItemsDTO> orderItemsDTOList) {
        this.orderItemsDTOList = orderItemsDTOList;
    }

    public OrderDTO() {
        orderItemsDTOList = new ArrayList<>();
    }

    public OrderDTO(String customer_name, String order_number) {
        this.customer_name = customer_name;
        this.order_number = order_number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDTO orderDTO = (OrderDTO) o;

        return order_number != null ? order_number.equals(orderDTO.order_number) : orderDTO.order_number == null;

    }

    @Override
    public int hashCode() {
        return order_number != null ? order_number.hashCode() : 0;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }
}
