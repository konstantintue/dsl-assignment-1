/**
 */
package labouR.impl;

import labouR.Hold;
import labouR.HoldRole;
import labouR.HoldStep;
import labouR.LabouRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hold Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labouR.impl.HoldStepImpl#getHold <em>Hold</em>}</li>
 *   <li>{@link labouR.impl.HoldStepImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HoldStepImpl extends RouteStepImpl implements HoldStep {
	/**
	 * The cached value of the '{@link #getHold() <em>Hold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHold()
	 * @generated
	 * @ordered
	 */
	protected Hold hold;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final HoldRole ROLE_EDEFAULT = HoldRole.NORMAL;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected HoldRole role = ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HoldStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabouRPackage.Literals.HOLD_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hold getHold() {
		if (hold != null && hold.eIsProxy()) {
			InternalEObject oldHold = (InternalEObject)hold;
			hold = (Hold)eResolveProxy(oldHold);
			if (hold != oldHold) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LabouRPackage.HOLD_STEP__HOLD, oldHold, hold));
			}
		}
		return hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hold basicGetHold() {
		return hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHold(Hold newHold) {
		Hold oldHold = hold;
		hold = newHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.HOLD_STEP__HOLD, oldHold, hold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HoldRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(HoldRole newRole) {
		HoldRole oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.HOLD_STEP__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LabouRPackage.HOLD_STEP__HOLD:
				if (resolve) return getHold();
				return basicGetHold();
			case LabouRPackage.HOLD_STEP__ROLE:
				return getRole();
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
			case LabouRPackage.HOLD_STEP__HOLD:
				setHold((Hold)newValue);
				return;
			case LabouRPackage.HOLD_STEP__ROLE:
				setRole((HoldRole)newValue);
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
			case LabouRPackage.HOLD_STEP__HOLD:
				setHold((Hold)null);
				return;
			case LabouRPackage.HOLD_STEP__ROLE:
				setRole(ROLE_EDEFAULT);
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
			case LabouRPackage.HOLD_STEP__HOLD:
				return hold != null;
			case LabouRPackage.HOLD_STEP__ROLE:
				return role != ROLE_EDEFAULT;
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
		result.append(" (role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //HoldStepImpl
