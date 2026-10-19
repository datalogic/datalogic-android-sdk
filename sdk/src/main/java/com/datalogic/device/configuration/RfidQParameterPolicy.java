package com.datalogic.device.configuration;

/**
 * Enum {@code RfidQParameterPolicy} defines the policy used to set
 * the Q parameter during RFID inventory operations.
 * <p>
 * The Q parameter controls the number of available reply slots
 * (2^Q) used by tags when responding to an inventory round.
 * <p>
 * Choosing an appropriate Q value reduces collisions and improves
 * inventory performance based on the estimated tag population.
 * <p>
 * These are the allowed values for the property {@link PropertyID#RFID_Q_PARAMETER_POLICY}.
 */
public enum RfidQParameterPolicy {

    /**
     * Q=0: Estimated number of tags: 1.
     * Every tag immediately answers to the reader’s request, leading to potential collisions if multiple tags are present in the radio range.
     */
    Q_0(0),

    /**
     * Q=1: Estimated number of tags: 2.
     * The reader sends the Q parameter to the tags to define the number of slots (2^Q) in which the tags should respond, reducing collisions.
     */
    Q_1(1),

    /**
     * Q=2: Estimated number of tags: 3-6.
     * The reader sends the Q parameter to the tags to define the number of slots (2^Q) in which the tags should respond, reducing collisions.
     */
    Q_2(2),

    /**
     * Q=3: Estimated number of tags: 7-15.
     * The reader sends the Q parameter to the tags to define the number of slots (2^Q) in which the tags should respond, reducing collisions.
     */
    Q_3(3),

    /**
     * Q=4: Estimated number of tags: 16-30.
     * The reader sends the Q parameter to the tags to define the number of slots (2^Q) in which the tags should respond, reducing collisions.
     */
    Q_4(4),

    /**
     * Q=5: Estimated number of tags: 31-50.
     * The reader sends the Q parameter to the tags to define the number of slots (2^Q) in which the tags should respond, reducing collisions.
     */
    Q_5(5),

    /**
     * Q=6: Estimated number of tags: 51-100.
     * The reader sends the Q parameter to the tags to define the number of slots (2^Q) in which the tags should respond, reducing collisions.
     */
    Q_6(6),

    /**
     * Q=7: Estimated number of tags: 101-200.
     * The reader sends the Q parameter to the tags to define the number of slots (2^Q) in which the tags should respond, reducing collisions.
     */
    Q_7(7);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final RfidQParameterPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    RfidQParameterPolicy(int value) {
        this.value = value;
    }

    /**
     * Converts a RfidQParameterPolicy to its corresponding integer value.
     *
     * @return int
     * */
    public int toInt(){
        return 0;
    }

    /**
     * Retrieves the corresponding DesktopModePolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return RfidQParameterPolicy the corresponding one.
     * */
    public static RfidQParameterPolicy fromInt(int n) {
        return Q_0;
    }

}
