package com.elcentr.service;

import com.elcentr.model.Order;

import java.util.List;

public interface OrderService {

    Order create(Order order);

    Order update(Order order);

    Order findOneById(Integer id);

    List<Order> findAll();

    void deleteById(Integer id);

    Order findByProductId(Integer productId);

    List<Order> findAllByCustomerId(Integer customerId);

    List<Order> findAllByResidentialComplexId(Integer residentialComplexId);
}
