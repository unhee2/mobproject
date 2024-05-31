[//]: # (# NAVER Map Compose 🗺)

[//]: # ()
[//]: # (<a href="https://github.com/fornewid/naver-map-compose/actions/workflows/build.yaml"><img src="https://github.com/fornewid/naver-map-compose/actions/workflows/build.yaml/badge.svg"/></a>)

[//]: # (<a href="https://opensource.org/licenses/Apache-2.0"><img src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>)

[//]: # (<a href='https://developer.android.com'><img src='http://img.shields.io/badge/platform-android-green.svg'/></a>)

[//]: # (<a href='https://developer.android.com/studio/releases/platforms#5.0'><img src="https://img.shields.io/badge/API%20Level-21+-green.svg"/></a>)

[//]: # ()
[//]: # (이 라이브러리는 [Jetpack Compose][compose]에서 사용할 수 있는 [네이버 지도][naver-map] API를 제공합니다.)

[//]: # ()
[//]: # (## Sample App)

[//]: # ()
[//]: # (이 저장소에는 샘플 앱이 포함되어 있습니다.)

[//]: # (실행하려면 다음을 수행해야 합니다.)

[//]: # ()
[//]: # (1. [NAVER Map Android SDK Demo]&#40;https://github.com/navermaps/android-map-sdk&#41; 레포지터리의 [How To Run]&#40;https://github.com/navermaps/android-map-sdk#how-to-run&#41;을 참고하여, 클라이언트 ID를 발급받습니다.)

[//]: # (2. [`client_id.xml`]&#40;app/src/main/res/values/client_id.xml&#41;의 `naver_map_sdk_client_id`에 발급받은 클라이언트 ID를 입력합니다.)

[//]: # (3. 빌드하고 실행합니다.)

[//]: # ()
[//]: # (## Download)

[//]: # ()
[//]: # (### naver-map-compose:)

[//]: # (<table>)

[//]: # ( <tr>)

[//]: # (  <td>Compose 1.1 &#40;1.1.x&#41;</td><td><img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.fornewid/naver-map-compose?versionPrefix=1.0"/></td>)

[//]: # ( </tr>)

[//]: # ( <tr>)

[//]: # (  <td>Compose 1.2 &#40;1.2.x&#41;</td><td><img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.fornewid/naver-map-compose?versionPrefix=1.1"></td>)

[//]: # ( </tr>)

[//]: # ( <tr>)

[//]: # (  <td>Compose 1.3 &#40;1.3.x&#41;</td><td><img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.fornewid/naver-map-compose?versionPrefix=1.2"></td>)

[//]: # ( </tr>)

[//]: # ( <tr>)

[//]: # (  <td>Compose 1.4 &#40;1.4.x&#41;</td><td><img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.fornewid/naver-map-compose?versionPrefix=1.3"></td>)

[//]: # ( </tr>)

[//]: # ( <tr>)

[//]: # (  <td>Compose 1.5 &#40;1.5.x&#41;</td><td><img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.fornewid/naver-map-compose?versionPrefix=1.4"></td>)

[//]: # ( </tr>)

[//]: # ( <tr>)

[//]: # (  <td>Compose 1.6 &#40;1.6.x&#41;</td><td><img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.fornewid/naver-map-compose?versionPrefix=1.5"></td>)

[//]: # ( </tr>)

[//]: # ( <tr>)

[//]: # (  <td>Compose 1.7 &#40;1.7.x&#41;</td><td><img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.fornewid/naver-map-compose?versionPrefix=1.7"></td>)

[//]: # ( </tr>)

[//]: # (</table>)

[//]: # ()
[//]: # (### naver-map-location:)

[//]: # (<table>)

[//]: # ( <tr>)

[//]: # (  <td>play-services-location 16.0.0 ~</td><td><img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.fornewid/naver-map-location?versionPrefix=16.0.0"/></td>)

[//]: # ( </tr>)

[//]: # ( <tr>)

[//]: # (  <td>play-services-location 18.0.0 ~</td><td><img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.fornewid/naver-map-location?versionPrefix=18.0.0"/></td>)

[//]: # ( </tr>)

[//]: # ( <tr>)

[//]: # (  <td>play-services-location 21.0.1 ~</td><td><img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.github.fornewid/naver-map-location?versionPrefix=21.0.2"/></td>)

[//]: # ( </tr>)

[//]: # (</table>)

[//]: # ()
[//]: # (```groovy)

[//]: # (repositories {)

[//]: # (    mavenCentral&#40;&#41;)

[//]: # (})

[//]: # ()
[//]: # (dependencies {)

[//]: # (    implementation 'io.github.fornewid:naver-map-compose:<version>')

[//]: # ()
[//]: # (    // &#40;Optional&#41; 위치 추적하기)

[//]: # (    // 다른 버전의 play-services-location 과 함께 사용하려면 선언해야 합니다.)

[//]: # (    // 선언하지 않았을 때, 기본으로 포함되는 play-services-location 버전은 16.0.0 입니다.)

[//]: # (    implementation 'io.github.fornewid:naver-map-location:<version>')

[//]: # (})

[//]: # (```)

[//]: # ()
[//]: # (### :warning: Warnings)

[//]: # ()
[//]: # (이 라이브러리는 내부적으로 네이버 지도 SDK를 사용하고 있습니다.)

[//]: # ()
[//]: # (이에 따라오는 몇 가지 주의사항이 있습니다. &#40;참고: [네이버 지도 안드로이드 SDK - 시작하기 - 의존성 추가]&#40;https://navermaps.github.io/android-map-sdk/guide-ko/1.html&#41;&#41;)

[//]: # ()
[//]: # (1. 네이버 지도 SDK는 https://repository.map.naver.com/archive/maven Maven 저장소에서 배포됩니다.)

[//]: # (   따라서 루트 프로젝트의 `build.gradle`에 저장소 설정을 추가해야 합니다.)

[//]: # (```diff)

[//]: # (  allprojects {)

[//]: # (      repositories {)

[//]: # (          google&#40;&#41;)

[//]: # (          mavenCentral&#40;&#41;)

[//]: # (+         maven {)

[//]: # (+             url 'https://repository.map.naver.com/archive/maven')

[//]: # (+         })

[//]: # (          // naver-map-compose 1.5.6 버전까지는 다른 Maven 저장소 주소를 사용해야 합니다.)

[//]: # (          // maven { url 'https://naver.jfrog.io/artifactory/maven/' })

[//]: # (      })

[//]: # (  })

[//]: # (```)

[//]: # ()
[//]: # (2. 예전 네이버 지도 SDK는 [appcompat-v7]&#40;https://developer.android.com/topic/libraries/support-library/packages#v7-appcompat&#41; 28 버전을 사용합니다.)

[//]: # (   naver-map-compose 1.5.6 버전까지는, `gradle.properties`에 Jetifier 옵션을 추가해줘야 합니다.)

[//]: # (   naver-map-compose 1.5.7 버전부터는 필요하지 않습니다.)

[//]: # (```properties)

[//]: # (android.useAndroidX=true)

[//]: # (android.enableJetifier=true)

[//]: # (```)

[//]: # ()
[//]: # (3. 네이버 지도 SDK는 위치 추적기능을 지원하려고, play-services-location 라이브러리 16.0.0 버전을 사용합니다.)

[//]: # (   이 버전보다 높은 버전을 사용하고 있으면, 컴파일 혹은 런타임에 오류가 발생할 수 있습니다.)

[//]: # (   이 때는 play-services-location 라이브러리 버전과 같은 [naver-map-location]&#40;https://github.com/fornewid/naver-map-compose/edit/main/README.md#naver-map-location&#41; 라이브러리를 추가로 선언해야 합니다.)

[//]: # (```diff)

[//]: # (  dependencies {)

[//]: # (      implementation 'io.github.fornewid:naver-map-compose:<version>')

[//]: # (      implementation 'com.google.android.gms:play-services-location:21.0.1')

[//]: # (+     implementation 'io.github.fornewid:naver-map-location:21.0.2')

[//]: # (  })

[//]: # (```)

[//]: # ()
[//]: # (## Usage)

[//]: # ()
[//]: # (### 지도 추가하기)

[//]: # ()
[//]: # (```kotlin)

[//]: # (NaverMap&#40;)

[//]: # (    modifier = Modifier.fillMaxSize&#40;&#41;)

[//]: # (&#41;)

[//]: # (```)

[//]: # ()
[//]: # (### 지도 구성하기)

[//]: # ()
[//]: # (지도는 `MapProperties`와 `MapUiSettings` 객체를 `NaverMap` composable에 전달하여 구성할 수 있습니다.)

[//]: # ()
[//]: # (```kotlin)

[//]: # (var mapProperties by remember {)

[//]: # (    mutableStateOf&#40;)

[//]: # (        MapProperties&#40;maxZoom = 10.0, minZoom = 5.0&#41;)

[//]: # (    &#41;)

[//]: # (})

[//]: # (var mapUiSettings by remember {)

[//]: # (    mutableStateOf&#40;)

[//]: # (        MapUiSettings&#40;isLocationButtonEnabled = false&#41;)

[//]: # (    &#41;)

[//]: # (})

[//]: # (Box&#40;Modifier.fillMaxSize&#40;&#41;&#41; {)

[//]: # (    NaverMap&#40;properties = mapProperties, uiSettings = mapUiSettings&#41;)

[//]: # (    Column {)

[//]: # (        Button&#40;onClick = {)

[//]: # (            mapProperties = mapProperties.copy&#40;)

[//]: # (                isBuildingLayerGroupEnabled = !mapProperties.isBuildingLayerGroupEnabled)

[//]: # (            &#41;)

[//]: # (        }&#41; {)

[//]: # (            Text&#40;text = "Toggle isBuildingLayerGroupEnabled"&#41;)

[//]: # (        })

[//]: # (        Button&#40;onClick = {)

[//]: # (            mapUiSettings = mapUiSettings.copy&#40;)

[//]: # (                isLocationButtonEnabled = !mapUiSettings.isLocationButtonEnabled)

[//]: # (            &#41;)

[//]: # (        }&#41; {)

[//]: # (            Text&#40;text = "Toggle isLocationButtonEnabled"&#41;)

[//]: # (        })

[//]: # (    })

[//]: # (})

[//]: # (```)

[//]: # ()
[//]: # (### 지도의 카메라 제어하기)

[//]: # ()
[//]: # (`CameraPositionState`를 통해 카메라 변경을 관찰하고 제어할 수 있습니다.)

[//]: # ()
[//]: # (```kotlin)

[//]: # (val seoul = LatLng&#40;37.532600, 127.024612&#41;)

[//]: # (val cameraPositionState: CameraPositionState = rememberCameraPositionState {)

[//]: # (    // 카메라 초기 위치를 설정합니다.)

[//]: # (    position = CameraPosition&#40;seoul, 11.0&#41;)

[//]: # (})

[//]: # (Box&#40;Modifier.fillMaxSize&#40;&#41;&#41; {)

[//]: # (    NaverMap&#40;cameraPositionState = cameraPositionState&#41;)

[//]: # (    Button&#40;onClick = {)

[//]: # (        // 카메라를 새로운 줌 레벨로 이동합니다.)

[//]: # (        cameraPositionState.move&#40;CameraUpdate.zoomIn&#40;&#41;&#41;)

[//]: # (    }&#41; {)

[//]: # (        Text&#40;text = "Zoom In"&#41;)

[//]: # (    })

[//]: # (})

[//]: # (```)

[//]: # ()
[//]: # (### 지도에 그리기)

[//]: # ()
[//]: # (지도에 `Marker`처럼 Overlay를 추가하려면, `NaverMap`의 content에 child composable을 추가하면 됩니다.)

[//]: # ()
[//]: # (```kotlin)

[//]: # (NaverMap {)

[//]: # (    Marker&#40;)

[//]: # (        state = MarkerState&#40;position = LatLng&#40;37.532600, 127.024612&#41;&#41;,)

[//]: # (        captionText = "Marker in Seoul")

[//]: # (    &#41;)

[//]: # (    Marker&#40;)

[//]: # (        state = MarkerState&#40;position = LatLng&#40;37.390791, 127.096306&#41;&#41;,)

[//]: # (        captionText = "Marker in Pangyo")

[//]: # (    &#41;)

[//]: # (})

[//]: # (```)

[//]: # ()
[//]: # (제공되는 Overlay는 다음과 같습니다.)

[//]: # ()
[//]: # (- `ArrowheadPathOverlay`)

[//]: # (- `CircleOverlay`)

[//]: # (- `GroundOverlay`)

[//]: # (- `LocationOverlay`)

[//]: # (- `Marker`)

[//]: # (- `MultipartPathOverlay`)

[//]: # (- `PathOverlay`)

[//]: # (- `PolygonOverlay`)

[//]: # (- `PolylineOverlay`)

[//]: # ()
[//]: # (#### raw NaverMap 객체 얻기 &#40;Experimental&#41;)

[//]: # ()
[//]: # (특정 UseCase에서는 `NaverMap` 객체가 필요합니다.)

[//]: # (예를 들어, 이 라이브러리에서 마커 클러스터링은 아직 지원되지 않지만&#40;[Issue #14]&#40;https://github.com/fornewid/naver-map-compose/issues/14&#41; 참조&#41;,)

[//]: # ([외부 라이브러리]&#40;https://github.com/ParkSangGwon/TedNaverMapClustering&#41; 를 이용하여 클러스터링을 구현할 수 있습니다.)

[//]: # (이렇게 구현하려면 `MapEffect` 혹은 `DisposableMapEffect` composable을 사용하여 네이버지도 SDK의 raw `NaverMap` 객체에 접근해야 합니다.)

[//]: # ()
[//]: # (```kt)

[//]: # (NaverMap&#40;)

[//]: # (    // ...)

[//]: # (&#41; {)

[//]: # (    val context = LocalContext.current)

[//]: # (    var clusterManager by remember { mutableStateOf<TedNaverClustering<MyItem>?>&#40;null&#41; })

[//]: # (    DisposableMapEffect&#40;items&#41; { map ->)

[//]: # (        if &#40;clusterManager == null&#41; {)

[//]: # (            clusterManager = TedNaverClustering.with<MyItem>&#40;context, map&#41;.make&#40;&#41;)

[//]: # (        })

[//]: # (        clusterManager?.addItems&#40;items&#41;)

[//]: # (        onDispose {)

[//]: # (            clusterManager?.clearItems&#40;&#41;)

[//]: # (        })

[//]: # (    })

[//]: # (})

[//]: # (```)

[//]: # ()
[//]: # (### 위치 추적하기)

[//]: # ()
[//]: # (> :warning: `play-services-location` 버전이 16.0.0 보다 높으면, 컴파일 혹은 런타임에 오류가 발생할 수 있습니다. &#40;[Warnings 섹션을 참고하세요.]&#40;https://github.com/fornewid/naver-map-compose/edit/main/README.md#warning-warnings&#41;&#41;)

[//]: # ()
[//]: # (구글에서 제공하는 [FusedLocationProviderClient]&#40;https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient&#41;을 이용하여, 위치를 추적하는 기능을 제공합니다.)

[//]: # ()
[//]: # (`MapProperties`의 `locationTrackingMode`를 설정하여 위치 추적 모드를 지정할 수 있습니다.)

[//]: # ()
[//]: # (```kotlin)

[//]: # (NaverMap&#40;)

[//]: # (    locationSource = rememberFusedLocationSource&#40;&#41;,)

[//]: # (    properties = MapProperties&#40;)

[//]: # (        locationTrackingMode = LocationTrackingMode.Follow,)

[//]: # (    &#41;,)

[//]: # (    uiSettings = MapUiSettings&#40;)

[//]: # (        isLocationButtonEnabled = true,)

[//]: # (    &#41;)

[//]: # (&#41;)

[//]: # (```)

[//]: # ()
[//]: # (`LocationTrackingMode`가 `Follow` 또는 `Face`일 때, 나침반 기능을 활성화하려면 `isCompassEnabled`을 true로 설정해야 합니다.)

[//]: # ()
[//]: # (```kotlin)

[//]: # (NaverMap&#40;)

[//]: # (    locationSource = rememberFusedLocationSource&#40;isCompassEnabled = true&#41;,)

[//]: # (    properties = MapProperties&#40;)

[//]: # (        locationTrackingMode = LocationTrackingMode.Face,)

[//]: # (    &#41;,)

[//]: # (    uiSettings = MapUiSettings&#40;)

[//]: # (        isLocationButtonEnabled = true,)

[//]: # (    &#41;)

[//]: # (&#41;)

[//]: # (```)

[//]: # ()
[//]: # (## Snapshots)

[//]: # ()
[//]: # (현재 개발 중인 버전을 확인하고 싶다면 [SNAPSHOT 버전]&#40;https://s01.oss.sonatype.org/content/repositories/snapshots/io/github/fornewid/naver-map-compose/&#41;을 사용할 수 있습니다.)

[//]: # ()
[//]: # (Snapshot은 `main` branch에 커밋이 추가될 때마다 업데이트됩니다.)

[//]: # ()
[//]: # (```groovy)

[//]: # (repositories {)

[//]: # (    maven { url 'https://s01.oss.sonatype.org/content/repositories/snapshots' })

[//]: # (})

[//]: # ()
[//]: # (dependencies {)

[//]: # (    // 위 링크에서 최신 SNAPSHOT 버전을 확인하세요.)

[//]: # (    classpath 'io.github.fornewid:naver-map-compose:XXX-SNAPSHOT')

[//]: # (})

[//]: # (```)

[//]: # ()
[//]: # (## Contributions)

[//]: # ()
[//]: # (- 오류를 발견하거나 궁금한 점이 있다면 [이슈를 등록해주세요.]&#40;https://github.com/fornewid/naver-map-compose/issues/new&#41;)

[//]: # (- 새로운 기능을 추가하고 싶다면 [GitHub Issues]&#40;https://github.com/fornewid/naver-map-compose/issues&#41;를 통해 지원 가능 여부를 확인해야 합니다.)

[//]: # ()
[//]: # (## License)

[//]: # ()
[//]: # (```)

[//]: # (Copyright 2022 SOUP)

[//]: # ()
[//]: # (Licensed to the Apache Software Foundation &#40;ASF&#41; under one or more contributor)

[//]: # (license agreements. See the NOTICE file distributed with this work for)

[//]: # (additional information regarding copyright ownership. The ASF licenses this)

[//]: # (file to you under the Apache License, Version 2.0 &#40;the "License"&#41;; you may not)

[//]: # (use this file except in compliance with the License. You may obtain a copy of)

[//]: # (the License at)

[//]: # ()
[//]: # (   http://www.apache.org/licenses/LICENSE-2.0)

[//]: # ()
[//]: # (Unless required by applicable law or agreed to in writing, software)

[//]: # (distributed under the License is distributed on an "AS IS" BASIS, WITHOUT)

[//]: # (WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the)

[//]: # (License for the specific language governing permissions and limitations under)

[//]: # (the License.)

[//]: # (```)

[//]: # ()
[//]: # ([naver-map]: https://navermaps.github.io/android-map-sdk/guide-ko/)

[//]: # ([compose]: https://developer.android.com/jetpack/compose)

[//]: # ([api-key]: https://navermaps.github.io/android-map-sdk/guide-ko/1.html)
