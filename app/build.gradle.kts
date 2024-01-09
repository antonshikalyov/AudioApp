plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.audioapp"
    compileSdk = 34
    ndkVersion = "26.1.10909125"

    defaultConfig {
        applicationId = "com.example.audioapp"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.arthenica:mobile-ffmpeg-full:4.4")
//    implementation("nl.bravobit:android-ffmpeg:1.1.7")
//    implementation("com.arthenica:ffmpeg-kit-full:4.5.1-1")
    implementation("com.arthenica:mobile-ffmpeg-full:4.4")
//    implementation(files("libs/ffmpeg-0.8.0.jar",
//                                "libs/checker-qual-3.37.0.jar",
//                                "libs/commons-io-2.15.0.jar",
//                                "libs/commons-lang3-3.13.0.jar",
//                                "libs/error_prone_annotations-2.21.1.jar",
//                                "libs/failureaccess-1.0.1.jar",
//                                "libs/gson-2.10.1.jar",
//                                "libs/guava-32.1.3-jre.jar",
//                                "libs/j2objc-annotations-2.8.jar",
//                                "libs/jsr305-3.0.2.jar",
//                                "libs/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar",
//                                "libs/modelmapper-3.2.0.jar",
//                                "libs/slf4j-api-2.0.9.jar"))
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}