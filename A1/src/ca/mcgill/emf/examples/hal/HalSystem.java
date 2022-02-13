/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.HalSystem#getRules <em>Rules</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.HalSystem#getHome <em>Home</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getHalSystem()
 * @model
 * @generated
 */
public interface HalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Rules}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHalSystem_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rules> getRules();

	/**
	 * Returns the value of the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' containment reference.
	 * @see #setHome(Home)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHalSystem_Home()
	 * @model containment="true"
	 * @generated
	 */
	Home getHome();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.HalSystem#getHome <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' containment reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(Home value);

} // HalSystem
