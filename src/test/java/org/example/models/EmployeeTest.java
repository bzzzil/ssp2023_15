package org.example.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {
    Employee test;

    @BeforeEach
    void setupEmployee() {
        test = new Employee("Test User", "janitor", 300);
    }


    @Test
    void getSalary() {
        assertThat(test.getSalary())
                .isNotZero()
                .isPositive();
    }
}