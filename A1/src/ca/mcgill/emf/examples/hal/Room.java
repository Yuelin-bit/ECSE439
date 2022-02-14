/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Room#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Room#isIsWindowOpen <em>Is Window Open</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Room#isIsHeaterOn <em>Is Heater On</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Room#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Device}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Device#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom_Device()
	 * @see ca.mcgill.emf.examples.hal.Device#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Device> getDevice();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Window Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Window Open</em>' attribute.
	 * @see #setIsWindowOpen(boolean)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom_IsWindowOpen()
	 * @model
	 * @generated
	 */
	boolean isIsWindowOpen();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Room#isIsWindowOpen <em>Is Window Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Window Open</em>' attribute.
	 * @see #isIsWindowOpen()
	 * @generated
	 */
	void setIsWindowOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Heater On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Heater On</em>' attribute.
	 * @see #setIsHeaterOn(boolean)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom_IsHeaterOn()
	 * @model
	 * @generated
	 */
	boolean isIsHeaterOn();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Room#isIsHeaterOn <em>Is Heater On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Heater On</em>' attribute.
	 * @see #isIsHeaterOn()
	 * @generated
	 */
	void setIsHeaterOn(boolean value);

} // Room
