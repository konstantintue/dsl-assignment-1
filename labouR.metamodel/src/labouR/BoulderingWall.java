/**
 */
package labouR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bouldering Wall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Single root class for a LaBouR model. It composes the wall volumes and routes, satisfying the assignment requirement that all model elements are reachable from one root object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labouR.BoulderingWall#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link labouR.BoulderingWall#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link labouR.BoulderingWall#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see labouR.LabouRPackage#getBoulderingWall()
 * @model
 * @generated
 */
public interface BoulderingWall extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see labouR.LabouRPackage#getBoulderingWall_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link labouR.BoulderingWall#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link labouR.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see labouR.LabouRPackage#getBoulderingWall_Volumes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link labouR.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see labouR.LabouRPackage#getBoulderingWall_Routes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Route> getRoutes();

} // BoulderingWall
