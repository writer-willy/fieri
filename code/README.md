# Kotlin/JVM 실행 프로젝트

JDK 21을 사용하는 간단한 콘솔 프로젝트입니다.

## Android Studio

1. Open에서 이 `code` 폴더를 선택합니다.
2. Gradle JDK를 JDK 21(Android Studio 내장 JDK가 21이면 해당 JDK)로 지정하고 Gradle 동기화를 완료합니다.
3. `src/main/kotlin/fieri/Main.kt`의 `main` 옆 실행 버튼을 누릅니다.
4. `src/test/kotlin/fieri/MainTest.kt`의 테스트 옆 실행 버튼으로 단위 테스트를 실행합니다.

## 터미널

이 폴더에서 실행합니다. 최초 실행에는 Gradle과 의존성 다운로드를 위한 인터넷 연결이 필요합니다.

```sh
./gradlew run
./gradlew test
```

실행 결과: `Hello, fieri!`

테스트 보고서: `build/reports/tests/test/index.html`
