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
        collection.insert(new BasicDBObject('name', 'bla2').append('_id',new ObjectId().toString()).append('version', 0L))
        User.findAll()
        render(view: 'index')
    }


    def listToSetBug() {
        Mongo mongo = new Mongo("127.0.0.1", 27017)
        DB localDB = mongo.getDB('foo')
        localDB.dropDatabase()
        DBCollection collection = localDB.getCollection('user')
        collection.insert(new BasicDBObject('name', 'bla2').append('_id',new ObjectId().toString()).append('profiles', [] as Set))
        User.findAll()
        render(view: 'index')
    }


    def listToSetOldBug() {
        Mongo mongo = new Mongo("127.0.0.1", 27017)
        DB localDB = mongo.getDB('foo')
        localDB.dropDatabase()
        User user = new User(name: 'name', profiles: [Profile.DEVELOP] as Set, profilesEnum: [] as Set)
        user.save(flush: true, failOnError: true)
        User.findAll()
        render(view: 'index')
    }

}
