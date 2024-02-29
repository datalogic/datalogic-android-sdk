package com.datalogic.device.app;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import com.datalogic.device.ErrorManager;

/**
 * <code>PackageInstaller</code> gives developers the ability to install, uninstall and
 * upgrade applications in unattended/silent mode.
 * The install/uninstall/upgrade/selfUpgrade methods are asynchronous. An object that implements PackageInstallerListener
 * must be passed to PackageInstaller to be able to handle the result. <br>
 * An install/uninstall/upgrade method can be executed alone calling the corresponding method of the PackageInstaller
 * or together with other methods grouped in a PackageInstallerSession. In the former case there will be a result callback for each method,
 * in the latter case there will be only one callback listing the results of each method. The methods grouped in a PackageInstallerSession
 * are executed in best effort.
 * <p>
 * To install an application do the following steps:
 * </p>
 * <ol>
 * <li>Obtain an instance of PackageInstaller with {@link #PackageInstaller}.
 * <li>Obtain an instance of {@link PackageInstallerListener} that will be used to handle the
 * result of the command. This object must be passed as parameter to
 * the install method.
 * <li>To perform the install session call {@link #install}. The method onResult of the
 * listener will be called when the install session has completely
 * finished, either with success or failure.
 * </ol>
 * <p>
 * To uninstall an application do the following steps:
 * </p>
 * <ol>
 * <li>Obtain an instance of PackageInstaller with {@link #PackageInstaller}.
 * <li>Obtain an instance of {@link PackageInstallerListener} that will be used to handle the
 * result of the command. This object must be passed as parameter to the uninstall method.
 * <li>To perform the uninstall session call {@link #uninstall}. The method onResult
 * of the listener will be called when the uninstall session has completely
 * finished, either with success or failure.
 * </ol>
 * <p>
 * To upgrade an application do the following steps:
 * </p>
 * <ol>
 * <li>Obtain an instance of PackageInstaller with {@link #PackageInstaller}.
 * <li>Obtain an instance of {@link PackageInstallerListener} that will be used to handle the
 * result of the command. This object must be passed as parameter to the upgrade method.
 * <li>To perform the upgrade session call {@link #upgrade}. The method onResult
 * of the listener will be called when the upgrade session has completely
 * finished, either with success or failure.
 * </ol>
 * <p>
 * To execute more install/uninstall/upgrade methods and be notified of the results when all the methods have completed, do the following steps:
 * </p>
 * <ol>
 * <li>Obtain an instance of PackageInstaller with {@link #PackageInstaller}.
 * <li>Obtain an instance of {@link PackageInstallerListener} that will be used to handle the
 * result of the commands. This object must be passed as parameter to the createSession method.
 * <li>Obtain an instance of {@link PackageInstallerSession} with {@link #createSession}.
 * <li>Open a transaction on the session calling {@link PackageInstallerSession#openSession}.
 * <li>Call the methods {@link PackageInstallerSession#install}, {@link PackageInstallerSession#uninstall}, {@link PackageInstallerSession#upgrade} that
 * suite you.
 * <li>Close and commit the transaction on the session calling {@link PackageInstallerSession#closeSession}.
 * <li>The method onResult of the listener will be called when all the methods listed in the session have completed,
 * either with success or failure.
 * </ol>
  * <p>
 * To upgrade the current application do the following steps:
 * </p>
 * <ol>
 * <li>Obtain an instance of PackageInstaller with {@link #PackageInstaller}.
 * <li>Call {@link #selfUpgrade} passing as parameter the name of the package to be used to upgrade the current application.
 * </ol>
 */
public class PackageInstaller {
	/**
	 * This is the constructor of PackageInstaller.
	 * @param context
	 *            <code>Context</code> context of the caller application
	 * @throws PackageInstallerException in case of error.
	 */
	public PackageInstaller(Context context) {
    }
		
   /**
	* Call this method to create a {@link PackageInstallerSession} object.
	* The method can be used to request a session on which it will be possible
	* to group the execution of a sequence of install/uninstall/upgrade commands.
	*
	* @param listener
	*            {@link PackageInstallerListener} instance that implements
	*             the method {@link PackageInstallerListener#onResult} to handle the result of methods executed in the session.
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error when exceptions are enabled through the {@link ErrorManager} singleton.
	*/
	public PackageInstallerSession createSession(PackageInstallerListener listener) {
		return null;
	}

   /**
	* Call this method to upgrade the current application. <br>
	* Do not suspend the UIThread while waiting for the result of the method otherwise an application’s deadlock can occur.
	*
	* In case of success the intent "android.intent.action.MY_PACKAGE_REPLACED" is fired. <br>
	* In case of failure:<br>
    *	      - if the problem is found before contacting the remote service an error is returned;
	*  		    the error code is one of the {@link PackageInstallerException} error constants, but when exceptions are enabled @throws {@link PackageInstallerException}. <br>
	*	      - if the problem is found in the remote service the intent "com.datalogic.app.UPGRADE_ME_STATUS" is fired. <br>
    * The extra data of the "com.datalogic.app.UPGRADE_ME_STATUS" are:
	* <br>
	* 			- {@link <a href="https://developer.android.com/reference/android/content/pm/PackageInstaller#EXTRA_STATUS">android.content.pm.PackageInstaller.EXTRA_STATUS</a>} <code>int</code>: a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* <br>
	*			- {@link <a href="https://developer.android.com/reference/android/content/pm/PackageInstaller#EXTRA_STATUS_MESSAGE">android.content.pm.PackageInstaller.EXTRA_STATUS_MESSAGE</a>}  <code>String</code>: an error string message.
	* <br>
	*			- {@link <a href="https://developer.android.com/reference/android/content/pm/PackageInstaller#EXTRA_PACKAGE_NAME">android.content.pm.PackageInstaller.EXTRA_PACKAGE_NAME</a>}  <code>String</code>: Package Name of the application.
	* <br>
	* @param apk
	*            <code>String</code> full path of the .apk to be used to upgrade the current application. <br>
	*            <strong>NOTE</strong>: Running on an Android 11 device, until Datalogic SDK v1.32, an user App can upgrade an APK only using <br>
	*                     a path of the external storage (WRITE_EXTERNAL_STORAGE permission to be granted by App to store the APK) <br>
	*                     or any path not requiring memory permissions to access (e.g Downloads). <br>
	*                     On the contrary, if the calling App stores the APK into the internal memory, <br>
	*                     the API will be not able to upgrade the APK due to the missing privilages for accessing to the internal memory of the calling App. <br>
	*                     From Datalogic SDK v1.33, instead, the API is able to upgrade an APK stored into the internal memory of the calling App. <br>
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	*/
	public int selfUpgrade(String apk) {
		return 0;
	}

   /**
	* Call this method to install the application contained within the .apk file specified by apk. <br>
	* The method is executed alone, not grouped together with other methods as can be done using a {@link PackageInstallerSession}.
	* The result of the command is received through the listener method {@link PackageInstallerListener#onResult}.
	* Do not suspend the UIThread while waiting for the result of the method otherwise an application’s deadlock can occur.
	* <br>
	* <br>
	*      Example:<br>
	* <br>
	*      <code>PackageInstaller packageInstaller = new PackageInstaller(context);</code><br>
	*      <code>PackageInstallerListener listener = new PackageInstallerListener{public void onResult(List<PackageInstallerResult> results) {...}};</code><br>
	*      <code>packageInstaller.install("/dir1/dir11/dir116/pkg1.apk", false, listener);</code><br>
	*
	* @param apk
	*            <code>String</code> full path of the .apk to be installed. <br>
	*            <strong>NOTE</strong>: Running on an Android 11 device, until Datalogic SDK v1.32, an user App can install an APK only using <br>
	*                     a path of the external storage (WRITE_EXTERNAL_STORAGE permission to be granted by App to store the APK) <br>
	*                     or any path not requiring memory permissions to access (e.g Downloads). <br>
	*                     On the contrary, if the calling App stores the APK into the internal memory, <br>
	*                     the API will be not able to install the APK due to the missing privilages for accessing to the internal memory of the calling App. <br>
	*                     From Datalogic SDK v1.33, instead, the API is able to install an APK stored into the internal memory of the calling App. <br>
	* @param force
	*            <code>boolean</code> true force the upgrade in case the application is already installed,
	*							   otherwise the upgrade is refused.
	* @param listener
	*            {@link PackageInstallerListener} instance that implements
	*             the method {@link PackageInstallerListener#onResult} to handle the result of the method.
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	*/
	public int install(String apk, boolean force, PackageInstallerListener listener) {
		return 0;
	}

   /**
	* Call this method to install the applications contained within the .apk files specified by apks. <br>
	* It allows also the installation of an app distributed as multiple split APKs. Only in this
	* case set atomic = true. <br>
	* The method is executed alone, not grouped together with other methods as can be done using a {@link PackageInstallerSession}.
	* The result of the command is received through the listener method {@link PackageInstallerListener#onResult}.
	* Do not suspend the UIThread while waiting for the result of the method otherwise an application’s deadlock can occur.
	* <br>
	* <br>
	*      Example:<br>
	*      <code>public int install(ArrayList<String> pkgs, boolean atomic) </code>
	* <br>
	*      <code>PackageInstaller packageInstaller = new PackageInstaller(context);</code><br>
    *      <code>PackageInstallerListener listener = new PackageInstallerListener{public void onResult(List<PackageInstallerResult> results) {...}};</code><br>
	*      <code> ArrayList<String> apks = new ArrayList<String>();</code><br>
	*      <code> apks.add("/dir1/dir11/dir116/pkg1.apk");</code><br>
	*      <code> apks.add("/dir1/dir11/dir116/pkg2.apk");</code><br>
	*      <code>packageInstaller.install(apks, false);</code><br>
	*
	* @param pkgs
	*            <code>ArrayList<String></code> list of the full path of the .apks files to be installed <br>
	*            <strong>NOTE</strong>: Running on an Android 11 device, until Datalogic SDK v1.32, an user App can install an APK only using <br>
	*                     a path of the external storage (WRITE_EXTERNAL_STORAGE permission to be granted by App to store the APK) <br>
	*                     or any path not requiring memory permissions to access (e.g Downloads). <br>
	*                     On the contrary, if the calling App stores the APK into the internal memory, <br>
	*                     the API will be not able to install the APK due to the missing privilages for accessing to the internal memory of the calling App. <br>
	*                     From Datalogic SDK v1.33, instead, the API is able to install an APK stored into the internal memory of the calling App. <br>
	* @param atomic
	*            <code>boolean</code> true if "apks" lists the multiple split APKs of the application to be installed
	* @param listener
	*            {@link PackageInstallerListener} instance that implements
	*             the method {@link PackageInstallerListener#onResult} to handle the result of the method.
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	* @hide
	*/
	public int install(ArrayList<String> apks, boolean atomic, PackageInstallerListener listener) {
		return 0;
	}

   /**
	* Call this method to unistall an application installed on the device. <br>
	* The method is executed alone, not grouped together with other methods as can be done using a {@link PackageInstallerSession}.
	* The result of the command is received through the listener method {@link PackageInstallerListener#onResult}.
	* Do not suspend the UIThread while waiting for the result of the method otherwise an application’s deadlock can occur.
	* <br>
	* <br>
	*      Example:<br>
	* <br>
	*      <code>PackageInstaller packageInstaller = new PackageInstaller(context);</code><br>
    *      <code>PackageInstallerListener listener = new PackageInstallerListener{public void onResult(List<PackageInstallerResult> results) {...}};</code><br>
	*      <code>packageInstaller.uninstall("com.example.helloandroid", listener);</code><br>
	*
	*
	* @param packageName
	*            <code>String</code> package name of the application to be uninstalled.
	* @param listener
	*            {@link PackageInstallerListener} instance that implements
	*             the method {@link PackageInstallerListener#onResult} to handle the result of the method.
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	*/
	public int uninstall(String packageName, PackageInstallerListener listener) {
		return 0;
	}

   /**
	* Call this method to upgrade an application installed on the device. <br>
	* The method is executed alone, not grouped together with other methods as we can be done using a {@link PackageInstallerSession}.
	* The result of the command is received through the listener method {@link PackageInstallerListener#onResult}.
	* <br>
	* <br>
	*      Example:<br>
	* <br>
	*      <code>PackageInstaller packageInstaller = new PackageInstaller(context);</code><br>
    *      <code>PackageInstallerListener listener = new PackageInstallerListener{public void onResult(List<PackageInstallerResult> results) {...}};</code><br>
	*      <code>packageInstaller.upgrade("/dir1/dir11/dir116/pkg1_v2.apk", listener);</code><br>
	*
	* @param apk
	*            <code>String</code> full path of the .apk to be used to upgrade the application already installed that has the same Package Name of this .apk. <br>
	*            <strong>NOTE</strong>: Running on an Android 11 device, until Datalogic SDK v1.32, an user App can upgrade an APK only using <br>
	*                     a path of the external storage (WRITE_EXTERNAL_STORAGE permission to be granted by App to store the APK) <br>
	*                     or any path not requiring memory permissions to access (e.g Downloads). <br>
	*                     On the contrary, if the calling App stores the APK into the internal memory,  <br>
	*                     the API will be not able to upgrade the APK due to the missing privilages for accessing to the internal memory of the calling App. <br>
	*                     From Datalogic SDK v1.33, instead, the API is able to upgrade an APK stored into the internal memory of the calling App. <br>
	* @param listener
	*            {@link PackageInstallerListener} instance that implements
	*             the method {@link PackageInstallerListener#onResult} to handle the result of the method.
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	*/
	public int upgrade(String apk, PackageInstallerListener listener) {
		return 0;
	}

}
