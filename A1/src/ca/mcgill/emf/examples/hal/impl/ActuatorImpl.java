/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.Actuator;
import ca.mcgill.emf.examples.hal.ActuatorTpye;
import ca.mcgill.emf.examples.hal.HalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl#getActuatorType <em>Actuator Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends DeviceImpl implements Actuator {
	/**
	 * The default value of the '{@link #getActuatorType() <em>Actuator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorType()
	 * @generated
	 * @ordered
	 */
	protected static final ActuatorTpye ACTUATOR_TYPE_EDEFAULT = ActuatorTpye.HEATER;
	/**
	 * The cached value of the '{@link #getActuatorType() <em>Actuator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorType()
	 * @generated
	 * @ordered
	 */
	protected ActuatorTpye actuatorType = ACTUATOR_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorTpye getActuatorType() {
		return actuatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuatorType(ActuatorTpye newActuatorType) {
		ActuatorTpye oldActuatorType = actuatorType;
		actuatorType = newActuatorType == null ? ACTUATOR_TYPE_EDEFAULT : newActuatorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR__ACTUATOR_TYPE, oldActuatorType, actuatorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HalPackage.ACTUATOR__ACTUATOR_TYPE:
				return getActuatorType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HalPackage.ACTUATOR__ACTUATOR_TYPE:
				setActuatorType((ActuatorTpye)newValue);
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
			case HalPackage.ACTUATOR__ACTUATOR_TYPE:
				setActuatorType(ACTUATOR_TYPE_EDEFAULT);
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
			case HalPackage.ACTUATOR__ACTUATOR_TYPE:
				return actuatorType != ACTUATOR_TYPE_EDEFAULT;
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
		result.append(" (actuatorType: ");
		result.append(actuatorType);
		result.append(')');
		return result.toString();
	}

} //ActuatorImpl
