# datalogic-android-sdk

Datalogic Androd SDK - see https://datalogic.github.io/ for details.  

## Supported devices

The table below indicates when support for a given version of the SDK was added to a device's firmware.

| SDK version | X4/DL-Axist | JTA6   | Memor 1 | Memor 10 GMS | Memor 10 CN |
|-------------|-------------|--------|---------|--------------|-------------|
| 1.08        |             |        |         | 1.00.02      |             |
| 1.09        |             |        |         |              |             |
| 1.10        |             |        |         |              |             |
| 1.11        |             |        |         |              |             |
| 1.12        |             |        |         |              |             |
| 1.13        |             |        |         |              |             |
| 1.14        |             |        | 3.03.05 | 1.00.04      | 1.00.05     |
| 1.15        | 2.02.74     | 2.18.29|         |              |             |
| 1.16        |             | 2.19.31| 3.04.06 | 1.02.07      |             |
| 1.17        |             | 2.20.32| 3.05.07 |              |             |
| 1.18        | 2.03.02     | 2.20.34|         |              |             |
| 1.19.1      |             |        |         | 1.04.10      |             |

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
