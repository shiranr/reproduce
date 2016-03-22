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
        "/setBug"(controller: "test", action: 'setBug')
        "/anotherSetBug"(controller: "test", action: 'anotherSetBug')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
