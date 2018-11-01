package martin.ma.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import martin.ma.springboot.domain.Product;
import martin.ma.springboot.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	IProductService productServiceImpl;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Product> getProductList(){
		return productServiceImpl.findProductList();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Product getProductById(@PathVariable("id") int id) {
		return productServiceImpl.findProductById(id);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public String updateProduct(@PathVariable("id")int id, 
			@RequestParam(value="name",required=true) String name,
			@RequestParam(value="descript",required=true) String descript) {
		Product product = new Product();
		product.setDescript("大疆无人机");
		product.setName("大疆无人机");
		product.setId(id);
		int t = productServiceImpl.update(product);
		if(t==1) {
			return product.toString();
		}else {
			return "fail";
		}
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String postAccount(@RequestParam(value = "name")String name,@RequestParam(value = "descript")String descript,@RequestParam(value = "version")int version) {
		Product product = new Product();
		product.setName(name);
		product.setDescript(descript);
		product.setVersion(version);
		int t = productServiceImpl.add(product);
		if(t==1) {
			return product.toString();
			
		}else {
			return "fail";
		}
				
	}
	
}
