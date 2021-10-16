package br.com.alura.supplier.rest.server;

import br.com.alura.supplier.model.Order;
import br.com.alura.supplier.rest.dto.OrderItemDto;
import br.com.alura.supplier.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);
    private final OrderService orderService;

    @PostMapping
    public Order performOrder(@RequestBody List<OrderItemDto> products) {
        log.info("STARTED - Perform order process...");
        Order order = orderService.performOrder(products);
        log.info("FINISHED - Perform order process with orderId: {}", order.getId());
        return order;
    }

    @RequestMapping("/{id}")
    public Order getPedidoPorId(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }
}
