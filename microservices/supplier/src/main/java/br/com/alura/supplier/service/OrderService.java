package br.com.alura.supplier.service;

import br.com.alura.supplier.model.Order;
import br.com.alura.supplier.model.OrderItem;
import br.com.alura.supplier.model.Product;
import br.com.alura.supplier.repository.OrderRepository;
import br.com.alura.supplier.repository.ProductRepository;
import br.com.alura.supplier.rest.dto.OrderItemDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private static final Logger log = LoggerFactory.getLogger(OrderService.class);
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    public Order performOrder(List<OrderItemDto> items) {

        if (Objects.isNull(items)) {
            return null;
        }

        List<OrderItem> orderItems = toOrderItem(items);
        Order order = new Order(orderItems);
        order.setTimeToPrepare(items.size());
        log.info("Calling database to save order");
        return orderRepository.save(order);
    }

    public Order getOrderById(Long id) {
        return this.orderRepository.findById(id).orElse(new Order());
    }

    private List<OrderItem> toOrderItem(List<OrderItemDto> items) {

        List<Long> productIds = items
                .stream()
                .map(item -> item.getId())
                .collect(Collectors.toList());

        List<Product> orderProducts = productRepository.findByIdIn(productIds);

        List<OrderItem> orderItems = items
                .stream()
                .map(item -> {
                    Product product = orderProducts
                            .stream()
                            .filter(p -> p.getId() == item.getId())
                            .findFirst().get();

                    return OrderItem.builder()
                            .product(product)
                            .amount(item.getAmount())
                            .build();
                })
                .collect(Collectors.toList());
        return orderItems;
    }
}
