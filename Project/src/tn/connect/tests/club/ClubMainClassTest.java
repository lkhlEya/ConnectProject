package tn.connect.tests.club;

import java.sql.SQLException;

import tn.connect.entities.club.Club;
import tn.connect.services.club.ClubService;
import tn.connect.utils.commun.DBConnection;

public class ClubMainClassTest {
	
	 public static void main(String[] args) {

         DBConnection cnx1 = DBConnection.getInstance();
         DBConnection cnx2 = DBConnection.getInstance();
         System.out.println(cnx1.hashCode()+ " " +cnx2.hashCode());
         
       ClubService cs = new ClubService();

       Club c = new Club(null, "Name", "university","institue","EXPL","description");
       Club c2 = new Club(null, "Name1", "university1","institue1","EXPL1","description1");

       try {

           cs.createClub(c);
           cs.updateClub(c2);

           for (Club club : cs.ReadListClub()) {
                System.out.println(club.toString()+"\n");
           }
                
           System.out.println(cs.ReadClub(1L));
          
           if (cs.deleteClub(1L)) {
               System.out.println("Delete with success!");
           } else {
               System.out.println("Problem while delete Club !");
           }

       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
   }

}
