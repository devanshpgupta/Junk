package Thursday24.com.demo.main;
import Thursday24.com.demo.cart.cart;
import Thursday24.com.demo.product.product;
public class checkout{
	
	void checkout1()
	{
		product p=new product();
		cart c=new cart();
		p.entproducts();
		c.cart1();
		int i=0;
		int j=0;
		System.out.println("Checked out product are: ");
		for(j=0;j<c.count1;j++)
		{
		for(i=0;i<p.count;i++)
		{			
			if(c.num[j]==i+1)
					System.out.println(p.products[i]);
			}
		}
	}
		public static void main(String[] args) {
			
			new checkout().checkout1();
						
	}

}
