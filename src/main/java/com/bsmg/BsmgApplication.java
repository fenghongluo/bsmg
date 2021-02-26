package com.bsmg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author admin
 */
@SpringBootApplication(scanBasePackageClasses = BsmgApplication.class)
public class BsmgApplication {

    public static void main(String[] args) {
        SpringApplication.run(BsmgApplication.class, args);
    }

}
