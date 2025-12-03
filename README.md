# desktop-native

# Build

## Build native application
```
gradle jpackageImage 
```
Task `jpackageImage` create dir in /build/jpackage/[NAMEAPP]
NAMEAPP - gradle > jlink : launcher : name 

### Param Linux
1 Logging
Create log4j2.xml to `confroom/lib/log4j2.xml`

### Param Windows
1 Logging
Create log4j2.xml to `confroom\log4j2.xml`