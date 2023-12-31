/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.common;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.networkpkg.Network;
import business.organizationpkg.DoctorOrganization;
import business.organizationpkg.DonorOrganization;
import business.organizationpkg.Organization;
import business.organizationpkg.SupervisorOrganization;
import business.organizationpkg.TransportOrganization;
import business.organizationpkg.VolunteerOrganization;
import business.userAccountpkg.UserAccount;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author hardik
 */
public class Validation {
    
    
    
    public static boolean validateString(String name)
    {
        return true;
    }
    
    public static int calculateAge(Date dateOfBirth)
    {
       try
       {     
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR))
        age--;
        return age;
       }
       catch(Exception e)
       {
        return 0;   
       }
    }
    
    
    public static VolunteerOrganization getVolunteerOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        VolunteerOrganization volunteerOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Education))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof VolunteerOrganization)
             {
              volunteerOrganization = (VolunteerOrganization)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return volunteerOrganization;
    }
    
    public static VolunteerOrganization getVolunteerOrganizationInNw(EcoSystem ecoSystem, Network nw)
    {
        VolunteerOrganization volunteerOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(nw))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Education))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof VolunteerOrganization)
             {
              volunteerOrganization = (VolunteerOrganization)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return volunteerOrganization;
    }
    
      public static DonorOrganization getDonorOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        DonorOrganization donorOrganization = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.NGO))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof DonorOrganization)
             {
              donorOrganization = (DonorOrganization)organization; 
             }
            }
            }
          }
         }
        }
        return donorOrganization;
    }
      
       public static TransportOrganization getTransportOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        TransportOrganization transportOrganization = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Education))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof TransportOrganization)
             {
              transportOrganization = (TransportOrganization)organization; 
             }
            }
            }
          }
         }
        }
        return transportOrganization;
    } 
       
     public static DoctorOrganization getDoctorOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        DoctorOrganization doctorOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof DoctorOrganization)
             {
              doctorOrganization = (DoctorOrganization)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return doctorOrganization;
    }   
     
      public static SupervisorOrganization getSupervisorOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        SupervisorOrganization supervisorOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Unique))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof SupervisorOrganization)
             {
              supervisorOrganization = (SupervisorOrganization)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return supervisorOrganization;
    }  
      
 
}
