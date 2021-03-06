/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Home#getAddress <em>Address</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Home#getRooms <em>Rooms</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Home#getActivityLogs <em>Activity Logs</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome()
 * @model
 * @generated
 */
public interface Home extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Home#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome_Rooms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Activity Logs</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Log}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Logs</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome_ActivityLogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Log> getActivityLogs();

} // Home
