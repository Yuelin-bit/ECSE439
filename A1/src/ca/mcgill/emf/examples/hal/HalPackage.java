/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.examples.hal.HalFactory
 * @model kind="package"
 * @generated
 */
public interface HalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ca.mcgill/emf/examples/hal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalPackage eINSTANCE = ca.mcgill.emf.examples.hal.impl.HalPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.HomeImpl <em>Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.HomeImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getHome()
	 * @generated
	 */
	int HOME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__CONTAINS = 1;

	/**
	 * The number of structural features of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.DeviceImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ActuatorImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = DEVICE__NAME;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.RoomImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 2;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Window Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_WINDOW_OPEN = 2;

	/**
	 * The feature id for the '<em><b>Is Heater On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_HEATER_ON = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.SensorImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = DEVICE__NAME;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.HalSystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.HalSystemImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getHalSystem()
	 * @generated
	 */
	int HAL_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__RULES = 0;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__HOME = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.RulesImpl <em>Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.RulesImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getRules()
	 * @generated
	 */
	int RULES = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__NAME = 0;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Home <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home
	 * @generated
	 */
	EClass getHome();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Home#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home#getAddress()
	 * @see #getHome()
	 * @generated
	 */
	EAttribute getHome_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Home#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home#getContains()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_Contains();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see ca.mcgill.emf.examples.hal.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Room#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Device</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room#getDevice()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Device();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Room#isIsWindowOpen <em>Is Window Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Window Open</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room#isIsWindowOpen()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsWindowOpen();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Room#isIsHeaterOn <em>Is Heater On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Heater On</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room#isIsHeaterOn()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsHeaterOn();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see ca.mcgill.emf.examples.hal.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.HalSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see ca.mcgill.emf.examples.hal.HalSystem
	 * @generated
	 */
	EClass getHalSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.HalSystem#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ca.mcgill.emf.examples.hal.HalSystem#getRules()
	 * @see #getHalSystem()
	 * @generated
	 */
	EReference getHalSystem_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.HalSystem#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Home</em>'.
	 * @see ca.mcgill.emf.examples.hal.HalSystem#getHome()
	 * @see #getHalSystem()
	 * @generated
	 */
	EReference getHalSystem_Home();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rules
	 * @generated
	 */
	EClass getRules();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Rules#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rules#getName()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HalFactory getHalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.HomeImpl <em>Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.HomeImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getHome()
		 * @generated
		 */
		EClass HOME = eINSTANCE.getHome();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOME__ADDRESS = eINSTANCE.getHome_Address();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__CONTAINS = eINSTANCE.getHome_Contains();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ActuatorImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.RoomImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DEVICE = eINSTANCE.getRoom_Device();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Is Window Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__IS_WINDOW_OPEN = eINSTANCE.getRoom_IsWindowOpen();

		/**
		 * The meta object literal for the '<em><b>Is Heater On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__IS_HEATER_ON = eINSTANCE.getRoom_IsHeaterOn();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.DeviceImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.SensorImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.HalSystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.HalSystemImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getHalSystem()
		 * @generated
		 */
		EClass HAL_SYSTEM = eINSTANCE.getHalSystem();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__RULES = eINSTANCE.getHalSystem_Rules();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__HOME = eINSTANCE.getHalSystem_Home();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.RulesImpl <em>Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.RulesImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getRules()
		 * @generated
		 */
		EClass RULES = eINSTANCE.getRules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__NAME = eINSTANCE.getRules_Name();

	}

} //HalPackage
