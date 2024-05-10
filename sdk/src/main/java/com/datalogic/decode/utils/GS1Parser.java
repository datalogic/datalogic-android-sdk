package com.datalogic.decode.utils;

import java.util.List;
import java.util.Map;

/**
 * Class managing the parsing of GS1 formatted barcodes.
 */
public class GS1Parser {
    /**
     * @hide
     */
    public GS1Parser() {
        super();
    }

    /**
     * Parsing exception thrown in case there is an error during parsing.
     */
    public static class ParsingException extends RuntimeException {
        public ParsingException() {
            super();
        }

        public ParsingException(String message) {
            super(message);
        }
    }

    /**
     * Class representing a single GS1 field, comprised of application identifier and associated value.
     */
    public static class GS1Field {
        /**
         * @hide
         */
        private GS1Field(String applicationIdentifier, String genericApplicationIdentifier, List<String> values) {
        }
        /**
         * Gets the application identifier.
         * @return The application identifier.
         */
        public String getApplicationIdentifier() {
            return null;
        }

        /**
         * Gets the generic application identifier. This is usually equals to the application identifier
         * but it is different for all identifiers that include a decimal point position (application
         * identifier ending with 'n') or a sequence number (application identifier ending with 's').
         * @return The generic application identifier.
         */
        public String getGenericApplicationIdentifier() {
            return null;
        }

        /**
         * Gets the string value for this field.
         * @return The field value as string.
         */
        public String getValue() {
            return null;
        }

        /**
         * Gets the value parsed depending on the specific Application Identifier.
         * If no parsing is available for this field, <code>null</code> is returned.
         * @return The parsed field value.
         */
        public Object getParsedValue() {
            return null;
        }

        /**
         * Gets the data title associated with this GS1 field
         * @return The data title.
         */
        public String getDataTitle() {
            return null;
        }
    }

    /**
     * Executes the parsing of an input string that represents a barcode in GS1 format.
     * @param barcodeText The GS1 formatted string.
     * @return A Map containing as keys the generic application identifiers and as entries
     *         the GS1Field objects containing the parsed values.
     * @throws ParsingException In case of parsing errors.
     */
    public static Map<String, GS1Field> parse(String barcodeText) throws ParsingException {
        return null;
    }

    /**
     * Executes the parsing of an input string that represents an URI in GS1 Digital Link format.
     * @param barcodeUri The GS1 Digital Link URI string.
     * @return A Map containing as keys the generic application identifiers and as entries
     *         the GS1Field objects containing the parsed values.
     * @throws ParsingException In case of parsing errors.
     */
    public static Map<String, GS1Field> parseDigitalLink(String barcodeUri) throws ParsingException {
        return null;
    }
}
