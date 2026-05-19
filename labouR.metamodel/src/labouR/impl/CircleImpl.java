/**
 */
package labouR.impl;

import java.util.Collection;

import labouR.Circle;
import labouR.Hold;
import labouR.LabouRPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labouR.impl.CircleImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link labouR.impl.CircleImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link labouR.impl.CircleImpl#getFrontHolds <em>Front Holds</em>}</li>
 *   <li>{@link labouR.impl.CircleImpl#getSideHolds <em>Side Holds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircleImpl extends VolumeImpl implements Circle {
	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final int RADIUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected int radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected int depth = DEPTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrontHolds() <em>Front Holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontHolds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> frontHolds;

	/**
	 * The cached value of the '{@link #getSideHolds() <em>Side Holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideHolds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> sideHolds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabouRPackage.Literals.CIRCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadius(int newRadius) {
		int oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.CIRCLE__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepth(int newDepth) {
		int oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.CIRCLE__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getFrontHolds() {
		if (frontHolds == null) {
			frontHolds = new EObjectContainmentEList<Hold>(Hold.class, this, LabouRPackage.CIRCLE__FRONT_HOLDS);
		}
		return frontHolds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getSideHolds() {
		if (sideHolds == null) {
			sideHolds = new EObjectContainmentEList<Hold>(Hold.class, this, LabouRPackage.CIRCLE__SIDE_HOLDS);
		}
		return sideHolds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LabouRPackage.CIRCLE__FRONT_HOLDS:
				return ((InternalEList<?>)getFrontHolds()).basicRemove(otherEnd, msgs);
			case LabouRPackage.CIRCLE__SIDE_HOLDS:
				return ((InternalEList<?>)getSideHolds()).basicRemove(otherEnd, msgs);
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
			case LabouRPackage.CIRCLE__RADIUS:
				return getRadius();
			case LabouRPackage.CIRCLE__DEPTH:
				return getDepth();
			case LabouRPackage.CIRCLE__FRONT_HOLDS:
				return getFrontHolds();
			case LabouRPackage.CIRCLE__SIDE_HOLDS:
				return getSideHolds();
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
			case LabouRPackage.CIRCLE__RADIUS:
				setRadius((Integer)newValue);
				return;
			case LabouRPackage.CIRCLE__DEPTH:
				setDepth((Integer)newValue);
				return;
			case LabouRPackage.CIRCLE__FRONT_HOLDS:
				getFrontHolds().clear();
				getFrontHolds().addAll((Collection<? extends Hold>)newValue);
				return;
			case LabouRPackage.CIRCLE__SIDE_HOLDS:
				getSideHolds().clear();
				getSideHolds().addAll((Collection<? extends Hold>)newValue);
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
			case LabouRPackage.CIRCLE__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case LabouRPackage.CIRCLE__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case LabouRPackage.CIRCLE__FRONT_HOLDS:
				getFrontHolds().clear();
				return;
			case LabouRPackage.CIRCLE__SIDE_HOLDS:
				getSideHolds().clear();
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
			case LabouRPackage.CIRCLE__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case LabouRPackage.CIRCLE__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case LabouRPackage.CIRCLE__FRONT_HOLDS:
				return frontHolds != null && !frontHolds.isEmpty();
			case LabouRPackage.CIRCLE__SIDE_HOLDS:
				return sideHolds != null && !sideHolds.isEmpty();
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
		result.append(" (radius: ");
		result.append(radius);
		result.append(", depth: ");
		result.append(depth);
		result.append(')');
		return result.toString();
	}

} //CircleImpl
