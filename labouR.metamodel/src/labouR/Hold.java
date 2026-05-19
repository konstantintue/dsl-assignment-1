/**
 */
package labouR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Physical climbing hold. Route-specific labels such as start and end are deliberately modeled on route steps instead of here, because the same physical hold can be referenced by multiple routes with different roles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labouR.Hold#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link labouR.Hold#getPosition <em>Position</em>}</li>
 *   <li>{@link labouR.Hold#getShape <em>Shape</em>}</li>
 *   <li>{@link labouR.Hold#getColours <em>Colours</em>}</li>
 *   <li>{@link labouR.Hold#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @see labouR.LabouRPackage#getHold()
 * @model
 * @generated
 */
public interface Hold extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see labouR.LabouRPackage#getHold_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link labouR.Hold#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Point)
	 * @see labouR.LabouRPackage#getHold_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link labouR.Hold#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see #setShape(String)
	 * @see labouR.LabouRPackage#getHold_Shape()
	 * @model required="true"
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '{@link labouR.Hold#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(String value);

	/**
	 * Returns the value of the '<em><b>Colours</b></em>' attribute list.
	 * The list contents are of type {@link labouR.Colour}.
	 * The literals are from the enumeration {@link labouR.Colour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colours</em>' attribute list.
	 * @see labouR.Colour
	 * @see labouR.LabouRPackage#getHold_Colours()
	 * @model required="true"
	 * @generated
	 */
	EList<Colour> getColours();

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(Integer)
	 * @see labouR.LabouRPackage#getHold_Rotation()
	 * @model
	 * @generated
	 */
	Integer getRotation();

	/**
	 * Sets the value of the '{@link labouR.Hold#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(Integer value);

} // Hold
