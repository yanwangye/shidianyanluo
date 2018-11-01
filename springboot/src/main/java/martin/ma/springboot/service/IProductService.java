package martin.ma.springboot.service;

import java.util.List;

import martin.ma.springboot.domain.Product;

public interface IProductService {
    int add(Product product);

    int update(Product product);

    int delete(int id);

    Product findProductById(int id);

    List<Product> findProductList();
}
