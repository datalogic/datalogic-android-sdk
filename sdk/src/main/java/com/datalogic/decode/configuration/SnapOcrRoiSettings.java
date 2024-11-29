package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

import java.util.List;

/**
 * Class defining the ROI settings used in Snap OCR when the first selection mode is
 * set to ROI_PROPOSE or ROI_SEND.
 */
public class SnapOcrRoiSettings extends SerializableBlob
{
    /**
     * The reference ROI inside of which, all the ROIs are defined.
     */
    public static class ReferenceRoi {
        /**
         * Default constructor.
         *
         * @param width Reference ROI width (in pixels).
         * @param height Reference ROI height (in pixels).
         */
        public ReferenceRoi(int width, int height) {
            
        }

        /**
         * Gets the configured Reference ROI width.
         * @return The Reference ROI width.
         */
        public int getWidth() {
            return 0;
        }

        /**
         * Sets the desired Reference ROI width.
         * @param width The desired Reference ROI width.
         */
        public void setWidth(int width) {

        }

        /**
         * Gets the configured Reference ROI height.
         * @return The Reference ROI height.
         */
        public int getHeight() {
            return 0;
        }

        /**
         * Sets the desired Reference ROI height.
         * @param height The desired Reference ROI height.
         */
        public void setHeight(int height) {

        }
    }

    /**
     * A single ROI inside of the reference ROI. This ROI is used the specify a portion of the frame
     * inside of which the OCR text is decoded.
     */
    public static class InternalRoi {
        /**
         * Default constructor.
         *
         * @param percentageX X position of this internal ROI. This is
         *                    expressed in percentage of the reference ROI width.
         * @param percentageY Y position of this internal ROI. This is
         *                    expressed in percentage of the reference ROI height.
         * @param percentageWidth Width of this internal ROI. This is
         *                        expressed in percentage of the reference ROI width.
         * @param percentageHeight Height of this internal ROI. This is
         *                         expressed in percentage of the reference ROI height.
         * @param regexFilter Regular expression to filter the result of this ROI.
         */
        public InternalRoi(int percentageX, int percentageY,
                           int percentageWidth, int percentageHeight,
                           String regexFilter) {
            
        }

        /**
         * Gets the configured X position.
         * @return The X position in percentage of the Reference ROI width.
         */
        public int getPercentageX() {
            return 0;
        }

        /**
         * Sets the desired X position.
         * @param percentageX The desired X position in percentage of the Reference ROI width.
         */
        public void setPercentageX(int percentageX) {

        }

        /**
         * Gets the configured Y position.
         * @return The Y position in percentage of the Reference ROI height.
         */
        public int getPercentageY() {
            return 0;
        }

        /**
         * Sets the desired Y position.
         * @param percentageY The desired Y position in percentage of the Reference ROI height.
         */
        public void setPercentageY(int percentageY) {

        }

        /**
         * Gets the configured width.
         * @return The width in percentage of the Reference ROI width.
         */
        public int getPercentageWidth() {
            return 0;
        }

        /**
         * Sets the desired width.
         * @param percentageWidth The desired width in percentage of the Reference ROI width.
         */
        public void setPercentageWidth(int percentageWidth) {

        }

        /**
         * Gets the configured height.
         * @return The height in percentage of the Reference ROI height.
         */
        public int getPercentageHeight() {
            return 0;
        }

        /**
         * Sets the desired height.
         * @param percentageHeight The desired height in percentage of the Reference ROI height.
         */
        public void setPercentageHeight(int percentageHeight) {

        }

        /**
         * Gets the configured regular expression for filtering.
         * @return The regular expression used to filter the OCR result inside this ROI.
         */
        public String getRegexFilter() {
            return null;
        }

        /**
         * Sets the desired regular expression for filtering.
         * @param regexFilter The desired regular expression used to filter the OCR result inside this ROI.
         */
        public void setRegexFilter(String regexFilter) {

        }
    }

    /**
     * Default constructor.
     *
     * @param referenceRoi The reference ROI to use.
     * @param internalRois A list of ROIs inside the reference ROI.
     */
    public SnapOcrRoiSettings(ReferenceRoi referenceRoi, List<InternalRoi> internalRois) {
        
    }

    /**
     * Gets the configured Reference ROI.
     * @return The Reference ROI.
     */
    public ReferenceRoi getReferenceRoi() {
        return null;
    }

    /**
     * Sets the desired Reference ROI.
     * @param referenceRoi The desired Reference ROI.
     */
    public void setReferenceRoi(ReferenceRoi referenceRoi) {

    }

    /**
     * Gets the configured internal ROIs.
     * @return The internal ROIs.
     */
    public List<InternalRoi> getInternalRois() {
        return null;
    }

    /**
     * Sets the desired internal ROIs.
     * @param internalRois The desired internal ROIs.
     */
    public void setInternalRois(List<InternalRoi> internalRois) {

    }
}
