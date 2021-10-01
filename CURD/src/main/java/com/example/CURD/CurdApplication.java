package com.example.CURD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CurdApplication implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(CurdApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String sql = "INSERT INTO employee_details(last_name, first_name, email , age) VALUES(?,?,?,?)";
        int result = jdbcTemplate.update(sql, "Kashyap", "siyaram", "siyaram@gmail.com", 24);
        result = jdbcTemplate.update(sql, "Kumar", "Amit", "amit@gmail.com", 34);
        if (result != 0) {
            System.out.println("Row is created");
        }
    }
}
