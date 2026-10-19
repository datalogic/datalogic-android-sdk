package com.datalogic.os.network;

/**
 * Represents a single DHCP sub-option, as carried by the {@link DhcpOption#suboptions}
 * list of a TLV-encoded DHCP option (notably option {@code 43} – vendor specific information).
 *
 */
public final class SubOption {

    /**
     * The DHCP sub-option code.
     */
    public final int code;

    /**
     * The raw byte value of this sub-option.
     */
    public final byte[] data;

        /** @hide */
    public SubOption() {
        this.code = -1;
        this.data = null;
    }

    /** @hide */
    public SubOption(int code, byte[] data) {
        this.code = code;
        this.data = data;
    }
}
