package martin.ma.springboot.dao.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import martin.ma.springboot.dao.IProductDao;
import martin.ma.springboot.domain.Product;
@Repository
public class ProductDaoImpl implements IProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int add(Product product) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into sb_product(name,descript,version) values(?, ?, ?)",product.getName(),product.getDescript(),product.getVersion());
	}

	@Override
	public int update(Product product) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("update sb_product set name=? ,descript=? where id=?",product.getName(),product.getDescript(),product.getId());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from TABLE sb_product where id=?",id);
	}

	@Override
	public Product findProductById(int id) {
	       List<Product> list = jdbcTemplate.query("select * from sb_product where id = ?", new Object[]{id}, new BeanPropertyRowMapper(Product.class));
	        if(list!=null && list.size()>0){
	        	Product product = list.get(0);
	            return product;
	        }else{
	            return null;
	        }
	}

	@Override
	public List<Product> findProductList() {
	       List<Product> list = jdbcTemplate.query("select * from sb_product", new Object[]{}, new BeanPropertyRowMapper(Product.class));
	        if(list!=null && list.size()>0){
	            return list;
	        }else{
	            return null;
	        }
	}

}
