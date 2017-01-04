package com.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by appu on 4/1/17.
 */
@Configuration
public class SampleConfiguration {


    @Bean
    public Person typeReturn()
    {
        return new Teacher();
    }


}
