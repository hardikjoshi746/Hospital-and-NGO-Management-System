/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.personpkg;

import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class PersonDirectory {
    
      private ArrayList<Volunteer> volunteerList;
      private ArrayList<HelpNeeded> customerLsit;
      private ArrayList<Person> personList;
    
      public PersonDirectory()
      {
            volunteerList = new ArrayList<>();
            customerLsit = new ArrayList<>();
            personList = new ArrayList<>();
      }
      
      public Volunteer addVolunteer()
    {
        Volunteer volunteer = new Volunteer();
        volunteerList.add(volunteer);
        return volunteer;
    }
    
    public void removeVolunteer(Volunteer volunteer)
    {
      volunteerList.remove(volunteer);
    }
    
    public HelpNeeded addCustomer()
    {
        HelpNeeded customer = new HelpNeeded();
        customerLsit.add(customer);
        return customer;
    }
    
    public void removeCustomer(HelpNeeded customer)
    {
        customerLsit.remove(customer);
    }
    

    public ArrayList<HelpNeeded> getCustomerLsit() {
        return customerLsit;
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }


      public Person addPerson()
    {
        Person person = new Person();
       personList.add(person);
        return person;
    }
    
    public void removePerson(Person person)
    {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

  
    

}
