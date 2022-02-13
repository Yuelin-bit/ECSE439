/**
 */
package ca.mcgill.emf.examples.hal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorType()
 * @model
 * @generated
 */
public enum SensorType implements Enumerator {
	/**
	 * The '<em><b>Temperature Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE_SENSOR(0, "TemperatureSensor", "TemperatureSensor"), /**
	 * The '<em><b>Movement Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT_SENSOR(1, "MovementSensor", "MovementSensor"), /**
	 * The '<em><b>Light Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_SENSOR(2, "LightSensor", "LightSensor");

	/**
	 * The '<em><b>Temperature Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_SENSOR
	 * @model name="TemperatureSensor"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_SENSOR_VALUE = 0;

	/**
	 * The '<em><b>Movement Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_SENSOR
	 * @model name="MovementSensor"
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_SENSOR_VALUE = 1;

	/**
	 * The '<em><b>Light Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_SENSOR
	 * @model name="LightSensor"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_SENSOR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorType[] VALUES_ARRAY =
		new SensorType[] {
			TEMPERATURE_SENSOR,
			MOVEMENT_SENSOR,
			LIGHT_SENSOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(int value) {
		switch (value) {
			case TEMPERATURE_SENSOR_VALUE: return TEMPERATURE_SENSOR;
			case MOVEMENT_SENSOR_VALUE: return MOVEMENT_SENSOR;
			case LIGHT_SENSOR_VALUE: return LIGHT_SENSOR;
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
	private SensorType(int value, String name, String literal) {
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
	
} //SensorType
