#!/usr/bin/env sh

../../gradlew clean build
unzip build/libs/minimal-webapp-0.0.1.BUILD-SNAPSHOT.jar -d build/libs/minimal-webapp-0.0.1.BUILD-SNAPSHOT
native-image -Dio.netty.noUnsafe=true -H:ReflectionConfigurationFiles=graal.json -H:+ReportUnsupportedElementsAtRuntime -Dfile.encoding=UTF-8 -cp ".:$(echo build/libs/minimal-webapp-0.0.1.BUILD-SNAPSHOT/BOOT-INF/lib/*.jar | tr ' ' ':')":build/libs/minimal-webapp-0.0.1.BUILD-SNAPSHOT/BOOT-INF/classes org.springframework.fu.sample.minimal.ApplicationKt
