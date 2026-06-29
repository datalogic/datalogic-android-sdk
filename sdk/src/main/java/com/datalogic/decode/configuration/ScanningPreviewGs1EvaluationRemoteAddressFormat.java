package com.datalogic.decode.configuration;

/**
 * Enum representing the format used to complete the remote address for the request of
 * a specific item.
 */
public enum ScanningPreviewGs1EvaluationRemoteAddressFormat {
    /**
     * Specify the GTIN in the query part of the URI (for example: www.example.org/?gtin=VALUE).
     */
    GTIN_INSIDE_QUERY,
    /**
     * Specify the GTIN in the path part of the URI (for example: www.example.org/gtin/VALUE).
     */
    GTIN_INSIDE_PATH;
}
