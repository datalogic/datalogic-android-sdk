package com.datalogic.decode.configuration;

/**
 * The <code>SnapOcrScanningPolicy</code> is an enumeration defining the scanning
 * policy used when the Snap OCR is enabled.
 *
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>OCR_AND_BARCODE</td>
 * <td>
 * Scans both OCR and barcodes found in the frames.
 * </td>
 * </tr>
 * <tr>
 * <td>OCR_ONLY</td>
 * <td>
 * Only scans for OCR.
 * </td>
 * </tr>
 * <tr>
 * <td>OCR_TRIGGER</td>
 * <td>
 * Only scans for barcodes when using the BARCODE keycode. Only scans for
 * OCR when using the OCR_DECODE keycode.
 * </td>
 * </tr>
 * </table>
 */
public enum SnapOcrScanningPolicy {
    /**
     * Scans both OCR and barcodes found in the frames.
     */
    OCR_AND_BARCODE,

    /**
     * Only scans for OCR.
     */
    OCR_ONLY,

    /**
     * Only scans for barcodes when using the BARCODE keycode. Only scans for
     * OCR when using the OCR_DECODE keycode.
     */
    OCR_TRIGGER;
}
