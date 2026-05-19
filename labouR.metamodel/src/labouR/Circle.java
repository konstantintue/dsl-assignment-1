/**
 */
package labouR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Circular volume with front and side hold collections. The depth is an integer because the assignment permits negative depth values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labouR.Circle#getRadius <em>Radius</em>}</li>
 *   <li>{@link labouR.Circle#getDepth <em>Depth</em>}</li>
 *   <li>{@link labouR.Circle#getFrontHolds <em>Front Holds</em>}</li>
 *   <li>{@link labouR.Circle#getSideHolds <em>Side Holds</em>}</li>
 * </ul>
 *
 * @see labouR.LabouRPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends Volume {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(int)
	 * @see labouR.LabouRPackage#getCircle_Radius()
	 * @model required="true"
	 * @generated
	 */
	int getRadius();

	/**
	 * Sets the value of the '{@link labouR.Circle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(int value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see labouR.LabouRPackage#getCircle_Depth()
	 * @model required="true"
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link labouR.Circle#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Returns the value of the '<em><b>Front Holds</b></em>' containment reference list.
	 * The list contents are of type {@link labouR.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Holds</em>' containment reference list.
	 * @see labouR.LabouRPackage#getCircle_FrontHolds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getFrontHolds();

	/**
	 * Returns the value of the '<em><b>Side Holds</b></em>' containment reference list.
	 * The list contents are of type {@link labouR.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Holds</em>' containment reference list.
	 * @see labouR.LabouRPackage#getCircle_SideHolds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getSideHolds();

} // Circle
