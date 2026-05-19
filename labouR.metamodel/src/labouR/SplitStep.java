/**
 */
package labouR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A split in the route into two alternative sub-route holds at the same position in the ordered list. A later HoldStep can represent an implicit merge. Constraints such as at most one split or no split after a merge are semantic well-formedness rules not encoded in plain Ecore.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labouR.SplitStep#getFirstHold <em>First Hold</em>}</li>
 *   <li>{@link labouR.SplitStep#getSecondHold <em>Second Hold</em>}</li>
 *   <li>{@link labouR.SplitStep#getFirstRole <em>First Role</em>}</li>
 *   <li>{@link labouR.SplitStep#getSecondRole <em>Second Role</em>}</li>
 * </ul>
 *
 * @see labouR.LabouRPackage#getSplitStep()
 * @model
 * @generated
 */
public interface SplitStep extends RouteStep {
	/**
	 * Returns the value of the '<em><b>First Hold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Hold</em>' reference.
	 * @see #setFirstHold(Hold)
	 * @see labouR.LabouRPackage#getSplitStep_FirstHold()
	 * @model required="true"
	 * @generated
	 */
	Hold getFirstHold();

	/**
	 * Sets the value of the '{@link labouR.SplitStep#getFirstHold <em>First Hold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Hold</em>' reference.
	 * @see #getFirstHold()
	 * @generated
	 */
	void setFirstHold(Hold value);

	/**
	 * Returns the value of the '<em><b>Second Hold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Hold</em>' reference.
	 * @see #setSecondHold(Hold)
	 * @see labouR.LabouRPackage#getSplitStep_SecondHold()
	 * @model required="true"
	 * @generated
	 */
	Hold getSecondHold();

	/**
	 * Sets the value of the '{@link labouR.SplitStep#getSecondHold <em>Second Hold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Hold</em>' reference.
	 * @see #getSecondHold()
	 * @generated
	 */
	void setSecondHold(Hold value);

	/**
	 * Returns the value of the '<em><b>First Role</b></em>' attribute.
	 * The default value is <code>"NORMAL"</code>.
	 * The literals are from the enumeration {@link labouR.HoldRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Role</em>' attribute.
	 * @see labouR.HoldRole
	 * @see #setFirstRole(HoldRole)
	 * @see labouR.LabouRPackage#getSplitStep_FirstRole()
	 * @model default="NORMAL" required="true"
	 * @generated
	 */
	HoldRole getFirstRole();

	/**
	 * Sets the value of the '{@link labouR.SplitStep#getFirstRole <em>First Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Role</em>' attribute.
	 * @see labouR.HoldRole
	 * @see #getFirstRole()
	 * @generated
	 */
	void setFirstRole(HoldRole value);

	/**
	 * Returns the value of the '<em><b>Second Role</b></em>' attribute.
	 * The default value is <code>"NORMAL"</code>.
	 * The literals are from the enumeration {@link labouR.HoldRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Role</em>' attribute.
	 * @see labouR.HoldRole
	 * @see #setSecondRole(HoldRole)
	 * @see labouR.LabouRPackage#getSplitStep_SecondRole()
	 * @model default="NORMAL" required="true"
	 * @generated
	 */
	HoldRole getSecondRole();

	/**
	 * Sets the value of the '{@link labouR.SplitStep#getSecondRole <em>Second Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Role</em>' attribute.
	 * @see labouR.HoldRole
	 * @see #getSecondRole()
	 * @generated
	 */
	void setSecondRole(HoldRole value);

} // SplitStep
