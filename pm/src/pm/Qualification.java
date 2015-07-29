/**
 */
package pm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Qualification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pm.PmPackage#getQualification()
 * @model
 * @generated
 */
public enum Qualification implements Enumerator {
	/**
	 * The '<em><b>Novice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOVICE_VALUE
	 * @generated
	 * @ordered
	 */
	NOVICE(0, "novice", "novice"),

	/**
	 * The '<em><b>Programmer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAMMER_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRAMMER(1, "programmer", "programmer"),

	/**
	 * The '<em><b>Lead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAD_VALUE
	 * @generated
	 * @ordered
	 */
	LEAD(2, "lead", "lead");

	/**
	 * The '<em><b>Novice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Novice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOVICE
	 * @model name="novice"
	 * @generated
	 * @ordered
	 */
	public static final int NOVICE_VALUE = 0;

	/**
	 * The '<em><b>Programmer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Programmer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROGRAMMER
	 * @model name="programmer"
	 * @generated
	 * @ordered
	 */
	public static final int PROGRAMMER_VALUE = 1;

	/**
	 * The '<em><b>Lead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAD
	 * @model name="lead"
	 * @generated
	 * @ordered
	 */
	public static final int LEAD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Qualification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Qualification[] VALUES_ARRAY =
		new Qualification[] {
			NOVICE,
			PROGRAMMER,
			LEAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Qualification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Qualification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Qualification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Qualification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Qualification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qualification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Qualification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Qualification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qualification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Qualification get(int value) {
		switch (value) {
			case NOVICE_VALUE: return NOVICE;
			case PROGRAMMER_VALUE: return PROGRAMMER;
			case LEAD_VALUE: return LEAD;
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
	private Qualification(int value, String name, String literal) {
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
	
} //Qualification
