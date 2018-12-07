package test;

import java.sql.SQLException;

import static test.DemoDatabase2.*;

public class DemoDatabase3 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DemoDatabase2.connectDb();

        System.out.println("its working");

        DemoDatabase2.statementDb();
        System.out.println("Its working too");

        DemoDatabase2 d = new DemoDatabase2();
        d.connectDb();
        d.statementDb();



    }




}
