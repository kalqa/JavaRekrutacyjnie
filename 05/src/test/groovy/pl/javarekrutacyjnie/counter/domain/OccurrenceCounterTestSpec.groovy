package pl.javarekrutacyjnie.counter.domain


import spock.lang.Specification
import spock.lang.Subject

class OccurrenceCounterTestSpec extends Specification {

    @Subject
    OccurrenceCounter occurrenceCounter = new OccurrenceCounter()

    def "should return correct response"() {
        given:
            Response expectedResponse = new Response(
                        2,
                        1,
                        1,
                        1)
            String givenInput = "aa2, "

        when:
            Response occurrences = occurrenceCounter.calculateOccurrences(givenInput)

        then:
            occurrences == expectedResponse
    }
}
