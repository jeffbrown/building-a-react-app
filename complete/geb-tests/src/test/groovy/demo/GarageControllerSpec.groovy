package demo

import demo.pages.GarageHomePage
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
