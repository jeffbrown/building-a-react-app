package demo.modules

import demo.Car
import geb.Module

class CarRowModule extends Module {

    static content = {
        cell { $('td') }
        idCell { cell[0] }
        nameCell { cell[1] }
        makeCell { cell[2] }
        modelCell { cell[3] }
        driverCell { cell[4] }
    }

    Long id() {
        Long.valueOf(idCell.text())
    }
    String name() {
        nameCell.text()
    }
    String make() {
        makeCell.text()
    }
    String model() {
        modelCell.text()
    }
    String driver() {
        driverCell.text()
    }

    Car toCar() {
        Car.builder()
                .id(id())
                .name(name())
                .make(make())
                .model(model())
                .driver(driver())
                .build()
    }
}
