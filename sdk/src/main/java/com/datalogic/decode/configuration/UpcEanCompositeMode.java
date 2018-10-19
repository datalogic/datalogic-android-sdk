package com.datalogic.decode.configuration;

/**
 * <code>UpcEanCompositeMode</code> is an enumeration defining the type of transmission in use for GS1 Composite labels containing UPC/EAN barcodes.
 * 
 * UPC/EAN barcode is transmitted always as the first part of a GS1 Composite label. The UpcEanCompositeMode class discriminate the recognition of
 * linear UPC/EAN part in a GS1 Composite label.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>AUTO</td>
 * <td>Transmit UPC/EAN labels and then Composite CC-A or Composite CC-B 2D component, if found</td>
 * </tr>
 * <tr>
 * <td>ALWAYS_LINKED</td>
 * <td>Transmit UPC/EAN labels only if close to Composite CC-A or Composite CC-B 2D components</td>
 * </tr>
 * <tr>
 * <td>NEVER_LINKED</td>
 * <td>Transmit only UPC/EAN labels independently from Composite CC-A or Composite CC-B 2D presence</td>
 * </tr>
 * </table>
 */
public enum UpcEanCompositeMode {
    /**
     * Auto recognize the presence of UPC/EAN labels and Composite 2D component. If the 2D component is found, transmit both results as two separate labels
     */
	AUTO,
    /**
     * Force the only transmission of UPC/EAN labels associable with Composite 2D components. If the 2D component is found, transmit both results as two separate labels
     */
	ALWAYS_LINKED,
    /**
     * Transmit the only UPC/EAN part of a GS1 Composite barcode, if found
     */
	NEVER_LINKED;
}
