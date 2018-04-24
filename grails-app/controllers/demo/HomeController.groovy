package demo

import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_POLICE')
class HomeController {

    def index() {
        render view: 'index', model: [
                msg: 'Hello Grails!'
        ]
    }

    @Secured('ROLE_DETECTIVE')
    def hello(String name) {
        render "Hello ${name}!"
    }

    def logout() {
        redirect uri: SpringSecurityUtils.securityConfig.logout.filterProcessesUrl
    }

}
