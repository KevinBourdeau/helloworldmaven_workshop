package helloworldmvc.controller;

import java.util.Random;

import helloworldmvc.contract.IModel;
import helloworldmvc.contract.IView;

public class Controller {

		private final IView view;
		private final IModel model;
		
		public Controller(final IView view, final IModel model){
			this.view = view;
			this.model = model;
		}
		
		public void run() throws ChevreExeception {
			Random rand =new Random();
			
			if(rand.nextInt(100) < 50){
				this.view.displayMessage(this.model.getHelloWorld());
			}else {
				throw new ChevreExeception();
			}
					
			
		}
}
