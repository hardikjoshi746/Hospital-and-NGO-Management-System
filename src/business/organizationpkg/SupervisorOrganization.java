/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizationpkg;

import business.rolepkg.HospitalManager;
import business.rolepkg.Role;
import business.rolepkg.Supervisor;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class SupervisorOrganization extends Organization {
    
    public SupervisorOrganization()
    {
        super(Organization.Type.Supervisor.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Supervisor());
        roles.add(new HospitalManager());
        return roles;
    }
    
    
}
