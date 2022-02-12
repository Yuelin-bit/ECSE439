package ca.mcgill.emf.examples.hal.application;

//import org.eclipse.emf.ecore.resource.Resource;

import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.view.MainView;

public class HalApplication {
	private static HalSystem halSystem;
	
	
	/*public static HalSystem getHalSystem() {
		if(halSystem == null) {
			halSystem = new HalSystem();
		}
		return halSystem;
	}

	private static HalSystem load() {
		HalSystem halSystem;
		try {
			Resource resource = ResourceHelper.;
		}catch (RuntimeException e) {
			
		}
		return halSystem;
	}*/



	/**
	 * Main entrance point
	 * @param args
	 */
	public static void main(String[] args) {
		// start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
	}
}
