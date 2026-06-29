package com.datalogic.decode.configuration;

/**
 * Enum representing the illumination source used by scanning preview when it has been activated
 * by the decoding.
 */
public enum ScanningPreviewIlluminationSource {
    /**
     * Torch.
     */
    TORCH,
    /**
     * Scan Engine.
     */
    SCANENGINE,
    /**
     * Automatic selection based on distance from the object pointed by the scanner.
     */
    AUTO;
}
