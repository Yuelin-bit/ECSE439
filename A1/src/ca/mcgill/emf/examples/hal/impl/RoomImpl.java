/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.Device;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Room;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.RoomImpl#isIsWindowOpen <em>Is Window Open</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.RoomImpl#isIsHeaterOn <em>Is Heater On</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.RoomImpl#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsWindowOpen() <em>Is Window Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWindowOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WINDOW_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWindowOpen() <em>Is Window Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWindowOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean isWindowOpen = IS_WINDOW_OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsHeaterOn() <em>Is Heater On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeaterOn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HEATER_ON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHeaterOn() <em>Is Heater On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeaterOn()
	 * @generated
	 * @ordered
	 */
	protected boolean isHeaterOn = IS_HEATER_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevice() {
		if (device == null) {
			device = new EObjectWithInverseResolvingEList<Device>(Device.class, this, HalPackage.ROOM__DEVICE, HalPackage.DEVICE__ROOM);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.ROOM__DEVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDevice()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.ROOM__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ROOM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWindowOpen() {
		return isWindowOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWindowOpen(boolean newIsWindowOpen) {
		boolean oldIsWindowOpen = isWindowOpen;
		isWindowOpen = newIsWindowOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ROOM__IS_WINDOW_OPEN, oldIsWindowOpen, isWindowOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHeaterOn() {
		return isHeaterOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHeaterOn(boolean newIsHeaterOn) {
		boolean oldIsHeaterOn = isHeaterOn;
		isHeaterOn = newIsHeaterOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ROOM__IS_HEATER_ON, oldIsHeaterOn, isHeaterOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HalPackage.ROOM__NAME:
				return getName();
			case HalPackage.ROOM__IS_WINDOW_OPEN:
				return isIsWindowOpen();
			case HalPackage.ROOM__IS_HEATER_ON:
				return isIsHeaterOn();
			case HalPackage.ROOM__DEVICE:
				return getDevice();
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
			case HalPackage.ROOM__NAME:
				setName((String)newValue);
				return;
			case HalPackage.ROOM__IS_WINDOW_OPEN:
				setIsWindowOpen((Boolean)newValue);
				return;
			case HalPackage.ROOM__IS_HEATER_ON:
				setIsHeaterOn((Boolean)newValue);
				return;
			case HalPackage.ROOM__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Device>)newValue);
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
			case HalPackage.ROOM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HalPackage.ROOM__IS_WINDOW_OPEN:
				setIsWindowOpen(IS_WINDOW_OPEN_EDEFAULT);
				return;
			case HalPackage.ROOM__IS_HEATER_ON:
				setIsHeaterOn(IS_HEATER_ON_EDEFAULT);
				return;
			case HalPackage.ROOM__DEVICE:
				getDevice().clear();
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
			case HalPackage.ROOM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HalPackage.ROOM__IS_WINDOW_OPEN:
				return isWindowOpen != IS_WINDOW_OPEN_EDEFAULT;
			case HalPackage.ROOM__IS_HEATER_ON:
				return isHeaterOn != IS_HEATER_ON_EDEFAULT;
			case HalPackage.ROOM__DEVICE:
				return device != null && !device.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isWindowOpen: ");
		result.append(isWindowOpen);
		result.append(", isHeaterOn: ");
		result.append(isHeaterOn);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
