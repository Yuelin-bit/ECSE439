/**
 */
package ca.mcgill.emf.examples.hal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Sensor#getSensorType <em>Sensor Type</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Device {

	/**
	 * Returns the value of the '<em><b>Sensor Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.emf.examples.hal.SensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Type</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.SensorType
	 * @see #setSensorType(SensorType)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensor_SensorType()
	 * @model
	 * @generated
	 */
	SensorType getSensorType();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Sensor#getSensorType <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Type</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.SensorType
	 * @see #getSensorType()
	 * @generated
	 */
	void setSensorType(SensorType value);
} // Sensor
