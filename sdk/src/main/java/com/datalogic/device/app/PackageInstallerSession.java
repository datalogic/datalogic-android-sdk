package com.datalogic.device.app;

import android.os.IBinder;
import android.content.ServiceConnection;
import android.content.ComponentName;
import android.content.Context;
import java.util.ArrayList;

import com.datalogic.device.ErrorManager;

/**
 * <code>PackageInstallerSession</code> gives developers the ability to group the execution of a sequence of install, uninstall and
 * upgrade commands.
 * Once the session is created, the commands install, uninstall, upgrade must be called inside a transaction.
 * A transaction is opened calling {@link PackageInstallerSession#openSession} and closed and commited calling {@link PackageInstallerSession#closeSession}.
 * <p>
 * To install two applications using a session do the following steps:
 * </p>
 * <ol>
 * <li>Obtain an instance of PackageInstaller with {@link PackageInstaller#PackageInstaller}.
 * <li>Obtain an instance of {@link PackageInstallerListener} that will be used to handle the
 * result of the commands invoked on the session.
 * <li>Create a {@link PackageInstallerSession} calling {@link PackageInstaller#createSession}.
 * The {@link PackageInstaller#createSession} method takes as parameters the instance of {@link PackageInstallerListener} created at the previous step.
 * <li>Start a session calling {@link PackageInstallerSession#openSession}.
 * <li>Call {@link PackageInstallerSession#install} to install the first application.
 * <li>Call {@link PackageInstallerSession#install} to install the second application.
 * <li>Close and commit the session calling {@link PackageInstallerSession#closeSession}.
 * <li>The method onResult of the listener will be called when the execution of all the commands of the transaction
 * are completed, either with success or failure. It contains the result of each command.
 * </ol>
 */
public class PackageInstallerSession implements ServiceConnection {

	/**
	 * @hide
	 * This is the constructor of PackageInstallerSession.
	 */
	private PackageInstallerSession() {
	}

   /**
	* Call this method to start a session. <br>
	* After this method, call the commands install, uninstall, upgrade to be executed. <br>
	* The commands will be queued and executed only when the closeSession() method is called. <br>
	* The commands will be executed in best effort. <br>
	* The results of each command will be delivered in a unique ordered list through the {@link PackageInstallerListener#onResult} method.
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	*/
	public int openSession() {
		return 0;
	}

   /**
	* Call this method to execute the commands queued in the session. <br>
	* The commands will be executed in best effort. <br>
	* The command execution is asynchronous.
	* The results of each command will be delivered in a unique ordered list through the listener {@link PackageInstallerListener#onResult} method.
	* Do not suspend the UIThread while waiting for the result of the method otherwise an application’s deadlock can occur.
	*/
	public int closeSession() {
		return 0;
	}

   /**
	* Callback implemented to receive the asynchronous result of the bindService request. <br>
	* @hide
	*/
	public void onServiceConnected(ComponentName className, IBinder binder) {
    }

   /**
	* Callback implemented to receive the notify that the bind to the service is lost due to a crash of the service. <br>
	* @hide
	*/
	public void onServiceDisconnected(ComponentName className) {
    }

   /**
	* Call this method to install the application contained within the .apk file specified by apk. <br>
	* The method must be called after having called the {@link PackageInstallerSession#openSession}. <br>
	* The method is queued internally and executed only when the {@link PackageInstallerSession#closeSession} is called. <br>
	* The result of the command is received through the listener method {@link PackageInstallerListener#onResult}.
	* <br>
	* <br>
	*      Example:<br>
	* <br>
	*      <code>PackageInstaller packageInstaller = new PackageInstaller(context);</code><br>
    *      <code>PackageInstallerListener listener = new PackageInstallerListener{public void onResult(List<PackageInstallerResult> results) {...}};</code><br>
	*      <code>PackageInstallerSession session = packageInstaller.createSession(listener);</code><br>
	*      <code>session.openSession();</code><br>
	*      <code>session.install("/dir1/dir11/dir116/pkg1.apk", force);</code><br>
	*      <code>session.closeSession();</code><br>
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
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	*/
	public int install(String apk, boolean force) {
		return 0;
	}

   /**
	* Call this method to install the applications contained within the .apk files specified by apks. <br>
	* It allows also the installation of an app distributed as multiple split APKs. Only in this
	* case set atomic = true. <br>
	* The method must be called after having called the {@link PackageInstallerSession#openSession}. <br>
	* The method is queued internally and executed when the {@link PackageInstallerSession#closeSession} is called. <br>
	* The result of the command is received through the listener method {@link PackageInstallerListener#onResult}.
	* <br>
	* <br>
	*      Example:<br>
	*      <code>public int install(ArrayList<String> pkgs, boolean atomic) </code>
	* <br>
	*      <code>PackageInstaller packageInstaller = new PackageInstaller(context);</code><br>
    *      <code>PackageInstallerListener listener = new PackageInstallerListener{public void onResult(List<PackageInstallerResult> results) {...}};</code><br>
	*      <code>PackageInstallerSession session = packageInstaller.createSession(listener);</code><br>
	*      <code>session.openSession();</code><br>
	*      <code> ArrayList<String> apks = new ArrayList<String>();</code><br>
	*      <code> apks.add("/dir1/dir11/dir116/pkg1.apk");</code><br>
	*      <code> apks.add("/dir1/dir11/dir116/pkg2.apk");</code><br>
	*      <code>session.install(apks, false);</code><br>
	*      <code>session.closeSession();</code><br>
	*
	* @param apks
	*            <code>ArrayList<String></code> list of the full path of the .apk files to be installed. <br>
	*            <strong>NOTE</strong>: Running on an Android 11 device, until Datalogic SDK v1.32, an user App can install an APK only using <br>
	*                     a path of the external storage (WRITE_EXTERNAL_STORAGE permission to be granted by App to store the APK) <br>
	*                     or any path not requiring memory permissions to access (e.g Downloads). <br>
	*                     On the contrary, if the calling App stores the APK into the internal memory, <br>
	*                     the API will be not able to install the APK due to the missing privilages for accessing to the internal memory of the calling App. <br>
	*                     From Datalogic SDK v1.33, instead, the API is able to install an APK stored into the internal memory of the calling App. <br>
	* @param atomic
	*            <code>boolean</code> true if "apks" lists the multiple split APKs of the application to be installed.
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	* @hide
	*/
	public int install(ArrayList<String> apks, boolean atomic) {
		return 0;
	}

   /**
	* Call this method to upgrade an application installed on the device. <br>
	* The method must be called after having called the {@link PackageInstallerSession#openSession}. <br>
	* The method is queued internally and executed when the {@link PackageInstallerSession#closeSession} is called. <br>
	* The result of the command is received through the listener method {@link PackageInstallerListener#onResult}.
	* <br>
	* <br>
	*      Example:<br>
	* <br>
	*      <code>PackageInstaller packageInstaller = new PackageInstaller(context);</code><br>
    *      <code>PackageInstallerListener listener = new PackageInstallerListener{public void onResult(List<PackageInstallerResult> results) {...}};</code><br>
	*      <code>PackageInstallerSession session = packageInstaller.createSession(listener);</code><br>
	*      <code>session.openSession();</code><br>
	*      <code>session.upgrade("/dir1/dir11/dir116/pkg1_v2.apk");</code><br>
	*      <code>session.closeSession();</code><br>
	*
	* @param apk
	*            <code>String</code> full path of the .apk to be used to upgrade the application already installed with the same Package Name of this .apk. <br>
	*            <strong>NOTE</strong>: Running on an Android 11 device, until Datalogic SDK v1.32, an user App can upgrade an APK only using <br>
	*                     a path of the external storage (WRITE_EXTERNAL_STORAGE permission to be granted by App to store the APK) <br>
	*                     or any path not requiring memory permissions to access (e.g Downloads). <br>
	*                     On the contrary, if the calling App stores the APK into the internal memory,  <br>
	*                     the API will be not able to upgrade the APK due to the missing privilages for accessing to the internal memory of the calling App. <br>
	*                     From Datalogic SDK v1.33, instead, the API is able to upgrade an APK stored into the internal memory of the calling App. <br>
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	*/
	public int upgrade(String apk) {
		return 0;
	}

   /**
	* Call this method to unistall an application installed on the device.
	* The method must be called after having called the {@link PackageInstallerSession#openSession}. <br>
	* The method is queued internally and executed when the {@link PackageInstallerSession#closeSession} is called. <br>
	* The result of the command is received through the listener method {@link PackageInstallerListener#onResult}.
	* <br>
	* <br>
	*      Example:<br>
	* <br>
	*      <code>PackageInstaller packageInstaller = new PackageInstaller(context);</code><br>
    *      <code>PackageInstallerListener listener = new PackageInstallerListener{public void onResult(List<PackageInstallerResult> results) {...}};</code><br>
	*      <code>PackageInstallerSession session = packageInstaller.createSession(listener);</code><br>
	*      <code>session.openSession();</code><br>
	*      <code>session.uninstall("com.example.helloandroid");</code><br>
	*      <code>session.closeSession();</code><br>
	*
	* @param packageName
	*            <code>String</code> package name of the application to be uninstalled.
	* @return <code>int</code>
	*            {@link PackageInstallerException#SUCCESS} in case of success,
	* otherwise a possible error code, matching one of the {@link PackageInstallerException} error constants.
	* @throws PackageInstallerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	*/
	public int uninstall(String packageName) {
		return 0;
	}

}
