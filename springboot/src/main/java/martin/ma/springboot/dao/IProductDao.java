package martin.ma.springboot.dao;

import java.util.List;

import martin.ma.springboot.domain.Product;

public interface IProductDao {
	int add(Product product);
	
	int update(Product product);
	
	int delete(int id);
	
	Product findProductById(int id);
	
	List<Product> findProductList();
}
