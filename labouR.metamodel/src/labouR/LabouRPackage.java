/**
 */
package labouR;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * LaBouR metamodel for 2IMP20 DSL Design Assignment 1. The model uses one root BoulderingWall containing volumes and routes. Plain Ecore captures containment, references, multiplicities, and enums; additional well-formedness rules from the assignment, such as exact hold-id format, maximum number of start/end holds, at most one split, and colour compatibility across a route, are documented design constraints rather than OCL constraints.
 * <!-- end-model-doc -->
 * @see labouR.LabouRFactory
 * @model kind="package"
 * @generated
 */
public interface LabouRPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "labouR";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/labouR";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "labouR";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LabouRPackage eINSTANCE = labouR.impl.LabouRPackageImpl.init();

	/**
	 * The meta object id for the '{@link labouR.impl.BoulderingWallImpl <em>Bouldering Wall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.impl.BoulderingWallImpl
	 * @see labouR.impl.LabouRPackageImpl#getBoulderingWall()
	 * @generated
	 */
	int BOULDERING_WALL = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__VOLUMES = 1;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__ROUTES = 2;

	/**
	 * The number of structural features of the '<em>Bouldering Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bouldering Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labouR.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.impl.VolumeImpl
	 * @see labouR.impl.LabouRPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labouR.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.impl.CircleImpl
	 * @see labouR.impl.LabouRPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__IDENTIFIER = VOLUME__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__POSITION = VOLUME__POSITION;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = VOLUME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__DEPTH = VOLUME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Front Holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FRONT_HOLDS = VOLUME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Side Holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__SIDE_HOLDS = VOLUME_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = VOLUME_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = VOLUME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labouR.impl.TriangleImpl <em>Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.impl.TriangleImpl
	 * @see labouR.impl.LabouRPackageImpl#getTriangle()
	 * @generated
	 */
	int TRIANGLE = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__IDENTIFIER = VOLUME__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__POSITION = VOLUME__POSITION;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__DEPTH = VOLUME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corner1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__CORNER1 = VOLUME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Corner2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__CORNER2 = VOLUME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Corner3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__CORNER3 = VOLUME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extrusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__EXTRUSION = VOLUME_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Left Holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__LEFT_HOLDS = VOLUME_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Right Holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__RIGHT_HOLDS = VOLUME_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bottom Holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__BOTTOM_HOLDS = VOLUME_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_FEATURE_COUNT = VOLUME_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_OPERATION_COUNT = VOLUME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labouR.impl.HoldImpl <em>Hold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.impl.HoldImpl
	 * @see labouR.impl.LabouRPackageImpl#getHold()
	 * @generated
	 */
	int HOLD = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__SHAPE = 2;

	/**
	 * The feature id for the '<em><b>Colours</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__COLOURS = 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__ROTATION = 4;

	/**
	 * The number of structural features of the '<em>Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labouR.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.impl.RouteImpl
	 * @see labouR.impl.LabouRPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__GRADE = 1;

	/**
	 * The feature id for the '<em><b>Grid Base Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__GRID_BASE_POINT = 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__STEPS = 3;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labouR.impl.RouteStepImpl <em>Route Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.impl.RouteStepImpl
	 * @see labouR.impl.LabouRPackageImpl#getRouteStep()
	 * @generated
	 */
	int ROUTE_STEP = 6;

	/**
	 * The number of structural features of the '<em>Route Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Route Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labouR.impl.HoldStepImpl <em>Hold Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.impl.HoldStepImpl
	 * @see labouR.impl.LabouRPackageImpl#getHoldStep()
	 * @generated
	 */
	int HOLD_STEP = 7;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_STEP__HOLD = ROUTE_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_STEP__ROLE = ROUTE_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hold Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_STEP_FEATURE_COUNT = ROUTE_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hold Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_STEP_OPERATION_COUNT = ROUTE_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labouR.impl.SplitStepImpl <em>Split Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.impl.SplitStepImpl
	 * @see labouR.impl.LabouRPackageImpl#getSplitStep()
	 * @generated
	 */
	int SPLIT_STEP = 8;

	/**
	 * The feature id for the '<em><b>First Hold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP__FIRST_HOLD = ROUTE_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Hold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP__SECOND_HOLD = ROUTE_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP__FIRST_ROLE = ROUTE_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Second Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP__SECOND_ROLE = ROUTE_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Split Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP_FEATURE_COUNT = ROUTE_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Split Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP_OPERATION_COUNT = ROUTE_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labouR.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.impl.PointImpl
	 * @see labouR.impl.LabouRPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 9;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labouR.Colour <em>Colour</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.Colour
	 * @see labouR.impl.LabouRPackageImpl#getColour()
	 * @generated
	 */
	int COLOUR = 10;

	/**
	 * The meta object id for the '{@link labouR.HoldRole <em>Hold Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labouR.HoldRole
	 * @see labouR.impl.LabouRPackageImpl#getHoldRole()
	 * @generated
	 */
	int HOLD_ROLE = 11;


	/**
	 * Returns the meta object for class '{@link labouR.BoulderingWall <em>Bouldering Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouldering Wall</em>'.
	 * @see labouR.BoulderingWall
	 * @generated
	 */
	EClass getBoulderingWall();

	/**
	 * Returns the meta object for the attribute '{@link labouR.BoulderingWall#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see labouR.BoulderingWall#getIdentifier()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EAttribute getBoulderingWall_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link labouR.BoulderingWall#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see labouR.BoulderingWall#getVolumes()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EReference getBoulderingWall_Volumes();

	/**
	 * Returns the meta object for the containment reference list '{@link labouR.BoulderingWall#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see labouR.BoulderingWall#getRoutes()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EReference getBoulderingWall_Routes();

	/**
	 * Returns the meta object for class '{@link labouR.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see labouR.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Volume#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see labouR.Volume#getIdentifier()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link labouR.Volume#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see labouR.Volume#getPosition()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Position();

	/**
	 * Returns the meta object for class '{@link labouR.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see labouR.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see labouR.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Circle#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see labouR.Circle#getDepth()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Depth();

	/**
	 * Returns the meta object for the containment reference list '{@link labouR.Circle#getFrontHolds <em>Front Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Front Holds</em>'.
	 * @see labouR.Circle#getFrontHolds()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_FrontHolds();

	/**
	 * Returns the meta object for the containment reference list '{@link labouR.Circle#getSideHolds <em>Side Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Side Holds</em>'.
	 * @see labouR.Circle#getSideHolds()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_SideHolds();

	/**
	 * Returns the meta object for class '{@link labouR.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle</em>'.
	 * @see labouR.Triangle
	 * @generated
	 */
	EClass getTriangle();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Triangle#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see labouR.Triangle#getDepth()
	 * @see #getTriangle()
	 * @generated
	 */
	EAttribute getTriangle_Depth();

	/**
	 * Returns the meta object for the containment reference '{@link labouR.Triangle#getCorner1 <em>Corner1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corner1</em>'.
	 * @see labouR.Triangle#getCorner1()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Corner1();

	/**
	 * Returns the meta object for the containment reference '{@link labouR.Triangle#getCorner2 <em>Corner2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corner2</em>'.
	 * @see labouR.Triangle#getCorner2()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Corner2();

	/**
	 * Returns the meta object for the containment reference '{@link labouR.Triangle#getCorner3 <em>Corner3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corner3</em>'.
	 * @see labouR.Triangle#getCorner3()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Corner3();

	/**
	 * Returns the meta object for the containment reference '{@link labouR.Triangle#getExtrusion <em>Extrusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrusion</em>'.
	 * @see labouR.Triangle#getExtrusion()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Extrusion();

	/**
	 * Returns the meta object for the containment reference list '{@link labouR.Triangle#getLeftHolds <em>Left Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Holds</em>'.
	 * @see labouR.Triangle#getLeftHolds()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_LeftHolds();

	/**
	 * Returns the meta object for the containment reference list '{@link labouR.Triangle#getRightHolds <em>Right Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Holds</em>'.
	 * @see labouR.Triangle#getRightHolds()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_RightHolds();

	/**
	 * Returns the meta object for the containment reference list '{@link labouR.Triangle#getBottomHolds <em>Bottom Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bottom Holds</em>'.
	 * @see labouR.Triangle#getBottomHolds()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_BottomHolds();

	/**
	 * Returns the meta object for class '{@link labouR.Hold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hold</em>'.
	 * @see labouR.Hold
	 * @generated
	 */
	EClass getHold();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Hold#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see labouR.Hold#getIdentifier()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link labouR.Hold#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see labouR.Hold#getPosition()
	 * @see #getHold()
	 * @generated
	 */
	EReference getHold_Position();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Hold#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see labouR.Hold#getShape()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Shape();

	/**
	 * Returns the meta object for the attribute list '{@link labouR.Hold#getColours <em>Colours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Colours</em>'.
	 * @see labouR.Hold#getColours()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Colours();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Hold#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see labouR.Hold#getRotation()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Rotation();

	/**
	 * Returns the meta object for class '{@link labouR.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see labouR.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Route#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see labouR.Route#getIdentifier()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Route#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see labouR.Route#getGrade()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Grade();

	/**
	 * Returns the meta object for the containment reference '{@link labouR.Route#getGridBasePoint <em>Grid Base Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid Base Point</em>'.
	 * @see labouR.Route#getGridBasePoint()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_GridBasePoint();

	/**
	 * Returns the meta object for the containment reference list '{@link labouR.Route#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see labouR.Route#getSteps()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Steps();

	/**
	 * Returns the meta object for class '{@link labouR.RouteStep <em>Route Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Step</em>'.
	 * @see labouR.RouteStep
	 * @generated
	 */
	EClass getRouteStep();

	/**
	 * Returns the meta object for class '{@link labouR.HoldStep <em>Hold Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hold Step</em>'.
	 * @see labouR.HoldStep
	 * @generated
	 */
	EClass getHoldStep();

	/**
	 * Returns the meta object for the reference '{@link labouR.HoldStep#getHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hold</em>'.
	 * @see labouR.HoldStep#getHold()
	 * @see #getHoldStep()
	 * @generated
	 */
	EReference getHoldStep_Hold();

	/**
	 * Returns the meta object for the attribute '{@link labouR.HoldStep#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see labouR.HoldStep#getRole()
	 * @see #getHoldStep()
	 * @generated
	 */
	EAttribute getHoldStep_Role();

	/**
	 * Returns the meta object for class '{@link labouR.SplitStep <em>Split Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Step</em>'.
	 * @see labouR.SplitStep
	 * @generated
	 */
	EClass getSplitStep();

	/**
	 * Returns the meta object for the reference '{@link labouR.SplitStep#getFirstHold <em>First Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Hold</em>'.
	 * @see labouR.SplitStep#getFirstHold()
	 * @see #getSplitStep()
	 * @generated
	 */
	EReference getSplitStep_FirstHold();

	/**
	 * Returns the meta object for the reference '{@link labouR.SplitStep#getSecondHold <em>Second Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Hold</em>'.
	 * @see labouR.SplitStep#getSecondHold()
	 * @see #getSplitStep()
	 * @generated
	 */
	EReference getSplitStep_SecondHold();

	/**
	 * Returns the meta object for the attribute '{@link labouR.SplitStep#getFirstRole <em>First Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Role</em>'.
	 * @see labouR.SplitStep#getFirstRole()
	 * @see #getSplitStep()
	 * @generated
	 */
	EAttribute getSplitStep_FirstRole();

	/**
	 * Returns the meta object for the attribute '{@link labouR.SplitStep#getSecondRole <em>Second Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Role</em>'.
	 * @see labouR.SplitStep#getSecondRole()
	 * @see #getSplitStep()
	 * @generated
	 */
	EAttribute getSplitStep_SecondRole();

	/**
	 * Returns the meta object for class '{@link labouR.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see labouR.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see labouR.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link labouR.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see labouR.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for enum '{@link labouR.Colour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colour</em>'.
	 * @see labouR.Colour
	 * @generated
	 */
	EEnum getColour();

	/**
	 * Returns the meta object for enum '{@link labouR.HoldRole <em>Hold Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hold Role</em>'.
	 * @see labouR.HoldRole
	 * @generated
	 */
	EEnum getHoldRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LabouRFactory getLabouRFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link labouR.impl.BoulderingWallImpl <em>Bouldering Wall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.impl.BoulderingWallImpl
		 * @see labouR.impl.LabouRPackageImpl#getBoulderingWall()
		 * @generated
		 */
		EClass BOULDERING_WALL = eINSTANCE.getBoulderingWall();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOULDERING_WALL__IDENTIFIER = eINSTANCE.getBoulderingWall_Identifier();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOULDERING_WALL__VOLUMES = eINSTANCE.getBoulderingWall_Volumes();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOULDERING_WALL__ROUTES = eINSTANCE.getBoulderingWall_Routes();

		/**
		 * The meta object literal for the '{@link labouR.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.impl.VolumeImpl
		 * @see labouR.impl.LabouRPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__IDENTIFIER = eINSTANCE.getVolume_Identifier();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__POSITION = eINSTANCE.getVolume_Position();

		/**
		 * The meta object literal for the '{@link labouR.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.impl.CircleImpl
		 * @see labouR.impl.LabouRPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__DEPTH = eINSTANCE.getCircle_Depth();

		/**
		 * The meta object literal for the '<em><b>Front Holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__FRONT_HOLDS = eINSTANCE.getCircle_FrontHolds();

		/**
		 * The meta object literal for the '<em><b>Side Holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__SIDE_HOLDS = eINSTANCE.getCircle_SideHolds();

		/**
		 * The meta object literal for the '{@link labouR.impl.TriangleImpl <em>Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.impl.TriangleImpl
		 * @see labouR.impl.LabouRPackageImpl#getTriangle()
		 * @generated
		 */
		EClass TRIANGLE = eINSTANCE.getTriangle();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE__DEPTH = eINSTANCE.getTriangle_Depth();

		/**
		 * The meta object literal for the '<em><b>Corner1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__CORNER1 = eINSTANCE.getTriangle_Corner1();

		/**
		 * The meta object literal for the '<em><b>Corner2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__CORNER2 = eINSTANCE.getTriangle_Corner2();

		/**
		 * The meta object literal for the '<em><b>Corner3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__CORNER3 = eINSTANCE.getTriangle_Corner3();

		/**
		 * The meta object literal for the '<em><b>Extrusion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__EXTRUSION = eINSTANCE.getTriangle_Extrusion();

		/**
		 * The meta object literal for the '<em><b>Left Holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__LEFT_HOLDS = eINSTANCE.getTriangle_LeftHolds();

		/**
		 * The meta object literal for the '<em><b>Right Holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__RIGHT_HOLDS = eINSTANCE.getTriangle_RightHolds();

		/**
		 * The meta object literal for the '<em><b>Bottom Holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__BOTTOM_HOLDS = eINSTANCE.getTriangle_BottomHolds();

		/**
		 * The meta object literal for the '{@link labouR.impl.HoldImpl <em>Hold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.impl.HoldImpl
		 * @see labouR.impl.LabouRPackageImpl#getHold()
		 * @generated
		 */
		EClass HOLD = eINSTANCE.getHold();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__IDENTIFIER = eINSTANCE.getHold_Identifier();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOLD__POSITION = eINSTANCE.getHold_Position();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__SHAPE = eINSTANCE.getHold_Shape();

		/**
		 * The meta object literal for the '<em><b>Colours</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__COLOURS = eINSTANCE.getHold_Colours();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__ROTATION = eINSTANCE.getHold_Rotation();

		/**
		 * The meta object literal for the '{@link labouR.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.impl.RouteImpl
		 * @see labouR.impl.LabouRPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__IDENTIFIER = eINSTANCE.getRoute_Identifier();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__GRADE = eINSTANCE.getRoute_Grade();

		/**
		 * The meta object literal for the '<em><b>Grid Base Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__GRID_BASE_POINT = eINSTANCE.getRoute_GridBasePoint();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__STEPS = eINSTANCE.getRoute_Steps();

		/**
		 * The meta object literal for the '{@link labouR.impl.RouteStepImpl <em>Route Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.impl.RouteStepImpl
		 * @see labouR.impl.LabouRPackageImpl#getRouteStep()
		 * @generated
		 */
		EClass ROUTE_STEP = eINSTANCE.getRouteStep();

		/**
		 * The meta object literal for the '{@link labouR.impl.HoldStepImpl <em>Hold Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.impl.HoldStepImpl
		 * @see labouR.impl.LabouRPackageImpl#getHoldStep()
		 * @generated
		 */
		EClass HOLD_STEP = eINSTANCE.getHoldStep();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOLD_STEP__HOLD = eINSTANCE.getHoldStep_Hold();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD_STEP__ROLE = eINSTANCE.getHoldStep_Role();

		/**
		 * The meta object literal for the '{@link labouR.impl.SplitStepImpl <em>Split Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.impl.SplitStepImpl
		 * @see labouR.impl.LabouRPackageImpl#getSplitStep()
		 * @generated
		 */
		EClass SPLIT_STEP = eINSTANCE.getSplitStep();

		/**
		 * The meta object literal for the '<em><b>First Hold</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_STEP__FIRST_HOLD = eINSTANCE.getSplitStep_FirstHold();

		/**
		 * The meta object literal for the '<em><b>Second Hold</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_STEP__SECOND_HOLD = eINSTANCE.getSplitStep_SecondHold();

		/**
		 * The meta object literal for the '<em><b>First Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT_STEP__FIRST_ROLE = eINSTANCE.getSplitStep_FirstRole();

		/**
		 * The meta object literal for the '<em><b>Second Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT_STEP__SECOND_ROLE = eINSTANCE.getSplitStep_SecondRole();

		/**
		 * The meta object literal for the '{@link labouR.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.impl.PointImpl
		 * @see labouR.impl.LabouRPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link labouR.Colour <em>Colour</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.Colour
		 * @see labouR.impl.LabouRPackageImpl#getColour()
		 * @generated
		 */
		EEnum COLOUR = eINSTANCE.getColour();

		/**
		 * The meta object literal for the '{@link labouR.HoldRole <em>Hold Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labouR.HoldRole
		 * @see labouR.impl.LabouRPackageImpl#getHoldRole()
		 * @generated
		 */
		EEnum HOLD_ROLE = eINSTANCE.getHoldRole();

	}

} //LabouRPackage
