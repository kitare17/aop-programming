package com.aop_programming.demo;

import com.aop_programming.demo.service.FilteringTechnique1;
import com.aop_programming.demo.service.FilteringTechnique2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FilteringTechnique1 filteringTechnique1;

    @Autowired
    private FilteringTechnique2 filteringTechnique2;

    @Override
    public void run(String... args) throws Exception{

        logger.info("{}",filteringTechnique2.collaborativeFiltering());
        logger.info("{}",filteringTechnique1.contentBasedFiltering());
        logger.info("{}",filteringTechnique1.testBeforeAnnotation());
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}
