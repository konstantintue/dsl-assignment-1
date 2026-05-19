/**
 */
package labouR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hold Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A normal route item that points to one existing hold. The role stores route-local labels such as START_1, START_2, and END.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labouR.HoldStep#getHold <em>Hold</em>}</li>
 *   <li>{@link labouR.HoldStep#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see labouR.LabouRPackage#getHoldStep()
 * @model
 * @generated
 */
public interface HoldStep extends RouteStep {
	/**
	 * Returns the value of the '<em><b>Hold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold</em>' reference.
	 * @see #setHold(Hold)
	 * @see labouR.LabouRPackage#getHoldStep_Hold()
	 * @model required="true"
	 * @generated
	 */
	Hold getHold();

	/**
	 * Sets the value of the '{@link labouR.HoldStep#getHold <em>Hold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' reference.
	 * @see #getHold()
	 * @generated
	 */
	void setHold(Hold value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"NORMAL"</code>.
	 * The literals are from the enumeration {@link labouR.HoldRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see labouR.HoldRole
	 * @see #setRole(HoldRole)
	 * @see labouR.LabouRPackage#getHoldStep_Role()
	 * @model default="NORMAL" required="true"
	 * @generated
	 */
	HoldRole getRole();

	/**
	 * Sets the value of the '{@link labouR.HoldStep#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see labouR.HoldRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(HoldRole value);

} // HoldStep
