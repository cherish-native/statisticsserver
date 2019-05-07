package com.egf.statisticsserver;

import org.junit.After;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

public class NormalTest {

    @Test
    public void generateDepartSql(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/zqLuo/Desktop/depart_pt.txt"));
            String line = null;
            while ((line = reader.readLine()) != null){
                String[] arr = line.split("-");
                StringBuilder sql = new StringBuilder("insert sys_depart values( ")
                        .append("'").append(generateUUID()).append("',")
                        .append("'").append(arr[0]).append("',")
                        .append("'").append(arr[2]).append("',")
                        .append("'").append(arr[1]).append("');");
                System.out.println(sql.toString());
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @After
    public void after(){
        System.out.println("end");
    }
}
