package demo

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.builder.Builder

@ToString
@EqualsAndHashCode(excludes = 'id')
@Builder
class Car {
    Long id
    String name
    String make
    String model
    String driver
}
