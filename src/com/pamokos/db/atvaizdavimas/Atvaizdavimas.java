package com.pamokos.db.atvaizdavimas;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;

import java.util.Scanner;



/**

 * Created by User on 2017-03-13.

 */

public class Atvaizdavimas {

    private Connection connection;



    public Atvaizdavimas() {

        try {

            connection = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/kcs",

                    "root",

                    "");

        } catch (Exception klaida) {

            System.out.println(klaida);

        }

    }



    public void pasisveikink() {

        System.out.println("Labas, atvaizduosime studentų lenteles iš DB");

    }



    public void paklausk() {

        System.out.println("Kurią lentelę nori matyti?");

        System.out.println("Rinkis skaičių. Sudentai: 1, Adresai: 2, Pažymiai: 3");

    }



    public void nuspresk() {

        Scanner sc = new Scanner(System.in);

        int pasirinkimas = sc.nextInt();

        switch (pasirinkimas) {

            case 1:

                lentele1();

                break;

            case 2:

                lentele2();

                break;

            case 3:

                lentele3();

                break;

        }

    }



    private void lentele1() {

        System.out.println("1 lentele");

        try {

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM `students`;");

            while (resultSet.next()) {

                System.out.print("|");

                System.out.print(resultSet.getInt("id"));

                System.out.print("|");

                System.out.print(resultSet.getString("name"));

                System.out.print("|");

                System.out.print(resultSet.getString("surname"));

                System.out.print("|");

                System.out.print(resultSet.getInt("phone"));

                System.out.print("|");

                System.out.print(resultSet.getString("email"));

            }

        } catch (Exception error) {

            System.out.println(error);

        }

    }

    private void lentele2() {

    }

    private void lentele3() {

    }

}