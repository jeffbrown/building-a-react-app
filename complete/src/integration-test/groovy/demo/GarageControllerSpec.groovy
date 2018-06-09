package demo

import geb.Page
import geb.spock.GebSpec

class GarageControllerSpec extends GebSpec {

    void 'test home page'() {
        when:
        to GarageHomePage


        then:
        at GarageHomePage
        numberOfCarRows == 3
    }
}

class GarageHomePage extends Page {
    static url = '/garage/index'

    static at = {
        title == 'Garage'
    }

    static content = {
        carRows { $('table tbody tr') }
        numberOfCarRows { carRows.size() }
    }
}
