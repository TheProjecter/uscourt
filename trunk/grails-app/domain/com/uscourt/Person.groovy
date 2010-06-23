package com.uscourt

class Person {

    String firstName
    String middleName
    String lastName
    Calendar dateOfBirth

    static hasMany = [addresses: Address]

    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
    }
}
