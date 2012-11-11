/**
 */
package csvml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comp Operator Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see csvml.CsvmlPackage#getCompOperatorTypes()
 * @model
 * @generated
 */
public enum CompOperatorTypes implements Enumerator {
	/**
	 * The '<em><b>Greater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(0, "Greater", "Greater"),

	/**
	 * The '<em><b>Greater Or Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_OR_EQUALS(1, "GreaterOrEquals", "GreaterOrEquals"),

	/**
	 * The '<em><b>Lower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER(2, "Lower", "Lower"),

	/**
	 * The '<em><b>Lower Or Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_OR_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_OR_EQUALS(3, "LowerOrEquals", "LowerOrEquals"),

	/**
	 * The '<em><b>Unequals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNEQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	UNEQUALS(4, "Unequals", "Unequals"),

	/**
	 * The '<em><b>Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS(5, "Equals", "Equals");

	/**
	 * The '<em><b>Greater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model name="Greater"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 0;

	/**
	 * The '<em><b>Greater Or Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Or Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUALS
	 * @model name="GreaterOrEquals"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_OR_EQUALS_VALUE = 1;

	/**
	 * The '<em><b>Lower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lower</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER
	 * @model name="Lower"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_VALUE = 2;

	/**
	 * The '<em><b>Lower Or Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lower Or Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_OR_EQUALS
	 * @model name="LowerOrEquals"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_OR_EQUALS_VALUE = 3;

	/**
	 * The '<em><b>Unequals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unequals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNEQUALS
	 * @model name="Unequals"
	 * @generated
	 * @ordered
	 */
	public static final int UNEQUALS_VALUE = 4;

	/**
	 * The '<em><b>Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUALS
	 * @model name="Equals"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Comp Operator Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompOperatorTypes[] VALUES_ARRAY =
		new CompOperatorTypes[] {
			GREATER,
			GREATER_OR_EQUALS,
			LOWER,
			LOWER_OR_EQUALS,
			UNEQUALS,
			EQUALS,
		};

	/**
	 * A public read-only list of all the '<em><b>Comp Operator Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompOperatorTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comp Operator Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompOperatorTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompOperatorTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comp Operator Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompOperatorTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompOperatorTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comp Operator Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompOperatorTypes get(int value) {
		switch (value) {
			case GREATER_VALUE: return GREATER;
			case GREATER_OR_EQUALS_VALUE: return GREATER_OR_EQUALS;
			case LOWER_VALUE: return LOWER;
			case LOWER_OR_EQUALS_VALUE: return LOWER_OR_EQUALS;
			case UNEQUALS_VALUE: return UNEQUALS;
			case EQUALS_VALUE: return EQUALS;
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
	private CompOperatorTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //CompOperatorTypes
