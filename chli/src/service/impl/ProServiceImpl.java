package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.ProductMapper;

import pojo.Product;

import service.ProService;

@Service
public class ProServiceImpl implements ProService{
	@Autowired
	 ProductMapper mapper;

	@Override
	public List<Product> queryAllProduct() {
		
		return mapper.queryAllPro();
	}

	@Override
	public int deletepro(int pid) {
		// TODO Auto-generated method stub
		return mapper.deletepro(pid);
	}

	@Override
	public int save(Product product) {
		// TODO Auto-generated method stub
		return mapper.save(product);
	}

	@Override
	public int updatePro(Product product) {
		// TODO Auto-generated method stub
		return mapper.updatePro(product);
	}
	
	
}
