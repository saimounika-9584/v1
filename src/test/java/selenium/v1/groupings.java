package selenium.v1;
import org.testing.annotations.Test;

public class groupings {
	@Test(groups= {"sanity","Regression"})
    public void login() {
    	System.out.println("user is logged in");
    	
    }
    @Test(groups= {"Regression"})
    public void AddTocart() {
    	System.out.println("product added to cart");
    }
    @Test(groups= {"sanity"})
    public void Products() {
    	System.out.println("product liasedin the cart");
    
    }
}


