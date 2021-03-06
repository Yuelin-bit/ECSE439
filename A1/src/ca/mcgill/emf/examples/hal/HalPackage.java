/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__ROOMS = 1;

	/**
	 * The feature id for the '<em><b>Activity Logs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__ACTIVITY_LOGS = 2;

	/**
	 * The number of structural features of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ROOM = 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ROOM = DEVICE__ROOM;

	/**
	 * The feature id for the '<em><b>Actuator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTUATOR_TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Window Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_WINDOW_OPEN = 1;

	/**
	 * The feature id for the '<em><b>Is Heater On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_HEATER_ON = 2;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DEVICE = 3;

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
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ROOM = DEVICE__ROOM;

	/**
	 * The feature id for the '<em><b>Sensor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;


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
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__HOME = 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__DEVICE = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__PRECONDITION = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__ACTION = 3;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.LogImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getLog()
	 * @generated
	 */
	int LOG = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__DATE = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__START_TIME = 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__END_TIME = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__RULES = 4;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.PreConditionImpl <em>Pre Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.PreConditionImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getPreCondition()
	 * @generated
	 */
	int PRE_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Logicpiece</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__LOGICPIECE = 3;

	/**
	 * The number of structural features of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ActionImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTUATOR = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.SingleConditionImpl <em>Single Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.SingleConditionImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSingleCondition()
	 * @generated
	 */
	int SINGLE_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONDITION__ID = 0;

	/**
	 * The number of structural features of the '<em>Single Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.LogicGateImpl <em>Logic Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.LogicGateImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getLogicGate()
	 * @generated
	 */
	int LOGIC_GATE = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_GATE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Logic Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_GATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.LogicPieceImpl <em>Logic Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.LogicPieceImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getLogicPiece()
	 * @generated
	 */
	int LOGIC_PIECE = 12;

	/**
	 * The feature id for the '<em><b>Logicpiece</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PIECE__LOGICPIECE = 0;

	/**
	 * The feature id for the '<em><b>Singlecondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PIECE__SINGLECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Logicgate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PIECE__LOGICGATE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PIECE__ID = 3;

	/**
	 * The number of structural features of the '<em>Logic Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PIECE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.SensorType
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 13;


	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.ActuatorType <em>Actuator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.ActuatorType
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 14;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.LogicType <em>Logic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.LogicType
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getLogicType()
	 * @generated
	 */
	int LOGIC_TYPE = 15;

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
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Home#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home#getRooms()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Home#getActivityLogs <em>Activity Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Logs</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home#getActivityLogs()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_ActivityLogs();

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
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Actuator#getActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuator Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.Actuator#getActuatorType()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_ActuatorType();

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
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.Device#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device#getRoom()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Room();

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
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Sensor#getSensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.Sensor#getSensorType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_SensorType();

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
	 * Returns the meta object for the containment reference '{@link ca.mcgill.emf.examples.hal.HalSystem#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see ca.mcgill.emf.examples.hal.HalSystem#getHome()
	 * @see #getHalSystem()
	 * @generated
	 */
	EReference getHalSystem_Home();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.HalSystem#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device</em>'.
	 * @see ca.mcgill.emf.examples.hal.HalSystem#getDevice()
	 * @see #getHalSystem()
	 * @generated
	 */
	EReference getHalSystem_Device();

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
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Rules#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rules#getTitle()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Title();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Rules#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rules#getPassword()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Rules#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rules#getPrecondition()
	 * @see #getRules()
	 * @generated
	 */
	EReference getRules_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Rules#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rules#getAction()
	 * @see #getRules()
	 * @generated
	 */
	EReference getRules_Action();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see ca.mcgill.emf.examples.hal.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Log#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see ca.mcgill.emf.examples.hal.Log#getDate()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Date();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Log#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see ca.mcgill.emf.examples.hal.Log#getStartTime()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Log#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see ca.mcgill.emf.examples.hal.Log#getEndTime()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Log#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see ca.mcgill.emf.examples.hal.Log#getContent()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Content();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Log#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rules</em>'.
	 * @see ca.mcgill.emf.examples.hal.Log#getRules()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_Rules();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Condition</em>'.
	 * @see ca.mcgill.emf.examples.hal.PreCondition
	 * @generated
	 */
	EClass getPreCondition();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.PreCondition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.mcgill.emf.examples.hal.PreCondition#getId()
	 * @see #getPreCondition()
	 * @generated
	 */
	EAttribute getPreCondition_Id();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.PreCondition#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see ca.mcgill.emf.examples.hal.PreCondition#getContent()
	 * @see #getPreCondition()
	 * @generated
	 */
	EAttribute getPreCondition_Content();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.PreCondition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensor</em>'.
	 * @see ca.mcgill.emf.examples.hal.PreCondition#getSensor()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_Sensor();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.PreCondition#getLogicpiece <em>Logicpiece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logicpiece</em>'.
	 * @see ca.mcgill.emf.examples.hal.PreCondition#getLogicpiece()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_Logicpiece();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ca.mcgill.emf.examples.hal.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Action#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.mcgill.emf.examples.hal.Action#getId()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Id();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Action#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see ca.mcgill.emf.examples.hal.Action#getContent()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Content();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Action#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuator</em>'.
	 * @see ca.mcgill.emf.examples.hal.Action#getActuator()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actuator();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.SingleCondition <em>Single Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Condition</em>'.
	 * @see ca.mcgill.emf.examples.hal.SingleCondition
	 * @generated
	 */
	EClass getSingleCondition();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.SingleCondition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.mcgill.emf.examples.hal.SingleCondition#getId()
	 * @see #getSingleCondition()
	 * @generated
	 */
	EAttribute getSingleCondition_Id();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.LogicGate <em>Logic Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Gate</em>'.
	 * @see ca.mcgill.emf.examples.hal.LogicGate
	 * @generated
	 */
	EClass getLogicGate();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.LogicGate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.LogicGate#getType()
	 * @see #getLogicGate()
	 * @generated
	 */
	EAttribute getLogicGate_Type();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.LogicPiece <em>Logic Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Piece</em>'.
	 * @see ca.mcgill.emf.examples.hal.LogicPiece
	 * @generated
	 */
	EClass getLogicPiece();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.LogicPiece#getLogicpiece <em>Logicpiece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logicpiece</em>'.
	 * @see ca.mcgill.emf.examples.hal.LogicPiece#getLogicpiece()
	 * @see #getLogicPiece()
	 * @generated
	 */
	EReference getLogicPiece_Logicpiece();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.LogicPiece#getSinglecondition <em>Singlecondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Singlecondition</em>'.
	 * @see ca.mcgill.emf.examples.hal.LogicPiece#getSinglecondition()
	 * @see #getLogicPiece()
	 * @generated
	 */
	EReference getLogicPiece_Singlecondition();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.LogicPiece#getLogicgate <em>Logicgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logicgate</em>'.
	 * @see ca.mcgill.emf.examples.hal.LogicPiece#getLogicgate()
	 * @see #getLogicPiece()
	 * @generated
	 */
	EReference getLogicPiece_Logicgate();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.LogicPiece#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.mcgill.emf.examples.hal.LogicPiece#getId()
	 * @see #getLogicPiece()
	 * @generated
	 */
	EAttribute getLogicPiece_Id();

	/**
	 * Returns the meta object for enum '{@link ca.mcgill.emf.examples.hal.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link ca.mcgill.emf.examples.hal.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActuatorType
	 * @generated
	 */
	EEnum getActuatorType();

	/**
	 * Returns the meta object for enum '{@link ca.mcgill.emf.examples.hal.LogicType <em>Logic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.LogicType
	 * @generated
	 */
	EEnum getLogicType();

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
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__ROOMS = eINSTANCE.getHome_Rooms();

		/**
		 * The meta object literal for the '<em><b>Activity Logs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__ACTIVITY_LOGS = eINSTANCE.getHome_ActivityLogs();

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
		 * The meta object literal for the '<em><b>Actuator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__ACTUATOR_TYPE = eINSTANCE.getActuator_ActuatorType();

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
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__ROOM = eINSTANCE.getDevice_Room();

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
		 * The meta object literal for the '<em><b>Sensor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__SENSOR_TYPE = eINSTANCE.getSensor_SensorType();

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
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__HOME = eINSTANCE.getHalSystem_Home();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__DEVICE = eINSTANCE.getHalSystem_Device();

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
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__TITLE = eINSTANCE.getRules_Title();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__PASSWORD = eINSTANCE.getRules_Password();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES__PRECONDITION = eINSTANCE.getRules_Precondition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES__ACTION = eINSTANCE.getRules_Action();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.LogImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__DATE = eINSTANCE.getLog_Date();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__START_TIME = eINSTANCE.getLog_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__END_TIME = eINSTANCE.getLog_EndTime();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__CONTENT = eINSTANCE.getLog_Content();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__RULES = eINSTANCE.getLog_Rules();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.PreConditionImpl <em>Pre Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.PreConditionImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getPreCondition()
		 * @generated
		 */
		EClass PRE_CONDITION = eINSTANCE.getPreCondition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONDITION__ID = eINSTANCE.getPreCondition_Id();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONDITION__CONTENT = eINSTANCE.getPreCondition_Content();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__SENSOR = eINSTANCE.getPreCondition_Sensor();

		/**
		 * The meta object literal for the '<em><b>Logicpiece</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__LOGICPIECE = eINSTANCE.getPreCondition_Logicpiece();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ActionImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ID = eINSTANCE.getAction_Id();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CONTENT = eINSTANCE.getAction_Content();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTUATOR = eINSTANCE.getAction_Actuator();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.SingleConditionImpl <em>Single Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.SingleConditionImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSingleCondition()
		 * @generated
		 */
		EClass SINGLE_CONDITION = eINSTANCE.getSingleCondition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_CONDITION__ID = eINSTANCE.getSingleCondition_Id();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.LogicGateImpl <em>Logic Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.LogicGateImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getLogicGate()
		 * @generated
		 */
		EClass LOGIC_GATE = eINSTANCE.getLogicGate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_GATE__TYPE = eINSTANCE.getLogicGate_Type();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.LogicPieceImpl <em>Logic Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.LogicPieceImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getLogicPiece()
		 * @generated
		 */
		EClass LOGIC_PIECE = eINSTANCE.getLogicPiece();

		/**
		 * The meta object literal for the '<em><b>Logicpiece</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PIECE__LOGICPIECE = eINSTANCE.getLogicPiece_Logicpiece();

		/**
		 * The meta object literal for the '<em><b>Singlecondition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PIECE__SINGLECONDITION = eINSTANCE.getLogicPiece_Singlecondition();

		/**
		 * The meta object literal for the '<em><b>Logicgate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PIECE__LOGICGATE = eINSTANCE.getLogicPiece_Logicgate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_PIECE__ID = eINSTANCE.getLogicPiece_Id();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.SensorType
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.ActuatorType <em>Actuator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.ActuatorType
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuatorType()
		 * @generated
		 */
		EEnum ACTUATOR_TYPE = eINSTANCE.getActuatorType();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.LogicType <em>Logic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.LogicType
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getLogicType()
		 * @generated
		 */
		EEnum LOGIC_TYPE = eINSTANCE.getLogicType();

	}

} //HalPackage
