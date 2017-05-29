package gormtest

class TestDomain implements ObjectId<Long> {

    // Long id
    String name
    String description

    static constraints = {
    }
}
