package com.jfrog.reproduce

class User {
    String id
    String name
    Set<String> profiles = []
    Set<Profile> profilesEnum = []

    static constraints = {
    }
}
