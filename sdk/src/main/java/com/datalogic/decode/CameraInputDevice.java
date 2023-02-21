package com.datalogic.decode;

import java.util.List;

/**
 * Input device representing a Camera. If this is set as the
 * current input device in the BarcodeManager, the frames will be
 * captured from the specified Camera.
 */
public class CameraInputDevice implements InputDevice {
    /**
     * Class representing a preview size.
     */
    public static class PreviewSize {
        public PreviewSize(int width, int height) {
            
        }

        /**
         * Returns the preview width.
         *
         * @return The preview width.
         */
        public int getWidth() {
            return 0;
        }

        /**
         * Returns the preview height.
         *
         * @return The preview height.
         */
        public int getHeight() {
            return 0;
        }
    }

    /**
     * Abstract class representing the display mode to use for the camera preview.
     * The implementing classes will define the behavior to use.
     */
    public static abstract class PreviewDisplayMode {
        /**
         * Type for fit screen display mode.
         */
        public static final int TYPE_FIT_SCREEN = 0;
        /**
         * Type for manual positioning display mode.
         */
        public static final int TYPE_MANUAL_POSITIONING = 1;

        public PreviewDisplayMode(int type) {
            
        }

        /**
         * Returns the type of display mode.
         *
         * @return The type of display mode.
         */
        public int getType() {
            return 0;
        }
    }

    /**
     * Class representing the display mode used to fit the preview to the screen
     * on the shortest size. As parameter it is possible to set the positioning for
     * portrait and landscape.
     */
    public static class FitScreenPreviewDisplayMode extends PreviewDisplayMode {
        public static final int POSITIONING_CENTER = 0;
        public static final int POSITIONING_LEFT = 1;
        public static final int POSITIONING_RIGHT = 2;
        public static final int POSITIONING_TOP = 3;
        public static final int POSITIONING_BOTTOM = 4;

        public FitScreenPreviewDisplayMode(int portraitPositioning, int landscapePositioning) {
            super(PreviewDisplayMode.TYPE_FIT_SCREEN);
        }

        public int getPortraitPositioning() {
            return 0;
        }

        public int getLandscapePositioning() {
            return 0;
        }

        public void setPortraitPositioning(int portraitPositioning) {
            
        }

        public void setLandscapePositioning(int landscapePositioning) {
            
        }
    }

    /**
     * Class representing the display mode used to manually position the preview.
     * As parameter it is possible to set the manual position for portrait and landscape.
     */
    public static class ManualPositioningPreviewDisplayMode extends PreviewDisplayMode {
        public static class ManualPosition {
            public ManualPosition(int x, int y, int width, int height) {
                
            }

            public int getX() {
                return 0;
            }

            public int getY() {
                return 0;
            }

            public int getWidth() {
                return 0;
            }

            public int getHeight() {
                return 0;
            }

            public void setX(int x) {
                
            }

            public void setY(int y) {
                
            }

            public void setWidth(int width) {
                
            }

            public void setHeight(int height) {
                
            }
        }

        public ManualPositioningPreviewDisplayMode(ManualPosition portraitPositioning,
                                                   ManualPosition landscapePositioning) {
            super(PreviewDisplayMode.TYPE_MANUAL_POSITIONING);
        }

        public ManualPosition getPortraitPositioning() {
            return null;
        }

        public ManualPosition getLandscapePositioning() {
            return null;
        }

        public void setPortraitPositioning(ManualPosition portraitPositioning) {
            
        }

        public void setLandscapePositioning(ManualPosition landscapePositioning) {
            
        }
    }

    /**
     * @hide
     */
    public CameraInputDevice(String name, String cameraId,
                             PreviewSize currentPreviewSize,
                             List<PreviewSize> supportedPreviewSizes,
                             int facing, int orientation,
                             PreviewDisplayMode previewDisplayMode) {
        
    }

    @Override
    public Type getType() {
        return Type.CAMERA;
    }

    @Override
    public String getName() {
        return null;
    }

    /**
     * Returns the ID of the camera as seen by the Android system.
     *
     * @return The camera ID.
     */
    public String getCameraId() {
        return null;
    }

    /**
     * Returns the current preview size.
     *
     * @return The current preview size.
     */
    public PreviewSize getCurrentPreviewSize() {
        return null;
    }

    /**
     * Returns the supported preview sizes.
     *
     * @return The supported preview sizes.
     */
    public List<PreviewSize> getSupportedPreviewSizes() {
        return null;
    }

    /**
     * Returns the camera facing as defined by the Android system.
     *
     * @return The camera facing.
     */
    public int getFacing() {
        return 0;
    }

    /**
     * Returns the camera orientation as defined by the Android system.
     *
     * @return The camera orientation.
     */
    public int getOrientation() {
        return 0;
    }

    /**
     * Returns the display mode in use of the preview.
     *
     * @return The preview display mode.
     */
    public PreviewDisplayMode getPreviewDisplayMode() {
        return null;
    }

    /**
     * Sets the current preview size.
     *
     * @param currentPreviewSize
     *         The preview size to set.
     */
    public void setCurrentPreviewSize(PreviewSize currentPreviewSize) {
        
    }

    /**
     * Sets the current display mode of the preview.
     *
     * @param previewDisplayMode
     *         The display mode to set.
     */
    public void setPreviewDisplayMode(PreviewDisplayMode previewDisplayMode) {
        
    }
}
