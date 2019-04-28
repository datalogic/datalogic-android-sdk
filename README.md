# datalogic-android-sdk

Datalogic Androd SDK - see https://datalogic.github.io/ for details.  

## How to use

Datalogic maintains two ways to use the Datalogic Android SDK in your project:

1. Install an Android SDK add-on component in the Android SDK Manager, as [described here](http://datalogic.github.io/quick-start/android-studio.html).

2. Add a gradle dependency for the SDK, which is available through the JitPack.io Maven repository.  This option is described below.

## Add jitpack.io repository

Add a reference to jitpack.io to the `build.gradle` file at your project's base/root directory:

```gradle
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}
```

## Add a dependency on the SDK

Add a reference to the specific version of the SDK you would like to use to your `app/build.gradle` file. In this example, we are using version `1.12`. You can see a list of all released versions [here](https://github.com/datalogic/datalogic-android-sdk/releases).

```gradle
dependencies {
    implementation 'com.github.datalogic:datalogic-android-sdk:1.12'
}
```

## Next steps
- A number of sample projects that use the Datalogic Android SDK are maintained on our [Tutorials page](http://datalogic.github.io/tutorials/).

- Reference material for the Datalogic Android SDK is maintained at [this location](https://datalogic.github.io/android-sdk-docs/reference/packages.html).
