/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizationpkg;

import business.rolepkg.Admin;
import business.rolepkg.HelpNeededRole;
import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class HelpNeededOrganization extends Organization{
    
    public HelpNeededOrganization()
    {
        super(Organization.Type.HelpNeeded.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HelpNeededRole());
        return roles;
    }
    
}
