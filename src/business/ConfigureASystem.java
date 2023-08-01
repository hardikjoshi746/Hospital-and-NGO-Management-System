package business;

import business.common.HelpNeeded;
import business.enterprisepkg.Enterprise;
import business.networkpkg.Network;
import business.organizationpkg.Organization;
import business.personpkg.Person;
import business.rolepkg.Admin;
import business.rolepkg.Doctor;
import business.rolepkg.Donor;
import business.rolepkg.Driver;
import business.rolepkg.HospitalManager;
import business.rolepkg.Mayor;
import business.rolepkg.Supervisor;
import business.rolepkg.SystemAdmin;
import business.userAccountpkg.UserAccount;


/**
 *
 * @author Nishi
 */
public class ConfigureASystem {
    
//    public static EcoSystem configure(){
//        
//        
//        
//        //Create a network
//        //create an enterprise
//        //initialize some organizations
//        //have some employees 
//        //create user account
//  
//        EcoSystem ecoSystem = populateEnterpriseData();
//        return ecoSystem;
//    }
    
    public static EcoSystem configure()
    {
        EcoSystem system = EcoSystem.getInstance();
        Person person = system.getPersonDirectory().addPerson();
        person.setFirstName("Sys");
        person.setLastName("Admin");
        person.setName();
        
        UserAccount ua = system.getUserAccountDirectory().addUserAccount("sysadmin", "sysadmin", person, new SystemAdmin());
        ua.setEnabled(true);
        
        HelpNeeded needHelp = system.addNeedHelp();
        needHelp.setHelp("Snow Shovel");
        needHelp.setHelp("Grass Cutting");
        needHelp.setHelp("Gardening");
        needHelp.setHelp("Grocery Shopping");
       
        
        Network network = system.addNetwork();
      
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
    // School    
        Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise("BostonSchool", Enterprise.EnterpriseType.Education);
        person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("School Admin");
        person.setName();
        UserAccount account = enterprise.getUserAccountDirectory().addUserAccount("Nishi", "Nishi", person, new Admin());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Volunteer);
        Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Transport);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Driver");
        person.setLastName("Transport");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("Raunak", "Raunak", person, new Driver());
        account.setNetwork(network);
        account.setEnabled(true);
        
      // Unique
         enterprise = network.getEnterpriseDirectory().addEnterprise("BostonUnique", Enterprise.EnterpriseType.Unique);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("Unique Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("Hardik", "Hardik", person, new Admin());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.HelpNeeded);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Supervisor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Supervisor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("Vivek", "Vivek", person, new Supervisor());
        account.setNetwork(network);
        account.setEnabled(true);
        
        // Manager
        
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Manager");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("Rahul", "Rahul", person, new HospitalManager());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
              // Non Profit
         enterprise = network.getEnterpriseDirectory().addEnterprise("NGO", Enterprise.EnterpriseType.NGO);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("NGO Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("NGO", "NGO", person, new Admin());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Donor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Donor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("DON", "DON", person, new Donor());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
                  // Hospital
         enterprise = network.getEnterpriseDirectory().addEnterprise("Hospital", Enterprise.EnterpriseType.Hospital);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("hospital Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("SSS", "SSS", person, new Admin());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Doctor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Doctor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("DOC", "DOC", person, new Doctor());
        account.setNetwork(network);
        account.setEnabled(true);
        
                // Govt
         enterprise = network.getEnterpriseDirectory().addEnterprise("Govt", Enterprise.EnterpriseType.Government);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("Govt Admin Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("GOVT", "GOVT", person, new Admin());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Mayor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("mayor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("AMY", "AMY", person, new Mayor());
        account.setNetwork(network);
        account.setEnabled(true);
      
    return system;
    }
    
  
    
}
