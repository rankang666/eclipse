package service;

import java.util.List;

import pojo.Product;;

public interface ProService {
	
	List<Product> queryAllProduct();
	int deletepro(int pid);
	int save(Product product);
	int updatePro(Product product);
}
