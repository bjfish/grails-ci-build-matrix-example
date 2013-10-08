package grailscibuildmatrixexample



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(SimpleController)
class SimpleControllerTests {

    void testHello() {
      controller.hello()
      assert response.text == 'hello'
    }
}
