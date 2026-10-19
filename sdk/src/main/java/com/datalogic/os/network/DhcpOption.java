package com.datalogic.os.network;

import java.util.List;

/**
 * Represents a single DHCP option received in a DHCP ACK packet.
 *
 * <p>A DHCP option consists of a numeric {@link #code} that identifies the option type,
 * and a value encoded as raw bytes in {@link #data}. Some options (notably option {@code 43}
 * – vendor specific information) carry a nested TLV-encoded list of sub-options; in that
 * case {@link #suboptions} is populated with the parsed list.</p>
 *
 */
public class DhcpOption {

    /**
     * The DHCP option code as defined in RFC 2132.
     * Common values include:
     * <ul>
     *   <li>{@code 1}  – Subnet Mask</li>
     *   <li>{@code 3}  – Router</li>
     *   <li>{@code 6}  – DNS Server</li>
     *   <li>{@code 43} – Vendor Specific Information</li>
     *   <li>{@code 51} – IP Address Lease Time</li>
     *   <li>{@code 54} – DHCP Server Identifier</li>
     * </ul>
     */
    public final int code;

    /**
     * The raw byte value of this option as received in the DHCP packet.
     * Always populated, even when {@link #suboptions} is present.
     */
    public final byte[] data;

    /**
     * Parsed sub-options, or {@code null} if this option does not carry a
     * TLV-encoded sub-option list.
     * <p>
     * When non-null, each entry is a {@link SubOption} with its own {@code code}
     * and {@code data}. Sub-options do not have further nesting.
     * </p>
     *
     * @see #hasSuboptions()
     */
    public final List<SubOption> suboptions;

    /** 
     * @hide
     */
    public DhcpOption() {
        this.code = -1;
        this.data = null;
        this.suboptions = null;
    }

    /**
     * @hide
     */
    public DhcpOption(int code, byte[] data) {
        this.code = code;
        this.data = data;
        this.suboptions = null;
    }

    /**
     * @hide
     */
    public DhcpOption(int code, byte[] data, List<SubOption> suboptions) {
        this.code = code;
        this.data = data;
        this.suboptions = suboptions;
    }

    /**
     * Returns {@code true} if this option contains a parsed sub-option list.
     * <p>
     * When {@code true}, iterate over {@link #suboptions} to access individual
     * sub-options. When {@code false}, read the raw value from {@link #data}.
     * </p>
     */
    public boolean hasSuboptions() {
        return suboptions != null && !suboptions.isEmpty();
    }

}
