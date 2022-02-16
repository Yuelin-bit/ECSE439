/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.LogicGate#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getLogicGate()
 * @model
 * @generated
 */
public interface LogicGate extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.emf.examples.hal.LogicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.LogicType
	 * @see #setType(LogicType)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getLogicGate_Type()
	 * @model
	 * @generated
	 */
	LogicType getType();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.LogicGate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.LogicType
	 * @see #getType()
	 * @generated
	 */
	void setType(LogicType value);

} // LogicGate
