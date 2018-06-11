package demo.pages

import demo.Car
import demo.modules.CarRowModule
import demo.modules.CreateCarModule
import geb.Page

class GarageHomePage extends Page {
    static url = '/garage/index'

    static at = {
        title == 'Garage'
    }

    static content = {

        carRows(wait: true) { $('table tbody tr').moduleList(CarRowModule) }
        createForm { $('form', 0).module(CreateCarModule) }
    }

    List<Car> cars() {
        carRows.collect { it.toCar() }
    }
}
