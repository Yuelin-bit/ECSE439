/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.LogicGate;
import ca.mcgill.emf.examples.hal.LogicPiece;
import ca.mcgill.emf.examples.hal.SingleCondition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.LogicPieceImpl#getLogicpiece <em>Logicpiece</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.LogicPieceImpl#getSinglecondition <em>Singlecondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.LogicPieceImpl#getLogicgate <em>Logicgate</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.LogicPieceImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicPieceImpl extends MinimalEObjectImpl.Container implements LogicPiece {
	/**
	 * The cached value of the '{@link #getLogicpiece() <em>Logicpiece</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicpiece()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicPiece> logicpiece;

	/**
	 * The cached value of the '{@link #getSinglecondition() <em>Singlecondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinglecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleCondition> singlecondition;

	/**
	 * The cached value of the '{@link #getLogicgate() <em>Logicgate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicgate()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicGate> logicgate;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicPieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.LOGIC_PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicPiece> getLogicpiece() {
		if (logicpiece == null) {
			logicpiece = new EObjectResolvingEList<LogicPiece>(LogicPiece.class, this, HalPackage.LOGIC_PIECE__LOGICPIECE);
		}
		return logicpiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleCondition> getSinglecondition() {
		if (singlecondition == null) {
			singlecondition = new EObjectResolvingEList<SingleCondition>(SingleCondition.class, this, HalPackage.LOGIC_PIECE__SINGLECONDITION);
		}
		return singlecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicGate> getLogicgate() {
		if (logicgate == null) {
			logicgate = new EObjectResolvingEList<LogicGate>(LogicGate.class, this, HalPackage.LOGIC_PIECE__LOGICGATE);
		}
		return logicgate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.LOGIC_PIECE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HalPackage.LOGIC_PIECE__LOGICPIECE:
				return getLogicpiece();
			case HalPackage.LOGIC_PIECE__SINGLECONDITION:
				return getSinglecondition();
			case HalPackage.LOGIC_PIECE__LOGICGATE:
				return getLogicgate();
			case HalPackage.LOGIC_PIECE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HalPackage.LOGIC_PIECE__LOGICPIECE:
				getLogicpiece().clear();
				getLogicpiece().addAll((Collection<? extends LogicPiece>)newValue);
				return;
			case HalPackage.LOGIC_PIECE__SINGLECONDITION:
				getSinglecondition().clear();
				getSinglecondition().addAll((Collection<? extends SingleCondition>)newValue);
				return;
			case HalPackage.LOGIC_PIECE__LOGICGATE:
				getLogicgate().clear();
				getLogicgate().addAll((Collection<? extends LogicGate>)newValue);
				return;
			case HalPackage.LOGIC_PIECE__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HalPackage.LOGIC_PIECE__LOGICPIECE:
				getLogicpiece().clear();
				return;
			case HalPackage.LOGIC_PIECE__SINGLECONDITION:
				getSinglecondition().clear();
				return;
			case HalPackage.LOGIC_PIECE__LOGICGATE:
				getLogicgate().clear();
				return;
			case HalPackage.LOGIC_PIECE__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HalPackage.LOGIC_PIECE__LOGICPIECE:
				return logicpiece != null && !logicpiece.isEmpty();
			case HalPackage.LOGIC_PIECE__SINGLECONDITION:
				return singlecondition != null && !singlecondition.isEmpty();
			case HalPackage.LOGIC_PIECE__LOGICGATE:
				return logicgate != null && !logicgate.isEmpty();
			case HalPackage.LOGIC_PIECE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //LogicPieceImpl
