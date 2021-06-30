/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.connect.offer.tests;

import java.sql.SQLException;
import tn.connect.offer.services.*;
import tn.connect.offer.entities.Internships;

/**
 *
 * @author Thinkpad
 */
public class MainTest {

    public static void main(String[] args) throws SQLException {
        InternshipService is = new InternshipService();
        Internships i = new Internships("Netcom","IT", "Stage Technicien", "blablabla",
                '2021-06-30', '2021-06-30', "Noussayr Derbel", "En cours");
        is.retrieveInternships();
        is.addInternship(i);

    }

}
