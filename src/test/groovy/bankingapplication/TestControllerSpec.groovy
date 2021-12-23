package bankingapplication

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import tutorials.TestController

class TestControllerSpec extends Specification implements ControllerUnitTest<TestController> {

    def setup() {
    }

    def cleanup() {
    }

//    void "test redirect url"() {
//        when:
//        controller.list()
//        then:
//        response.redirectedUrl == "/test/index"
//    }

    void "test redirect url"() {
        when:
        controller.list()
        then:
        response.redirectedUrl == "/test/index?author=Stephen+King"
    }
}
