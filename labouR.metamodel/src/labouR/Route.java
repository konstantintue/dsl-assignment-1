/**
 */
package labouR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ordered route description. The route contains RouteStep objects that reference existing holds rather than containing holds, avoiding duplication of physical holds owned by volumes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labouR.Route#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link labouR.Route#getGrade <em>Grade</em>}</li>
 *   <li>{@link labouR.Route#getGridBasePoint <em>Grid Base Point</em>}</li>
 *   <li>{@link labouR.Route#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see labouR.LabouRPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see labouR.LabouRPackage#getRoute_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link labouR.Route#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(String)
	 * @see labouR.LabouRPackage#getRoute_Grade()
	 * @model required="true"
	 * @generated
	 */
	String getGrade();

	/**
	 * Sets the value of the '{@link labouR.Route#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(String value);

	/**
	 * Returns the value of the '<em><b>Grid Base Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Base Point</em>' containment reference.
	 * @see #setGridBasePoint(Point)
	 * @see labouR.LabouRPackage#getRoute_GridBasePoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getGridBasePoint();

	/**
	 * Sets the value of the '{@link labouR.Route#getGridBasePoint <em>Grid Base Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Base Point</em>' containment reference.
	 * @see #getGridBasePoint()
	 * @generated
	 */
	void setGridBasePoint(Point value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link labouR.RouteStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see labouR.LabouRPackage#getRoute_Steps()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<RouteStep> getSteps();

} // Route
