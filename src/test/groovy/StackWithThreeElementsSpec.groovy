import spock.lang.Specification

class StackWithThreeElementsSpec extends Specification {
    def stack = new Stack();

    def setup() {
        ["elem1", "elem2", "elem3"].each { stack.push(it) }
    }

    def "size"() {
        expect: stack.size() == 3
    }

    def "pop"() {
        expect:
        stack.pop() == "elem3"
        stack.pop() == "elem2"
        stack.pop() == "elem1"
        stack.size() == 0
    }

    def "peek"() {
        expect:
        stack.peek() == "elem3"
        stack.peek() == "elem3"
        stack.peek() == "elem3"
        stack.size() == 3
    }

    def "push"() {
        when:
        stack.push("elem4")

        then:
        stack.size() == 4
        stack.peek() == "elem4"
    }
}