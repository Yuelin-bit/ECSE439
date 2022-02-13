/**
 */
package ca.mcgill.emf.examples.hal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Actuator#getActuatorType <em>Actuator Type</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Device {

	/**
	 * Returns the value of the '<em><b>Actuator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.emf.examples.hal.ActuatorTpye}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Type</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.ActuatorTpye
	 * @see #setActuatorType(ActuatorTpye)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuator_ActuatorType()
	 * @model
	 * @generated
	 */
	ActuatorTpye getActuatorType();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Actuator#getActuatorType <em>Actuator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Type</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.ActuatorTpye
	 * @see #getActuatorType()
	 * @generated
	 */
	void setActuatorType(ActuatorTpye value);
} // Actuator
