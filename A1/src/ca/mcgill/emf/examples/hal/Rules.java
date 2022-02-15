/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Rules#getTitle <em>Title</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Rules#getPassword <em>Password</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Rules#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Rules#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getRules()
 * @model
 * @generated
 */
public interface Rules extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRules_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Rules#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRules_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Rules#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.PreCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRules_Precondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PreCondition> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRules_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getAction();

} // Rules
