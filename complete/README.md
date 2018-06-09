# Complete Garage Application

This project contains a completed functional version of the application
described at [guides.grails.org/building-a-react-app/guide/](http://guides.grails.org/building-a-react-app/guide/index.html).
 
## Run The Garage Application

From the `complete/` directory run the Garage application:

    ./gradlew app:bootRun
    
Alternatively, the appllication may be run from directly from the `app/` directory.

    cd app
    ./gradlew bootRun
    
## Run The Geb Tests

Once the application is running, the Geb tests may be executed against that
running instance.

    ./gradlew -Dgeb.env=chrome geb-tests:test
    
Alternatively, the tests may be run directly from the `geb-tests/` directory.

    cd geb-tests
    ./gradlew -Dgeb.env=chrome test
