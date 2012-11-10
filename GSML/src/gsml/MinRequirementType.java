/**
 */
package gsml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Min Requirement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gsml.GsmlPackage#getMinRequirementType()
 * @model
 * @generated
 */
public enum MinRequirementType implements Enumerator {
	/**
	 * The '<em><b>Absolute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ABSOLUTE(0, "Absolute", "Absolute"),

	/**
	 * The '<em><b>Relative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE(1, "Relative", "Relative");

	/**
	 * The '<em><b>Absolute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Absolute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE
	 * @model name="Absolute"
	 * @generated
	 * @ordered
	 */
	public static final int ABSOLUTE_VALUE = 0;

	/**
	 * The '<em><b>Relative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIVE
	 * @model name="Relative"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Min Requirement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MinRequirementType[] VALUES_ARRAY =
		new MinRequirementType[] {
			ABSOLUTE,
			RELATIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Min Requirement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MinRequirementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Min Requirement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MinRequirementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MinRequirementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Min Requirement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MinRequirementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MinRequirementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Min Requirement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MinRequirementType get(int value) {
		switch (value) {
			case ABSOLUTE_VALUE: return ABSOLUTE;
			case RELATIVE_VALUE: return RELATIVE;
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
	private MinRequirementType(int value, String name, String literal) {
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
	
} //MinRequirementType
