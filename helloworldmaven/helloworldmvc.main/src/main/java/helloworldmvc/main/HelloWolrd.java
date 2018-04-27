package helloworldmvc.main;
import helloworldmvc.controller.ChevreExeception;
import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class HelloWolrd {

	public static void main(String[] args) {
		
		View view = new View();
		Model model = new Model();
		
		Controller ctrl = new Controller(view, model);
		
		try{
			ctrl.run();
		} catch (ChevreExeception e){
			System.out.println(e.getMessage());
		}
	}

}
