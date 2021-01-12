package com.datalogic.device.app;


    /**
     * <code>PackageInstallerResult</code> is the base element of the List passed by
     * {@link PackageInstallerListener#onResult} to retrieve the result of
     * operations of install/uninstall/upgrade.
     *
     */
	public class PackageInstallerResult {
		/**
		 * <code>event</code> type of the event, value from {@link PackageInstallerEvent}.
         */
		public PackageInstallerEvent event;

		/**
		 * <code>data</code> application to be installed/upgraded/uninstalled.
         *                   For install and upgrade is full path of the .apk.
         *                   For uninstall is the name of the component.
	     */
		public String data;

		/**
		 * <code>result</code> result of the command, value matching one of the {@link PackageInstallerException} error constants.
         */
		public int result;
	}
