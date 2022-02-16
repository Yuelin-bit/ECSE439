/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.LogicPiece;
import ca.mcgill.emf.examples.hal.PreCondition;
import ca.mcgill.emf.examples.hal.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.PreConditionImpl#getId <em>Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.PreConditionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.PreConditionImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.PreConditionImpl#getLogicpiece <em>Logicpiece</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreConditionImpl extends MinimalEObjectImpl.Container implements PreCondition {
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
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensor;

	/**
	 * The cached value of the '{@link #getLogicpiece() <em>Logicpiece</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicpiece()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicPiece> logicpiece;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.PRE_CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.PRE_CONDITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.PRE_CONDITION__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensor() {
		if (sensor == null) {
			sensor = new EObjectResolvingEList<Sensor>(Sensor.class, this, HalPackage.PRE_CONDITION__SENSOR);
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicPiece> getLogicpiece() {
		if (logicpiece == null) {
			logicpiece = new EObjectContainmentEList<LogicPiece>(LogicPiece.class, this, HalPackage.PRE_CONDITION__LOGICPIECE);
		}
		return logicpiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.PRE_CONDITION__LOGICPIECE:
				return ((InternalEList<?>)getLogicpiece()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HalPackage.PRE_CONDITION__ID:
				return getId();
			case HalPackage.PRE_CONDITION__CONTENT:
				return getContent();
			case HalPackage.PRE_CONDITION__SENSOR:
				return getSensor();
			case HalPackage.PRE_CONDITION__LOGICPIECE:
				return getLogicpiece();
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
			case HalPackage.PRE_CONDITION__ID:
				setId((String)newValue);
				return;
			case HalPackage.PRE_CONDITION__CONTENT:
				setContent((String)newValue);
				return;
			case HalPackage.PRE_CONDITION__SENSOR:
				getSensor().clear();
				getSensor().addAll((Collection<? extends Sensor>)newValue);
				return;
			case HalPackage.PRE_CONDITION__LOGICPIECE:
				getLogicpiece().clear();
				getLogicpiece().addAll((Collection<? extends LogicPiece>)newValue);
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
			case HalPackage.PRE_CONDITION__ID:
				setId(ID_EDEFAULT);
				return;
			case HalPackage.PRE_CONDITION__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case HalPackage.PRE_CONDITION__SENSOR:
				getSensor().clear();
				return;
			case HalPackage.PRE_CONDITION__LOGICPIECE:
				getLogicpiece().clear();
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
			case HalPackage.PRE_CONDITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case HalPackage.PRE_CONDITION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case HalPackage.PRE_CONDITION__SENSOR:
				return sensor != null && !sensor.isEmpty();
			case HalPackage.PRE_CONDITION__LOGICPIECE:
				return logicpiece != null && !logicpiece.isEmpty();
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
		result.append(", content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //PreConditionImpl
