package se.air.airbean.airbean.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderLineController {

//  @Autowired private OrderLineRepository repository;
//
//  @Autowired private ProductRepository productRepository;
//
//  @GetMapping("/orderLines")
//  public Iterable<OrderLine> getAllOrderLines() {
//    return repository.findAll();
//  }
//
//  @GetMapping("/orderLines/{id}")
//  public OrderLine getOrderLine(@PathVariable Long id) {
//    return repository.findById(id).get();
//  }
//
//  @GetMapping("/orderLines/{id}/products")
//  public Iterable<Product> getAllOrderProducts(@PathVariable Long id) {
//    OrderLine orderLine = repository.findById(id).get();
//    Set<Product> products = orderLine.getProducts();
//    return products;
//  }
//
//  @PutMapping("/orderLines/{id}/products")
//  public void addProduct(@PathVariable Long id, @RequestBody String uri) {
//    Product product = productRepository.findById(Long.parseLong(uri.substring(uri.length()-1))).get();
//    OrderLine orderLine = repository.findById(id).get();
//    orderLine.getProducts().add(product);
//    repository.save(orderLine);
//  }
//
//  @PostMapping("/orderLines")
//  public OrderLine createOrderLine(@RequestBody OrderLine orderLine) {
//    repository.save(orderLine);
//    return orderLine;
//  }
}
