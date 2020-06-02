## Internal notes

Steps to update this repo after a new version of the SDK has been posted in the [android-sdk-addon repo](https://github.com/datalogic/android-sdk-addon)

* Checkout *this* repo to <datalogic-android-sdk-repo-dir>

* Download a zip file of the corresponding release from the [internal server](https://dtcsrv838.dl.net/gddallolio/datalogic-sdk/tags)

* Unzip, cd into that directory

* cp -rf java/com <datalogic-android-sdk-repo-dir>/sdk/src/main/java/

* Commit changes to master, commit and push

* Create a tag - i.e. v1.22. 

* The first time someone uses the SDK in a gradle wrapper, [Jitpack](https://jitpack.io/#datalogic/datalogic-android-sdk) will trigger a build.

