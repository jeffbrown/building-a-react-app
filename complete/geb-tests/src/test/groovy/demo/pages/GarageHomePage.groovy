package demo.pages

import geb.Page

class GarageHomePage extends Page {
    static url = '/garage/index'

    static at = {
        title == 'Garage'
    }

    static content = {
        carRows(wait: true) { $('table tbody tr') }
        numberOfCarRows { carRows.size() }
    }
}
