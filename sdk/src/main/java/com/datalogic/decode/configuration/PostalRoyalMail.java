package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>PostalRoyalMail</code> is the class that configures the Postal Royal
 * Mail.
 */
public class PostalRoyalMail extends SymbologyBase {

	/**
	 * <code>sendChecksum</code> includes the Royal Mail checksum in the label
	 * transmission.
	 */
	public BooleanProperty sendChecksum;

	/**
	 * This is the constructor of PostalRoyalMail. All symbology options are
	 * initialized by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public PostalRoyalMail(PropertyGetter editor) {
	}
}
