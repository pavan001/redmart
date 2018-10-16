prerequisite
* install JDK 8 and set environment variable as per your platform
* install maven and Set mvn home as per your platform
* install android sdk and set  android home path as per your platform
* set up android emulator 5.0 and above using avd
* install appium v1.9.1
* install appium doctor using npm install appium-doctor -g
* open the terminal then run  appium-doctor --android

if there are no errors setup is done. warnings can be ignored


To run the project :
* navigate to the project folder where pom.xml is present
* run or open the emulator via avd
* finally run mvn clean test

To run the project in intelij :
* import the project as maven project
* go to resources -- runner --runner.xml -run as testng test


To run the scripts on real device :
* make sure the developer options is enabled in your device
* under resources go to Android_redmart.properties file
* change device.name=Android Emulator to device.name = your device id
* device id can be taken from adb



