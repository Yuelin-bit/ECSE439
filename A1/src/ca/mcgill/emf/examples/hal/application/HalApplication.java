package ca.mcgill.emf.examples.hal.application;

import org.eclipse.emf.ecore.resource.Resource;


import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.util.HalResourceFactoryImpl;
import ca.mcgill.emf.examples.hal.util.ResourceHelper;
import ca.mcgill.emf.examples.hal.view.MainView;

public class HalApplication {
	
	private static HalSystem halSystem;
	private static String fileName = "data/data.halSystem";



	/**
	 * Main entrance point
	 * @param args
	 */
	public static void main(String[] args) {
		// start UI
		HalPackage.eINSTANCE.eClass();
		ResourceHelper.INSTANCE.addResourceFactory("halSystem", new HalResourceFactoryImpl());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
	}
	
	
	public static HalSystem getHalSystem() {
		if(halSystem == null) {
			halSystem = load();
		}
		return halSystem;
	}

	/**
	 * Read the halSystem from data file,
	 * if the file is null, create a new one.
	 * @return The only halSystem
	 */
	private static HalSystem load() {
		HalSystem halSystem;
		Home home;
		try {
			Resource resource = ResourceHelper.INSTANCE.loadResource(fileName);
			halSystem = (HalSystem) resource.getContents().get(0);
		}catch (RuntimeException e) {
			//Otherwise, create an empty halSystem
			halSystem = HalFactory.eINSTANCE.createHalSystem();
			//Also set a empty room
			home = HalFactory.eINSTANCE.createHome();
			halSystem.setHome(home);
		}
		return halSystem;
	}
	
	/**
	 * Save the halSystem to the file.
	 */
	public static void save() {
		ResourceHelper.INSTANCE.saveResource(halSystem, fileName);
	}
}
