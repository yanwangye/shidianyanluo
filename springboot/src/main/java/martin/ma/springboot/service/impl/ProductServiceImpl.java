package martin.ma.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import martin.ma.springboot.dao.IProductDao;
import martin.ma.springboot.domain.Product;
import martin.ma.springboot.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	IProductDao productDao;
	@Override
	public int add(Product product) {
		// TODO Auto-generated method stub
		return productDao.add(product);
	}

	@Override
	public int update(Product product) {
		// TODO Auto-generated method stub
		return productDao.update(product);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return productDao.delete(id);
	}

	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.findProductById(id);
	}

	@Override
	public List<Product> findProductList() {
		// TODO Auto-generated method stub
		return productDao.findProductList();
	}

}
