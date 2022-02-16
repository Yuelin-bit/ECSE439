/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.LogicPiece#getLogicpiece <em>Logicpiece</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.LogicPiece#getSinglecondition <em>Singlecondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.LogicPiece#getLogicgate <em>Logicgate</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.LogicPiece#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getLogicPiece()
 * @model
 * @generated
 */
public interface LogicPiece extends EObject {
	/**
	 * Returns the value of the '<em><b>Logicpiece</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.LogicPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logicpiece</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getLogicPiece_Logicpiece()
	 * @model
	 * @generated
	 */
	EList<LogicPiece> getLogicpiece();

	/**
	 * Returns the value of the '<em><b>Singlecondition</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.SingleCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singlecondition</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getLogicPiece_Singlecondition()
	 * @model
	 * @generated
	 */
	EList<SingleCondition> getSinglecondition();

	/**
	 * Returns the value of the '<em><b>Logicgate</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.LogicGate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logicgate</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getLogicPiece_Logicgate()
	 * @model
	 * @generated
	 */
	EList<LogicGate> getLogicgate();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getLogicPiece_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.LogicPiece#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LogicPiece
