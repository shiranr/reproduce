# reproduce

Reproduce Two issues when upgrading from mongo GORM plugin version: 3.0.2 to Mongo gorm plugin version: 5.0.2. <br>
 
 To see the exceptions, run Application.groovy and the code itself is in the test controller. <br>
 
 The first bug can be seen in: <br>
 > 127.0.0.1:8080/listToSetBug
 
 This is the way enums were saved in the DB till today (as string), when upgrading the plugin to 5.0.2 we got the exception: <br>
 > org.bson.codecs.configuration.CodecConfigurationException: Can't find a codec for interface java.util.Set.
 
 > 127.0.0.1:8080/versionBug
 
 The document version which is being maintained by GORM is creating the exception: <br>
 > readInt64 can only be called when CurrentBSONType is INT64, not when CurrentBSONType is INT32.
 
