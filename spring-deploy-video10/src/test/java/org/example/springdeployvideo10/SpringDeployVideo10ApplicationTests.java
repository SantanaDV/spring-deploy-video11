package org.example.springdeployvideo10;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//SpringBootTest
class SpringDeployVideo10ApplicationTests {

    @Test
    void contextLoads() {
        System.getenv().forEach(
                (key, value) -> System.out.println(key + "=" + value)
        );
    }

}
