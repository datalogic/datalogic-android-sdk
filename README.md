# datalogic-android-sdk

Datalogic Android SDK. Full API and usage documentation is available at [datalogic.github.io/android](https://datalogic.github.io/android).

## Install

This SDK is available from:

- Maven Central (recommended)
- JitPack (legacy distribution path)

### Maven Central

Coordinates:

- Group: com.datalogic
- Artifact: datalogic-android-sdk
- Packaging: aar
- Version pattern: X.Y (extracted from SYSTEM.java)

Gradle (KTS):

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

dependencies {
    implementation("com.datalogic:datalogic-android-sdk:1.48")
}
```

Gradle (Groovy):

```gradle
repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation 'com.datalogic:datalogic-android-sdk:1.48'
}
```

### JitPack

Gradle (Groovy):

```gradle
repositories {
    google()
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.datalogic:datalogic-android-sdk:v1.48'
}
```
