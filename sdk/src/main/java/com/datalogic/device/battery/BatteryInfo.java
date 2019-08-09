package com.datalogic.device.battery;

/**
 * The <code>BatteryInfo</code> enumeration is the class that includes the battery info.
 * 
 */
public enum BatteryInfo {
	/**
	 * The percentage of the state of health of the battery. The value type of this property is <code>int</code>.
	 */
	STATE_OF_HEALTH,
	/**
	 * The value of the total amount of discharge current (in 0.1 Ah) caused the charging cycles of the battery. The value type of this property is <code>int</code>.
	 */
	TOTAL_DISCHARGE,
	/**
	 * The instantaneous value of the remaining available capacity of the battery in mAh. The value type of this property is <code>int</code>.
	 */
	CAPACITY_REMAINING,
	/**
	 * Last remembered value of charge in when battery became full/empty in mAh. The value type of this property is <code>int</code>.
	 */
	CAPACITY_FULL,
	/**
	 * The value of the minimum temperature recorded by the battery during its life (in 0.1 °C). The value type of this property is <code>int</code>.
	 */
	TEMPERATURE_MIN,
	/**
	 * The value of the maximum temperature recorded by the battery during its life (in 0.1 °C). The value type of this property is <code>int</code>.
	 */
	TEMPERATURE_MAX,
	/**
	 * The value of the minimum voltage recorded by the battery during its life (in mV). The value type of this property is <code>int</code>.
	 */
	VOLTAGE_MIN,
	/**
	 * The value of the maximum voltage recorded by the battery during its life (in mV). The value type of this property is <code>int</code>.
	 */
	VOLTAGE_MAX,
	/**
	 * The value of the maximum charge current recorded by the battery during its life (in mA). The value type of this property is <code>int</code>.
	 */
	CHARGE_CURRENT_MAX,
	/**
	 * The value of the maximum discharge current recorded by the battery during its life (in mA). The value type of this property is <code>int</code>.
	 */
	DISCHARGE_CURRENT_MAX,
	/**
	 * The estimated time left for battery to be considered empty (in seconds). The value type of this property is <code>int</code>.
	 */
	TIME_TO_EMPTY,
	/**
	 * The capacity by desing of the battery in mAh. The value type of this property is <code>int</code>.
	 */
	FULL_CAPACITY_DESIGN,
	/**
	 * The week of the production of the battery. The value type of this property is <code>int</code>.
	 * This property is not supported by all battery types. The batteries do not support PRODUCTION_WEEK property, they support PRODUCTION_MONTH property.
	 */
	PRODUCTION_WEEK,
	/**
	 * The month of the production of the battery. The value type of this property is <code>int</code>.
	 * This property is not supported by all battery types. The batteries do not support PRODUCTION_MONTH property, they support PRODUCTION_WEEK property.
	 */
	PRODUCTION_MONTH,
	/**
	 * The year of the production of the battery. The value type of this property is <code>int</code>.
	 */
	PRODUCTION_YEAR,
	/**
	 * The battery pack manufacturer name as set internally in the battery pack by the manufacturer. The value type of this property is <code>String</code>.
	 */
	MANUFACTURER,
	/**
	 * The battery serial number as set internally in the battery pack by the manufacturer. The value type of this property is <code>String</code>.
	 */
	SERIAL_NUMBER,
	/**
	 * The battery model name as set internally in the battery pack by the manufacturer. The value type of this property is <code>String</code>.
	 */
	MODEL_NAME,
	/**
	 * The battery technology as set internally in the battery pack by the manufacturer. The value type of this property is <code>String</code>.
	 */
	TECHNOLOGY,
	/**
	 * The battery product number as set internally in the battery pack by the manufacturer. The value type of this property is <code>String</code>.
	 */
	PRODUCT_NUMBER;

	/**
	 * Converts the BatteryInfo to its integer corresponding value.
	 * 
	 * @return int
	 */
	public int toInt() {
		return 0;
	}

	/**
	 * Retrieves the corresponding BatteryInfo value, from a valid integer.
	 * 
	 * @param n
	 *            <code>int</code>
	 * @return BatteryInfo the corresponding one.
	 * */
	public static BatteryInfo fromInt(int n) {
		return null;
	}

	@Override
	public String toString() {
		return null;
	}
}
