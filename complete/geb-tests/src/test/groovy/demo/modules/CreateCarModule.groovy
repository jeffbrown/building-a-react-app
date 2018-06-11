package demo.modules

import demo.Car
import geb.Module
import geb.module.Select
import geb.module.TextInput

class CreateCarModule extends Module {

    static content = {
        nameField { $('input', name: 'name').module(TextInput) }
        makeList { $('select', name: 'make').module(Select) }
        modelList { $('select', name: 'model').module(Select) }
        driverList  { $('select', name: 'driver').module(Select) }
        saveButton { $('input', value: 'Add to library') }
    }

    void createCar(Car car) {
        nameField.value(car.name)
        makeList.selected = car.make
        modelList.selected = car.model
        driverList.selected = car.driver
        saveButton.click()
    }
}

