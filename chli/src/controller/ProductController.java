package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;
import pojo.UserInfo;
import service.ProService;


@Controller("procontroller")
public class ProductController {
	@Autowired
	ProService service;
	
	@RequestMapping("/")
	public String getList(ModelMap  model)
	{
		List<Product> list =service.queryAllProduct();
		model.addAttribute("list", list);
		return "main";
	}
	@RequestMapping("/DeleteProduct")
	public String deletePro(String pid)
	{
		int id = Integer.parseInt(pid);
		service.deletepro(id);
		return "forward:/";
	}
	@RequestMapping("/addProduct")
	public ModelAndView product() {
	      return new ModelAndView("insert", "command", new Product());
	 }
	@RequestMapping("/InsertPro")
	public String insert(Product product,ModelMap model){
		service.save(product);
		return "forward:/";
	}
	@RequestMapping("/update")
	public String updateShow(String pid,ModelMap model){
		model.addAttribute("pid",pid);
		return "update";
	}
	@RequestMapping("/updatePro")
	public String update(Product product,ModelMap model){
		service.updatePro(product);
		return "forward:/";
	}
	
}
