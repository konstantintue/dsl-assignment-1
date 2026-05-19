/**
 */
package labouR.impl;

import java.util.Collection;

import labouR.LabouRPackage;
import labouR.Point;
import labouR.Route;
import labouR.RouteStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labouR.impl.RouteImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link labouR.impl.RouteImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link labouR.impl.RouteImpl#getGridBasePoint <em>Grid Base Point</em>}</li>
 *   <li>{@link labouR.impl.RouteImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected String grade = GRADE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGridBasePoint() <em>Grid Base Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridBasePoint()
	 * @generated
	 * @ordered
	 */
	protected Point gridBasePoint;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteStep> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabouRPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.ROUTE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrade(String newGrade) {
		String oldGrade = grade;
		grade = newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.ROUTE__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getGridBasePoint() {
		return gridBasePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridBasePoint(Point newGridBasePoint, NotificationChain msgs) {
		Point oldGridBasePoint = gridBasePoint;
		gridBasePoint = newGridBasePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabouRPackage.ROUTE__GRID_BASE_POINT, oldGridBasePoint, newGridBasePoint);
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
	public void setGridBasePoint(Point newGridBasePoint) {
		if (newGridBasePoint != gridBasePoint) {
			NotificationChain msgs = null;
			if (gridBasePoint != null)
				msgs = ((InternalEObject)gridBasePoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LabouRPackage.ROUTE__GRID_BASE_POINT, null, msgs);
			if (newGridBasePoint != null)
				msgs = ((InternalEObject)newGridBasePoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LabouRPackage.ROUTE__GRID_BASE_POINT, null, msgs);
			msgs = basicSetGridBasePoint(newGridBasePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabouRPackage.ROUTE__GRID_BASE_POINT, newGridBasePoint, newGridBasePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<RouteStep>(RouteStep.class, this, LabouRPackage.ROUTE__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LabouRPackage.ROUTE__GRID_BASE_POINT:
				return basicSetGridBasePoint(null, msgs);
			case LabouRPackage.ROUTE__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case LabouRPackage.ROUTE__IDENTIFIER:
				return getIdentifier();
			case LabouRPackage.ROUTE__GRADE:
				return getGrade();
			case LabouRPackage.ROUTE__GRID_BASE_POINT:
				return getGridBasePoint();
			case LabouRPackage.ROUTE__STEPS:
				return getSteps();
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
			case LabouRPackage.ROUTE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case LabouRPackage.ROUTE__GRADE:
				setGrade((String)newValue);
				return;
			case LabouRPackage.ROUTE__GRID_BASE_POINT:
				setGridBasePoint((Point)newValue);
				return;
			case LabouRPackage.ROUTE__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends RouteStep>)newValue);
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
			case LabouRPackage.ROUTE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case LabouRPackage.ROUTE__GRADE:
				setGrade(GRADE_EDEFAULT);
				return;
			case LabouRPackage.ROUTE__GRID_BASE_POINT:
				setGridBasePoint((Point)null);
				return;
			case LabouRPackage.ROUTE__STEPS:
				getSteps().clear();
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
			case LabouRPackage.ROUTE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case LabouRPackage.ROUTE__GRADE:
				return GRADE_EDEFAULT == null ? grade != null : !GRADE_EDEFAULT.equals(grade);
			case LabouRPackage.ROUTE__GRID_BASE_POINT:
				return gridBasePoint != null;
			case LabouRPackage.ROUTE__STEPS:
				return steps != null && !steps.isEmpty();
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", grade: ");
		result.append(grade);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
