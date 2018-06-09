package demo

import demo.pages.GarageHomePage
import geb.spock.GebSpec
import spock.lang.Stepwise

@Stepwise
class GarageControllerSpec extends GebSpec {

    void 'test home page'() {
        when:
        to GarageHomePage

        then:
        at GarageHomePage
        numberOfCars == 3
    }

    void 'test creating a car'() {
        when:
        to GarageHomePage

        then:
        at GarageHomePage

        when:
        createCar 'New Car', 'Ford', 'Windstar', 'Susan'

        then:
        at GarageHomePage
        waitFor {
            numberOfCars == 4
        }
    }
}
