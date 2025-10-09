package com.datalogic.decode;

import android.graphics.Bitmap;

import com.datalogic.device.ErrorManager;

/**
 * <code>CameraWedgePreviewManager</code> is a class used to setup a preview that will be shown
 * when the camera wedge feature is running, but only when no barcode is shown. It can be
 * useful in case the user wants to show a custom message or logo.
 */
public class CameraWedgePreviewManager {
    /**
     * @hide
     */
    private CameraWedgePreviewManager() {
        
    }

    /**
     * Gets an instance of the CameraWedgePreviewManager, if it is supported by the platform.
     *
     * @return A CameraWedgePreviewManager object if supported, null otherwise.
     */
    public static CameraWedgePreviewManager getInstance() {
        return null;
    }

    /**
     * Install a preview image to show during camera wedge when no barcode is shown.
     * Performs no scaling of the input image, which will be centered into a 1080x1920 frame.
     *
     * @param path
     *        The path to the file containing the image. In order to be used, the file must be accessible
     *        by the application itself. If the image doesn't fit the 1080x1920 frame,
     *        it will only be centered.
     * @return
     *        DecodeException.SUCCESS in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a DecodeException in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int install(String path) {
        return 0;
    }

    /**
     * Install a preview image to show during camera wedge when no barcode is shown.
     * The input image will be centered into a 1080x1920 frame, applying scaling only
     * if the specified parameter is set to true.
     *
     * @param path
     *        The path to the file containing the image. In order to be used, the file must be accessible
     *        by the application itself.
     * @param scalingEnabled
     *        True if the image should be scaled after being centered into a frame of size 1080x1920.
     *        The scaling will preserve the aspect ratio.
     * @return
     *        DecodeException.SUCCESS in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a DecodeException in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int install(String path, boolean scalingEnabled) {
        return 0;
    }

    /**
     * Install a preview image to show during camera wedge when no barcode is shown.
     * Performs no scaling of the input image, which will be centered into a 1080x1920 frame.
     *
     * @param bmp
     *        The image to install. If the image doesn't fit the 1080x1920 frame, it will only be centered.
     * @return
     *        DecodeException.SUCCESS in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a DecodeException in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int install(Bitmap bmp) {
        return 0;
    }

    /**
     * Install a preview image to show during camera wedge when no barcode is shown.
     * The input image will be centered into a 1080x1920 frame, applying scaling only
     * if the specified parameter is set to true.
     *
     * @param bmp
     *        The image to install.
     * @param scalingEnabled
     *        True if the image should be scaled after being centered into a frame of size 1080x1920.
     *        The scaling will preserve the aspect ratio.
     * @return
     *        DecodeException.SUCCESS in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a DecodeException in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int install(Bitmap bmp, boolean scalingEnabled) {
        return 0;
    }

    /**
     * Gets the installed camera wedge preview image.
     * @return The camera wedge preview image if found, null otherwise or in case of error if the exceptions are disabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public Bitmap getInstalled() {
        return null;
    }

    /**
     * Remove the camera wedge preview image previously installed, if found.
     *
     * @return
     *        DecodeException.SUCCESS in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a DecodeException in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int remove() {
        return 0;
    }
}
