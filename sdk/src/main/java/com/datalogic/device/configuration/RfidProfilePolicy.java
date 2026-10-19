package com.datalogic.device.configuration;

/**
 * Enum {@code RfidProfilePolicy} defines the RF communication profile
 * used by the RFID reader during inventory and access operations.
 * <p>
 * A profile represents a predefined combination of physical layer
 * parameters such as modulation type, PIE, Tari, link frequency,
 * and encoding scheme, as defined by the EPC Gen2 specification
 * and reader capabilities.
 * <p>
 * Selecting an appropriate profile impacts read range, throughput,
 * robustness, and compatibility with different tag populations.
 * <p>
 * These are the allowed values for the property {@link PropertyID#RFID_PROFILE_POLICY}.
 */
public enum RfidProfilePolicy {

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 2.
     */
    PROFILE_1(1),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_3(3),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: M: 4.
     */
    PROFILE_5(5),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 250 kHz, Encoding: M: 4.
     */
    PROFILE_7(7),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 1.
     */
    PROFILE_11(11),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 15.0 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_12(12),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 160 kHz, Encoding: M: 8.
     */
    PROFILE_13(13),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 4.
     */
    PROFILE_15(15),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 1.
     */
    PROFILE_102(102),

    /**
     * Modulation: DSB, PIE: 1.5, Tari: 6.25 µs, Link Frequency: 640 kHz, Encoding: M: 1.
     */
    PROFILE_103(103),

    /**
     * Modulation: DSB, PIE: 1.5, Tari: 6.25 µs, Link Frequency: 320 kHz, Encoding: M: 1.
     */
    PROFILE_104(104),

    /**
     * Modulation: DSB, PIE: 1.5, Tari: 6.25 µs, Link Frequency: 640 kHz, Encoding: M: 2.
     */
    PROFILE_120(120),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_123(123),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 2.
     */
    PROFILE_124(124),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 15.0 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_125(125),

    /**
     * Modulation: PR_ASK, PIE: 1.5, Tari: 12.5 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_126(126),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: M: 4.
     */
    PROFILE_141(141),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 250 kHz, Encoding: M: 4.
     */
    PROFILE_146(146),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 4.
     */
    PROFILE_147(147),

    /**
     * Modulation: PR_ASK, PIE: 1.5, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 4.
     */
    PROFILE_148(148),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 160 kHz, Encoding: M: 8.
     */
    PROFILE_185(185),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 15.0 µs, Link Frequency: 426 kHz, Encoding: M: 1.
     */
    PROFILE_202(202),

    /**
     * Modulation: PR_ASK, PIE: 1.5, Tari: 12.5 µs, Link Frequency: 426 kHz, Encoding: M: 1.
     */
    PROFILE_203(203),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 50 kHz, Encoding: M: 1.
     */
    PROFILE_205(205),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_222(222),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 15.0 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_223(223),

    /**
     * Modulation: PR_ASK, PIE: 1.5, Tari: 12.5 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_224(224),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 15.0 µs, Link Frequency: 426 kHz, Encoding: M: 2.
     */
    PROFILE_225(225),

    /**
     * Modulation: PR_ASK, PIE: 1.5, Tari: 12.5 µs, Link Frequency: 426 kHz, Encoding: M: 2.
     */
    PROFILE_226(226),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: M: 4.
     */
    PROFILE_241(241),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 250 kHz, Encoding: M: 4.
     */
    PROFILE_244(244),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 160 kHz, Encoding: M: 8.
     */
    PROFILE_285(285),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 1.
     */
    PROFILE_302(302),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 2.
     */
    PROFILE_323(323),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_324(324),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 15.0 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_325(325),

    /**
     * Modulation: PR_ASK, PIE: 1.5, Tari: 12.5 µs, Link Frequency: 320 kHz, Encoding: M: 2.
     */
    PROFILE_326(326),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: M: 4.
     */
    PROFILE_342(342),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 250 kHz, Encoding: M: 4.
     */
    PROFILE_343(343),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 4.
     */
    PROFILE_344(344),

    /**
     * Modulation: PR_ASK, PIE: 1.5, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M: 4.
     */
    PROFILE_345(345),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 160 kHz, Encoding: M: 8.
     */
    PROFILE_382(382),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: PSK2.
     */
    PROFILE_4123(4123),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: BPSK2.
     */
    PROFILE_4124(4124),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: BPSK4.
     */
    PROFILE_4141(4141),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 250 kHz, Encoding: BPSK4.
     */
    PROFILE_4146(4146),

    /**
     * Modulation: PR_ASK, PIE: 1.5, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: BPSK4.
     */
    PROFILE_4148(4148),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 160 kHz, Encoding: BPSK8.
     */
    PROFILE_4185(4185),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: M+B2.
     */
    PROFILE_5123(5123),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M+B2.
     */
    PROFILE_5124(5124),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 320 kHz, Encoding: M+B4.
     */
    PROFILE_5141(5141),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 250 kHz, Encoding: M+B4.
     */
    PROFILE_5146(5146),

    /**
     * Modulation: PR_ASK, PIE: 1.5, Tari: 7.5 µs, Link Frequency: 640 kHz, Encoding: M+B4.
     */
    PROFILE_5148(5148),

    /**
     * Modulation: PR_ASK, PIE: 2.0, Tari: 20.0 µs, Link Frequency: 160 kHz, Encoding: M+B8.
     */
    PROFILE_5185(5185);


    RfidProfilePolicy(int value) {
    }

    /**
     * Retrieves the corresponding RfidProfilePolicy value from a valid integer.
     *
     * @param n <code>int</code>
     * @return RfidProfilePolicy the corresponding one.
     */
    public static RfidProfilePolicy fromOrdinal(int n) {
        return PROFILE_3;
    }

    /**
     * Converts this policy to its corresponding integer value.
     *
     * @return <code>int</code> representing the policy.
     */
    public int toInt() {
        return 0;
    }
}
