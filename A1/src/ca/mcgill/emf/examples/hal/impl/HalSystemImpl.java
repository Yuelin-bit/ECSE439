/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.HalSystem;
import ca.mcgill.emf.examples.hal.Home;
import ca.mcgill.emf.examples.hal.Rules;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.HalSystemImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.HalSystemImpl#getHome <em>Home</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HalSystemImpl extends MinimalEObjectImpl.Container implements HalSystem {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rules> rules;

	/**
	 * The cached value of the '{@link #getHome() <em>Home</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome()
	 * @generated
	 * @ordered
	 */
	protected EList<Home> home;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.HAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rules> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rules>(Rules.class, this, HalPackage.HAL_SYSTEM__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Home> getHome() {
		if (home == null) {
			home = new EObjectContainmentEList<Home>(Home.class, this, HalPackage.HAL_SYSTEM__HOME);
		}
		return home;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.HAL_SYSTEM__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case HalPackage.HAL_SYSTEM__HOME:
				return ((InternalEList<?>)getHome()).basicRemove(otherEnd, msgs);
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
			case HalPackage.HAL_SYSTEM__RULES:
				return getRules();
			case HalPackage.HAL_SYSTEM__HOME:
				return getHome();
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
			case HalPackage.HAL_SYSTEM__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rules>)newValue);
				return;
			case HalPackage.HAL_SYSTEM__HOME:
				getHome().clear();
				getHome().addAll((Collection<? extends Home>)newValue);
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
			case HalPackage.HAL_SYSTEM__RULES:
				getRules().clear();
				return;
			case HalPackage.HAL_SYSTEM__HOME:
				getHome().clear();
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
			case HalPackage.HAL_SYSTEM__RULES:
				return rules != null && !rules.isEmpty();
			case HalPackage.HAL_SYSTEM__HOME:
				return home != null && !home.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HalSystemImpl
