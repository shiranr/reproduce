package com.jfrog.reproduce

import com.mongodb.BasicDBObject
import com.mongodb.DB
import com.mongodb.DBCollection
import com.mongodb.Mongo
import org.bson.types.ObjectId

class TestController {


    def versionBug() {
        Mongo mongo = new Mongo("127.0.0.1", 27017)
        DB localDB = mongo.getDB('foo')
        localDB.dropDatabase()
        DBCollection collection = localDB.getCollection('user')
        collection.insert(new BasicDBObject('name', 'bla2').append('_id',new ObjectId().toString()).append('version', 0).append('profiles', [] as Set))
        User.findAll()
        render(view: 'index')
    }


    def listToSetBug() {
        Mongo mongo = new Mongo("127.0.0.1", 27017)
        DB localDB = mongo.getDB('foo')
        localDB.dropDatabase()
        DBCollection collection = localDB.getCollection('user')
        collection.insert(new BasicDBObject('name', 'bla2').append('_id',new ObjectId().toString()).append('profiles', [Profile.DEVELOP.toString()] as Set))
        User.findAll()
        render(view: 'index')
    }
}