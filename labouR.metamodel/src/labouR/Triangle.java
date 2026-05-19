/**
 */
package labouR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Triangular volume with three corners, an extrusion point, and left/right/bottom hold collections, matching the named parts in the assignment language.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labouR.Triangle#getDepth <em>Depth</em>}</li>
 *   <li>{@link labouR.Triangle#getCorner1 <em>Corner1</em>}</li>
 *   <li>{@link labouR.Triangle#getCorner2 <em>Corner2</em>}</li>
 *   <li>{@link labouR.Triangle#getCorner3 <em>Corner3</em>}</li>
 *   <li>{@link labouR.Triangle#getExtrusion <em>Extrusion</em>}</li>
 *   <li>{@link labouR.Triangle#getLeftHolds <em>Left Holds</em>}</li>
 *   <li>{@link labouR.Triangle#getRightHolds <em>Right Holds</em>}</li>
 *   <li>{@link labouR.Triangle#getBottomHolds <em>Bottom Holds</em>}</li>
 * </ul>
 *
 * @see labouR.LabouRPackage#getTriangle()
 * @model
 * @generated
 */
public interface Triangle extends Volume {
	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see labouR.LabouRPackage#getTriangle_Depth()
	 * @model required="true"
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link labouR.Triangle#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Returns the value of the '<em><b>Corner1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner1</em>' containment reference.
	 * @see #setCorner1(Point)
	 * @see labouR.LabouRPackage#getTriangle_Corner1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getCorner1();

	/**
	 * Sets the value of the '{@link labouR.Triangle#getCorner1 <em>Corner1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner1</em>' containment reference.
	 * @see #getCorner1()
	 * @generated
	 */
	void setCorner1(Point value);

	/**
	 * Returns the value of the '<em><b>Corner2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner2</em>' containment reference.
	 * @see #setCorner2(Point)
	 * @see labouR.LabouRPackage#getTriangle_Corner2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getCorner2();

	/**
	 * Sets the value of the '{@link labouR.Triangle#getCorner2 <em>Corner2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner2</em>' containment reference.
	 * @see #getCorner2()
	 * @generated
	 */
	void setCorner2(Point value);

	/**
	 * Returns the value of the '<em><b>Corner3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner3</em>' containment reference.
	 * @see #setCorner3(Point)
	 * @see labouR.LabouRPackage#getTriangle_Corner3()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getCorner3();

	/**
	 * Sets the value of the '{@link labouR.Triangle#getCorner3 <em>Corner3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner3</em>' containment reference.
	 * @see #getCorner3()
	 * @generated
	 */
	void setCorner3(Point value);

	/**
	 * Returns the value of the '<em><b>Extrusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion</em>' containment reference.
	 * @see #setExtrusion(Point)
	 * @see labouR.LabouRPackage#getTriangle_Extrusion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getExtrusion();

	/**
	 * Sets the value of the '{@link labouR.Triangle#getExtrusion <em>Extrusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion</em>' containment reference.
	 * @see #getExtrusion()
	 * @generated
	 */
	void setExtrusion(Point value);

	/**
	 * Returns the value of the '<em><b>Left Holds</b></em>' containment reference list.
	 * The list contents are of type {@link labouR.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Holds</em>' containment reference list.
	 * @see labouR.LabouRPackage#getTriangle_LeftHolds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getLeftHolds();

	/**
	 * Returns the value of the '<em><b>Right Holds</b></em>' containment reference list.
	 * The list contents are of type {@link labouR.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Holds</em>' containment reference list.
	 * @see labouR.LabouRPackage#getTriangle_RightHolds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getRightHolds();

	/**
	 * Returns the value of the '<em><b>Bottom Holds</b></em>' containment reference list.
	 * The list contents are of type {@link labouR.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Holds</em>' containment reference list.
	 * @see labouR.LabouRPackage#getTriangle_BottomHolds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getBottomHolds();

} // Triangle
