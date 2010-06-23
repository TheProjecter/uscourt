package com.uscourt

class Address {
    String addressType
    String address
    String city
    String state
    String postalCode

    static constraints = {
        address(blank: false)
        city(blank: false)
        state(blank: false)
        postalCode(blank: false)
    }
}
