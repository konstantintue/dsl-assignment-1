/**
 */
package labouR.util;

import labouR.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see labouR.LabouRPackage
 * @generated
 */
public class LabouRAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LabouRPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabouRAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LabouRPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabouRSwitch<Adapter> modelSwitch =
		new LabouRSwitch<Adapter>() {
			@Override
			public Adapter caseBoulderingWall(BoulderingWall object) {
				return createBoulderingWallAdapter();
			}
			@Override
			public Adapter caseVolume(Volume object) {
				return createVolumeAdapter();
			}
			@Override
			public Adapter caseCircle(Circle object) {
				return createCircleAdapter();
			}
			@Override
			public Adapter caseTriangle(Triangle object) {
				return createTriangleAdapter();
			}
			@Override
			public Adapter caseHold(Hold object) {
				return createHoldAdapter();
			}
			@Override
			public Adapter caseRoute(Route object) {
				return createRouteAdapter();
			}
			@Override
			public Adapter caseRouteStep(RouteStep object) {
				return createRouteStepAdapter();
			}
			@Override
			public Adapter caseHoldStep(HoldStep object) {
				return createHoldStepAdapter();
			}
			@Override
			public Adapter caseSplitStep(SplitStep object) {
				return createSplitStepAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link labouR.BoulderingWall <em>Bouldering Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labouR.BoulderingWall
	 * @generated
	 */
	public Adapter createBoulderingWallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labouR.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labouR.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labouR.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labouR.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labouR.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labouR.Triangle
	 * @generated
	 */
	public Adapter createTriangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labouR.Hold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labouR.Hold
	 * @generated
	 */
	public Adapter createHoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labouR.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labouR.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labouR.RouteStep <em>Route Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labouR.RouteStep
	 * @generated
	 */
	public Adapter createRouteStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labouR.HoldStep <em>Hold Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labouR.HoldStep
	 * @generated
	 */
	public Adapter createHoldStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labouR.SplitStep <em>Split Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labouR.SplitStep
	 * @generated
	 */
	public Adapter createSplitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labouR.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labouR.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LabouRAdapterFactory
