package com.jfrog.reproduce

class User {
    String id
    String name
    Set<Profile> profiles = [Profile.DEVELOP] as Set<Profile>

    static constraints = {
    }
}
