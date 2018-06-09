package demo.pages

import geb.Page

class GarageHomePage extends Page {
    static url = '/garage/index'

    static at = {
        title == 'Garage'
    }

    static content = {
        carRows(wait: true) { $('table tbody tr') }
        numberOfCars { carRows.size() }

        nameField { $('input', name: 'name') }
        makeList { $('select', name: 'make') }
        modelList { $('select', name: 'model') }
        driverList  { $('select', name: 'driver') }

        saveButton { $('input', value: 'Add to library') }
    }

    void createCar(String name,
                   String make,
                   String model,
                   String driverName) {
        nameField << name
        makeList << make
        modelList << model
        driverList << driverName
        saveButton.click()
    }
}
