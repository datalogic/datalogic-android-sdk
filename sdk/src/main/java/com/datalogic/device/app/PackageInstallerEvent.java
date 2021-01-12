package com.datalogic.device.app;


/**
 * Enumerative representing the result event of the action requested to the SDK Package Installer.
 */
public enum PackageInstallerEvent
{
    /**
     * Unknown termination event.
     */
    UNKNOWN_TERMINATED,
    /**
     * Install termination event.
     */
    INSTALL_TERMINATED,
    /**
     * Uninstall termination event.
     */
    UNINSTALL_TERMINATED,
    /**
     * Upgrade termination event.
     */
    UPGRADE_TERMINATED;

}
