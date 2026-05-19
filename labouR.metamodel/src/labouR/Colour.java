/**
 */
package labouR;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Colour</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Hold colours listed in the assignment specification.
 * <!-- end-model-doc -->
 * @see labouR.LabouRPackage#getColour()
 * @model
 * @generated
 */
public enum Colour implements Enumerator {
	/**
	 * The '<em><b>WHITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(0, "WHITE", "WHITE"),

	/**
	 * The '<em><b>YELLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	YELLOW(1, "YELLOW", "YELLOW"),

	/**
	 * The '<em><b>GREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(2, "GREEN", "GREEN"),

	/**
	 * The '<em><b>BLUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(3, "BLUE", "BLUE"),

	/**
	 * The '<em><b>RED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(4, "RED", "RED"),

	/**
	 * The '<em><b>PURPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PURPLE(5, "PURPLE", "PURPLE"),

	/**
	 * The '<em><b>PINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINK_VALUE
	 * @generated
	 * @ordered
	 */
	PINK(6, "PINK", "PINK"),

	/**
	 * The '<em><b>BLACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(7, "BLACK", "BLACK"),

	/**
	 * The '<em><b>ORANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORANGE(8, "ORANGE", "ORANGE");

	/**
	 * The '<em><b>WHITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 0;

	/**
	 * The '<em><b>YELLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_VALUE = 1;

	/**
	 * The '<em><b>GREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 2;

	/**
	 * The '<em><b>BLUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 3;

	/**
	 * The '<em><b>RED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 4;

	/**
	 * The '<em><b>PURPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PURPLE_VALUE = 5;

	/**
	 * The '<em><b>PINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PINK_VALUE = 6;

	/**
	 * The '<em><b>BLACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 7;

	/**
	 * The '<em><b>ORANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORANGE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Colour</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Colour[] VALUES_ARRAY =
		new Colour[] {
			WHITE,
			YELLOW,
			GREEN,
			BLUE,
			RED,
			PURPLE,
			PINK,
			BLACK,
			ORANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Colour</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Colour> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Colour</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Colour get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Colour result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colour</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Colour getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Colour result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colour</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Colour get(int value) {
		switch (value) {
			case WHITE_VALUE: return WHITE;
			case YELLOW_VALUE: return YELLOW;
			case GREEN_VALUE: return GREEN;
			case BLUE_VALUE: return BLUE;
			case RED_VALUE: return RED;
			case PURPLE_VALUE: return PURPLE;
			case PINK_VALUE: return PINK;
			case BLACK_VALUE: return BLACK;
			case ORANGE_VALUE: return ORANGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Colour(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Colour
