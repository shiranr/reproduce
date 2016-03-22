package reproduce

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/versionBug"(controller: "test", action: 'versionBug')
        "/idBug"(controller: "test", action: 'idBug')
        "/listToSetBug"(controller: "test", action: 'listToSetBug')
        "/listToSetOldBug"(controller: "test", action: 'listToSetOldBug')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
