# reproduce
reproduce
 Two issues when upgrading from mongo GORM plugin version: 3.0.2 to Mongo gorm plugin version: 5.0.2.
 To see the exceptions, run Application.groovy and the code itself is in the test controller.
 The first bug can be seen in:
 127.0.0.1:8080/listToSetBug
 This is the way enums were saved in the DB till today (as string), when upgrading the plugin to 5.0.2 we got the exception:
 org.bson.codecs.configuration.CodecConfigurationException: Can't find a codec for interface java.util.Set.
 
 127.0.0.1:8080/versionBug
 
