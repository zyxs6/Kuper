@file:Suppress("unused")

object FramesLibs {
    // Kotlin
    private const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${FramesVersions.kotlin}"

    // Coroutines
    private const val coroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${FramesVersions.coroutines}"
    private const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${FramesVersions.coroutines}"

    // Android UI
    private const val appcompat = "androidx.appcompat:appcompat:${FramesVersions.appcompat}"
    private const val cardView = "androidx.cardview:cardview:${FramesVersions.cardView}"
    private const val recyclerView = "androidx.recyclerview:recyclerview:${FramesVersions.recyclerView}"
    private const val swipeRefreshLayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${FramesVersions.swipeRefreshLayout}"
    private const val palette = "androidx.palette:palette:${FramesVersions.palette}"
    private const val preference = "androidx.preference:preference:${FramesVersions.preference}"
    private const val materialComponents =
        "com.google.android.material:material:${FramesVersions.materialComponents}"
    private const val activityKtx = "androidx.activity:activity-ktx:${FramesVersions.activityKtx}"
    private const val fragmentKtx = "androidx.fragment:fragment-ktx:${FramesVersions.fragmentKtx}"

    // ViewModel and LiveData
    private const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${FramesVersions.lifecycleExt}"
    private const val livedataKtx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${FramesVersions.lifecycle}"
    private const val viewmodelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${FramesVersions.lifecycle}"

    // Room Database
    private const val room = "androidx.room:room-ktx:${FramesVersions.room}"
    private const val roomCompiler = "androidx.room:room-compiler:${FramesVersions.room}"

    // Work Manager
    private const val work = "androidx.work:work-runtime-ktx:${FramesVersions.work}"

    // Network & Serialization
    private const val gson = "com.google.code.gson:gson:${FramesVersions.gson}"
    private const val retrofit = "com.squareup.retrofit2:retrofit:${FramesVersions.retrofit}"
    private const val retrofitGsonConverter =
        "com.squareup.retrofit2:converter-gson:${FramesVersions.retrofit}"
    private const val retrofitScalarsConverter =
        "com.squareup.retrofit2:converter-scalars:${FramesVersions.retrofit}"

    // Image loading and Touch Image View
    private const val coil = "io.coil-kt:coil:${FramesVersions.coil}"
    private const val touchImageView =
        "com.github.MikeOrtiz:TouchImageView:${FramesVersions.touchImageView}"

    // Harmonic colors
    private const val harmonicColors =
        "com.github.LeonardoSM04:HarmonicColorExtractor:${FramesVersions.harmonicColors}"

    // Sectioned RecyclerView
    private const val sectionedRecyclerView =
        "com.jahirfiquitiva:sectioned-recyclerview:${FramesVersions.sectionedRecyclerView}@aar"

    // FastScroll RecyclerView
    private const val fastScrollRecyclerView =
        "com.github.jahirfiquitiva:RecyclerView-FastScroll:${FramesVersions.fastScrollRecyclerView}"

    // Permissions
    private const val permissions = "com.github.fondesa:kpermissions:${FramesVersions.permissions}"

    // License checker
    private const val licenseChecker =
        "com.github.javiersantos:PiracyChecker:${FramesVersions.licenseChecker}"

    // In-App Billing
    private const val inAppBilling =
        "com.android.billingclient:billing-ktx:${FramesVersions.inAppBilling}"

    // MultiDex
    private const val multidex = "androidx.multidex:multidex:${FramesVersions.multidex}"

    // OneSignal
    const val oneSignal = "com.onesignal:OneSignal:${FramesVersions.oneSignal}"

    // Muzei API
    const val muzei = "com.google.android.apps.muzei:muzei-api:${FramesVersions.muzei}"

    // Dependencies (must use api for they to work)
    val dependencies = arrayOf(
        kotlin,
        coroutines,
        coroutinesAndroid,
        appcompat,
        cardView,
        recyclerView,
        swipeRefreshLayout,
        palette,
        preference,
        materialComponents,
        activityKtx,
        fragmentKtx,
        lifecycle,
        livedataKtx,
        viewmodelKtx,
        room,
        work,
        gson,
        retrofit,
        retrofitGsonConverter,
        retrofitScalarsConverter,
        coil,
        touchImageView,
        harmonicColors,
        sectionedRecyclerView,
        fastScrollRecyclerView,
        permissions,
        licenseChecker,
        inAppBilling,
        multidex,
        muzei
    )

    // KSP dependencies
    val kspDependencies = arrayOf(roomCompiler)
}
