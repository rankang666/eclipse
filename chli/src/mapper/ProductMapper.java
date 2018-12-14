package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pojo.Product;
import pojo.UserInfo;

public interface ProductMapper {
	@Select("select * from product")
	List<Product> queryAllPro();
	@Delete("delete from product where pid=#{arg0}")
	int deletepro(int pid);
	@Insert("insert into product(pid,pname,price) values(#{pid},#{pname},#{price})")
	int save(Product product);
	@Update("update product set pname=#{pname},price=#{price} where pid=#{pid}")
	int updatePro(Product product);
}
