package struts.actions;
import com.opensymphony.xwork2.ActionSupport;


public class HelloWorldAction extends ActionSupport{

		private String name;

	   public String execute() throws Exception {
		   
		     System.out.println(name);
	         return SUCCESS;
	    
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
}
