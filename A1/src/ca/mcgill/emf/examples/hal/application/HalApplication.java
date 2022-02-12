package ca.mcgill.emf.examples.hal.application;

import ca.mcgill.emf.examples.hal.view.MainView;

public class HalApplication {
	//private static Hal
	
	
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
