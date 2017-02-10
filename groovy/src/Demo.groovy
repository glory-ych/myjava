/**
 * Created by yangch on 2016/12/14 0014.
 */
class Demo {
    def "hello world"(int age) {
        setup:
        String name = "ych";
        when:
        println name+age;
        then:
        age
        20
        30
    }
}
