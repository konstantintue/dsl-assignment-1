/**
 */
package labouR.impl;

import java.util.Collection;

import labouR.Hold;
import labouR.LabouRPackage;
import labouR.Point;
import labouR.Triangle;

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
 * An implementation of the model object '<em><b>Triangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labouR.impl.TriangleImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link labouR.impl.TriangleImpl#getCorner1 <em>Corner1</em>}</li>
 *   <li>{@link labouR.impl.TriangleImpl#getCorner2 <em>Corner2</em>}</li>
 *   <li>{@link labouR.impl.TriangleImpl#getCorner3 <em>Corner3</em>}</li>
 *   <li>{@link labouR.impl.TriangleImpl#getExtrusion <em>Extrusion</em>}</li>
 *   <li>{@link labouR.impl.TriangleImpl#getLeftHolds <em>Left Holds</em>}</li>
 *   <li>{@link labouR.impl.TriangleImpl#getRightHolds <em>Right Holds</em>}</li>
 *   <li>{@link labouR.impl.TriangleImpl#getBottomHolds <em>Bottom Holds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriangleImpl extends VolumeImpl implements Triangle {
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
	 * The cached value of the '{@link #getCorner1() <em>Corner1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorner1()
	 * @generated
	 * @ordered
	 */
	protected Point corner1;

	/**
	 * The cached value of the '{@link #getCorner2() <em>Corner2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorner2()
	 * @generated
	 * @ordered
	 */
	protected Point corner2;

	/**
	 * The cached value of the '{@link #getCorner3() <em>Corner3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorner3()
	 * @generated
	 * @ordered
	 */
	protected Point corner3;

	/**
	 * The cached value of the '{@link #getExtrusion() <em>Extrusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusion()
	 * @generated
	 * @ordered
	 */
	protected Point extrusion;

	/**
	 * The cached value of the '{@link #getLeftHolds() <em>Left Holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHolds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> leftHolds;

	/**
	 * The cached value of the '{@link #getRightHolds() <em>Right Holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHolds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> rightHolds;

	/**
	 * The cached value of the '{@link #getBottomHolds() <em>Bottom Holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomHolds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> bottomHolds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabouRPackage.Literals.TRIANGLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.TRIANGLE__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getCorner1() {
		return corner1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorner1(Point newCorner1, NotificationChain msgs) {
		Point oldCorner1 = corner1;
		corner1 = newCorner1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabouRPackage.TRIANGLE__CORNER1, oldCorner1, newCorner1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorner1(Point newCorner1) {
		if (newCorner1 != corner1) {
			NotificationChain msgs = null;
			if (corner1 != null)
				msgs = ((InternalEObject)corner1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LabouRPackage.TRIANGLE__CORNER1, null, msgs);
			if (newCorner1 != null)
				msgs = ((InternalEObject)newCorner1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LabouRPackage.TRIANGLE__CORNER1, null, msgs);
			msgs = basicSetCorner1(newCorner1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.TRIANGLE__CORNER1, newCorner1, newCorner1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getCorner2() {
		return corner2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorner2(Point newCorner2, NotificationChain msgs) {
		Point oldCorner2 = corner2;
		corner2 = newCorner2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabouRPackage.TRIANGLE__CORNER2, oldCorner2, newCorner2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorner2(Point newCorner2) {
		if (newCorner2 != corner2) {
			NotificationChain msgs = null;
			if (corner2 != null)
				msgs = ((InternalEObject)corner2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LabouRPackage.TRIANGLE__CORNER2, null, msgs);
			if (newCorner2 != null)
				msgs = ((InternalEObject)newCorner2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LabouRPackage.TRIANGLE__CORNER2, null, msgs);
			msgs = basicSetCorner2(newCorner2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.TRIANGLE__CORNER2, newCorner2, newCorner2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getCorner3() {
		return corner3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorner3(Point newCorner3, NotificationChain msgs) {
		Point oldCorner3 = corner3;
		corner3 = newCorner3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabouRPackage.TRIANGLE__CORNER3, oldCorner3, newCorner3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorner3(Point newCorner3) {
		if (newCorner3 != corner3) {
			NotificationChain msgs = null;
			if (corner3 != null)
				msgs = ((InternalEObject)corner3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LabouRPackage.TRIANGLE__CORNER3, null, msgs);
			if (newCorner3 != null)
				msgs = ((InternalEObject)newCorner3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LabouRPackage.TRIANGLE__CORNER3, null, msgs);
			msgs = basicSetCorner3(newCorner3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.TRIANGLE__CORNER3, newCorner3, newCorner3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getExtrusion() {
		return extrusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrusion(Point newExtrusion, NotificationChain msgs) {
		Point oldExtrusion = extrusion;
		extrusion = newExtrusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabouRPackage.TRIANGLE__EXTRUSION, oldExtrusion, newExtrusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtrusion(Point newExtrusion) {
		if (newExtrusion != extrusion) {
			NotificationChain msgs = null;
			if (extrusion != null)
				msgs = ((InternalEObject)extrusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LabouRPackage.TRIANGLE__EXTRUSION, null, msgs);
			if (newExtrusion != null)
				msgs = ((InternalEObject)newExtrusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LabouRPackage.TRIANGLE__EXTRUSION, null, msgs);
			msgs = basicSetExtrusion(newExtrusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.TRIANGLE__EXTRUSION, newExtrusion, newExtrusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getLeftHolds() {
		if (leftHolds == null) {
			leftHolds = new EObjectContainmentEList<Hold>(Hold.class, this, LabouRPackage.TRIANGLE__LEFT_HOLDS);
		}
		return leftHolds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getRightHolds() {
		if (rightHolds == null) {
			rightHolds = new EObjectContainmentEList<Hold>(Hold.class, this, LabouRPackage.TRIANGLE__RIGHT_HOLDS);
		}
		return rightHolds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getBottomHolds() {
		if (bottomHolds == null) {
			bottomHolds = new EObjectContainmentEList<Hold>(Hold.class, this, LabouRPackage.TRIANGLE__BOTTOM_HOLDS);
		}
		return bottomHolds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LabouRPackage.TRIANGLE__CORNER1:
				return basicSetCorner1(null, msgs);
			case LabouRPackage.TRIANGLE__CORNER2:
				return basicSetCorner2(null, msgs);
			case LabouRPackage.TRIANGLE__CORNER3:
				return basicSetCorner3(null, msgs);
			case LabouRPackage.TRIANGLE__EXTRUSION:
				return basicSetExtrusion(null, msgs);
			case LabouRPackage.TRIANGLE__LEFT_HOLDS:
				return ((InternalEList<?>)getLeftHolds()).basicRemove(otherEnd, msgs);
			case LabouRPackage.TRIANGLE__RIGHT_HOLDS:
				return ((InternalEList<?>)getRightHolds()).basicRemove(otherEnd, msgs);
			case LabouRPackage.TRIANGLE__BOTTOM_HOLDS:
				return ((InternalEList<?>)getBottomHolds()).basicRemove(otherEnd, msgs);
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
			case LabouRPackage.TRIANGLE__DEPTH:
				return getDepth();
			case LabouRPackage.TRIANGLE__CORNER1:
				return getCorner1();
			case LabouRPackage.TRIANGLE__CORNER2:
				return getCorner2();
			case LabouRPackage.TRIANGLE__CORNER3:
				return getCorner3();
			case LabouRPackage.TRIANGLE__EXTRUSION:
				return getExtrusion();
			case LabouRPackage.TRIANGLE__LEFT_HOLDS:
				return getLeftHolds();
			case LabouRPackage.TRIANGLE__RIGHT_HOLDS:
				return getRightHolds();
			case LabouRPackage.TRIANGLE__BOTTOM_HOLDS:
				return getBottomHolds();
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
			case LabouRPackage.TRIANGLE__DEPTH:
				setDepth((Integer)newValue);
				return;
			case LabouRPackage.TRIANGLE__CORNER1:
				setCorner1((Point)newValue);
				return;
			case LabouRPackage.TRIANGLE__CORNER2:
				setCorner2((Point)newValue);
				return;
			case LabouRPackage.TRIANGLE__CORNER3:
				setCorner3((Point)newValue);
				return;
			case LabouRPackage.TRIANGLE__EXTRUSION:
				setExtrusion((Point)newValue);
				return;
			case LabouRPackage.TRIANGLE__LEFT_HOLDS:
				getLeftHolds().clear();
				getLeftHolds().addAll((Collection<? extends Hold>)newValue);
				return;
			case LabouRPackage.TRIANGLE__RIGHT_HOLDS:
				getRightHolds().clear();
				getRightHolds().addAll((Collection<? extends Hold>)newValue);
				return;
			case LabouRPackage.TRIANGLE__BOTTOM_HOLDS:
				getBottomHolds().clear();
				getBottomHolds().addAll((Collection<? extends Hold>)newValue);
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
			case LabouRPackage.TRIANGLE__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case LabouRPackage.TRIANGLE__CORNER1:
				setCorner1((Point)null);
				return;
			case LabouRPackage.TRIANGLE__CORNER2:
				setCorner2((Point)null);
				return;
			case LabouRPackage.TRIANGLE__CORNER3:
				setCorner3((Point)null);
				return;
			case LabouRPackage.TRIANGLE__EXTRUSION:
				setExtrusion((Point)null);
				return;
			case LabouRPackage.TRIANGLE__LEFT_HOLDS:
				getLeftHolds().clear();
				return;
			case LabouRPackage.TRIANGLE__RIGHT_HOLDS:
				getRightHolds().clear();
				return;
			case LabouRPackage.TRIANGLE__BOTTOM_HOLDS:
				getBottomHolds().clear();
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
			case LabouRPackage.TRIANGLE__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case LabouRPackage.TRIANGLE__CORNER1:
				return corner1 != null;
			case LabouRPackage.TRIANGLE__CORNER2:
				return corner2 != null;
			case LabouRPackage.TRIANGLE__CORNER3:
				return corner3 != null;
			case LabouRPackage.TRIANGLE__EXTRUSION:
				return extrusion != null;
			case LabouRPackage.TRIANGLE__LEFT_HOLDS:
				return leftHolds != null && !leftHolds.isEmpty();
			case LabouRPackage.TRIANGLE__RIGHT_HOLDS:
				return rightHolds != null && !rightHolds.isEmpty();
			case LabouRPackage.TRIANGLE__BOTTOM_HOLDS:
				return bottomHolds != null && !bottomHolds.isEmpty();
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
		result.append(" (depth: ");
		result.append(depth);
		result.append(')');
		return result.toString();
	}

} //TriangleImpl
