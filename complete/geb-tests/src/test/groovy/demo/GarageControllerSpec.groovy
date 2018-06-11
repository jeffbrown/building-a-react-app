package demo

import demo.pages.GarageHomePage
import geb.spock.GebSpec
import spock.lang.Stepwise

@Stepwise
class GarageControllerSpec extends GebSpec {

    void 'Creating a car increaeses the car count'() {
        when:
        GarageHomePage page = browser.to(GarageHomePage)

        then:
        browser.at GarageHomePage

        when:
        Car car = Car.builder()
                .name('New Car')
                .make('Ford')
                .model('Windstar')
                .driver('Susan').build()
        page.createForm.createCar(car)

        then:
        waitFor {
            page.cars().size() == old(page.cars().size()) + 1
            page.cars().contains(car)
        }
    }
}
