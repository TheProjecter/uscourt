package com.uscourt

import org.codehaus.groovy.grails.plugins.springsecurity.Secured

@Secured(['ROLE_USER', 'ROLE_ADMIN'])
class PersonController {

    def scaffold = Person
}
