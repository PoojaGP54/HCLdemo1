package com.HCLproject1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import com.HCLproject1.Dao.EmployeeRepository;
import com.HCLproject1.service.EmployeeService;

@SpringBootTest
@ComponentScan(value="com.HCLproject1.EmployeeTest")
public class HCLProject1ApplicationTests {


}
