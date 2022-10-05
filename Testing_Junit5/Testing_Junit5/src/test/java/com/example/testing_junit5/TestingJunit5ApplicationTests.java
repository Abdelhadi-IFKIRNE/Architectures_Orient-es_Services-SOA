package com.example.testing_junit5;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class TestingJunit5ApplicationTests {
     test test=new test();
    @Test
    void contextLoads() {
        int a=1;
        int b=2;
        int att=test.calculator(a,b);
        int expected=3;
        assertThat(att).isEqualTo(expected);
    }

    class  test{
        int calculator(int a, int b){
            return a+b;
        }
    }

}
