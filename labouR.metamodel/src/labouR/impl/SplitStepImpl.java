/**
 */
package labouR.impl;

import labouR.Hold;
import labouR.HoldRole;
import labouR.LabouRPackage;
import labouR.SplitStep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labouR.impl.SplitStepImpl#getFirstHold <em>First Hold</em>}</li>
 *   <li>{@link labouR.impl.SplitStepImpl#getSecondHold <em>Second Hold</em>}</li>
 *   <li>{@link labouR.impl.SplitStepImpl#getFirstRole <em>First Role</em>}</li>
 *   <li>{@link labouR.impl.SplitStepImpl#getSecondRole <em>Second Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplitStepImpl extends RouteStepImpl implements SplitStep {
	/**
	 * The cached value of the '{@link #getFirstHold() <em>First Hold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstHold()
	 * @generated
	 * @ordered
	 */
	protected Hold firstHold;

	/**
	 * The cached value of the '{@link #getSecondHold() <em>Second Hold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondHold()
	 * @generated
	 * @ordered
	 */
	protected Hold secondHold;

	/**
	 * The default value of the '{@link #getFirstRole() <em>First Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRole()
	 * @generated
	 * @ordered
	 */
	protected static final HoldRole FIRST_ROLE_EDEFAULT = HoldRole.NORMAL;

	/**
	 * The cached value of the '{@link #getFirstRole() <em>First Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRole()
	 * @generated
	 * @ordered
	 */
	protected HoldRole firstRole = FIRST_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondRole() <em>Second Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondRole()
	 * @generated
	 * @ordered
	 */
	protected static final HoldRole SECOND_ROLE_EDEFAULT = HoldRole.NORMAL;

	/**
	 * The cached value of the '{@link #getSecondRole() <em>Second Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondRole()
	 * @generated
	 * @ordered
	 */
	protected HoldRole secondRole = SECOND_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabouRPackage.Literals.SPLIT_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hold getFirstHold() {
		if (firstHold != null && firstHold.eIsProxy()) {
			InternalEObject oldFirstHold = (InternalEObject)firstHold;
			firstHold = (Hold)eResolveProxy(oldFirstHold);
			if (firstHold != oldFirstHold) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LabouRPackage.SPLIT_STEP__FIRST_HOLD, oldFirstHold, firstHold));
			}
		}
		return firstHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hold basicGetFirstHold() {
		return firstHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstHold(Hold newFirstHold) {
		Hold oldFirstHold = firstHold;
		firstHold = newFirstHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.SPLIT_STEP__FIRST_HOLD, oldFirstHold, firstHold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hold getSecondHold() {
		if (secondHold != null && secondHold.eIsProxy()) {
			InternalEObject oldSecondHold = (InternalEObject)secondHold;
			secondHold = (Hold)eResolveProxy(oldSecondHold);
			if (secondHold != oldSecondHold) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LabouRPackage.SPLIT_STEP__SECOND_HOLD, oldSecondHold, secondHold));
			}
		}
		return secondHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hold basicGetSecondHold() {
		return secondHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondHold(Hold newSecondHold) {
		Hold oldSecondHold = secondHold;
		secondHold = newSecondHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.SPLIT_STEP__SECOND_HOLD, oldSecondHold, secondHold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HoldRole getFirstRole() {
		return firstRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstRole(HoldRole newFirstRole) {
		HoldRole oldFirstRole = firstRole;
		firstRole = newFirstRole == null ? FIRST_ROLE_EDEFAULT : newFirstRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.SPLIT_STEP__FIRST_ROLE, oldFirstRole, firstRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HoldRole getSecondRole() {
		return secondRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondRole(HoldRole newSecondRole) {
		HoldRole oldSecondRole = secondRole;
		secondRole = newSecondRole == null ? SECOND_ROLE_EDEFAULT : newSecondRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.SPLIT_STEP__SECOND_ROLE, oldSecondRole, secondRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LabouRPackage.SPLIT_STEP__FIRST_HOLD:
				if (resolve) return getFirstHold();
				return basicGetFirstHold();
			case LabouRPackage.SPLIT_STEP__SECOND_HOLD:
				if (resolve) return getSecondHold();
				return basicGetSecondHold();
			case LabouRPackage.SPLIT_STEP__FIRST_ROLE:
				return getFirstRole();
			case LabouRPackage.SPLIT_STEP__SECOND_ROLE:
				return getSecondRole();
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
			case LabouRPackage.SPLIT_STEP__FIRST_HOLD:
				setFirstHold((Hold)newValue);
				return;
			case LabouRPackage.SPLIT_STEP__SECOND_HOLD:
				setSecondHold((Hold)newValue);
				return;
			case LabouRPackage.SPLIT_STEP__FIRST_ROLE:
				setFirstRole((HoldRole)newValue);
				return;
			case LabouRPackage.SPLIT_STEP__SECOND_ROLE:
				setSecondRole((HoldRole)newValue);
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
			case LabouRPackage.SPLIT_STEP__FIRST_HOLD:
				setFirstHold((Hold)null);
				return;
			case LabouRPackage.SPLIT_STEP__SECOND_HOLD:
				setSecondHold((Hold)null);
				return;
			case LabouRPackage.SPLIT_STEP__FIRST_ROLE:
				setFirstRole(FIRST_ROLE_EDEFAULT);
				return;
			case LabouRPackage.SPLIT_STEP__SECOND_ROLE:
				setSecondRole(SECOND_ROLE_EDEFAULT);
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
			case LabouRPackage.SPLIT_STEP__FIRST_HOLD:
				return firstHold != null;
			case LabouRPackage.SPLIT_STEP__SECOND_HOLD:
				return secondHold != null;
			case LabouRPackage.SPLIT_STEP__FIRST_ROLE:
				return firstRole != FIRST_ROLE_EDEFAULT;
			case LabouRPackage.SPLIT_STEP__SECOND_ROLE:
				return secondRole != SECOND_ROLE_EDEFAULT;
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
		result.append(" (firstRole: ");
		result.append(firstRole);
		result.append(", secondRole: ");
		result.append(secondRole);
		result.append(')');
		return result.toString();
	}

} //SplitStepImpl
