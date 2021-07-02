/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.connect.tests.offers;

import java.sql.Date;
import java.sql.SQLException;

import tn.connect.entities.offers.Internships;
import tn.connect.services.offers.InternshipService;

/**
 *
 * @author Thinkpad
 */
public class MainTest {

    public static void main(String[] args) throws SQLException {
        InternshipService is = new InternshipService();
        Internships i = new Internships("Netcom","IT", "Stage Technicien", "blablabla",
                Date.valueOf("30-06-2021"), Date.valueOf("2021-06-30"), "Noussayr Derbel", "En cours");
        is.retrieveInternships();
        is.addInternship(i);

    }

}
