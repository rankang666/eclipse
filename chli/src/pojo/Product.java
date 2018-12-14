package pojo;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;

public class Product {
private  int pid;
private String pname;
private double price;
public int getPid() {
<<<<<<< HEAD
	System.out.println("tortoisegit");
=======
	hehe
>>>>>>> branch 'master' of https://github.com/rankang666/eclipse.git
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
