package examples.pltw.org.collegeapp;

import java.util.Date;

/**
 * Created by wdumas on 4/11/16.
 */
public class Profile extends ApplicantData{
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    //step 18
    /*private String objectID = "3AC26B6D-4DE9-323E-FFD4-608EEA34B700";
    public String getID()
    {
        return objectID;
    }
    public void setID(String new_ID)
    {
        objectID = new_ID;
    }*/
    //step 19
    /*private String email;
    public String getemail()
    {
        return email;
    }
    public void setemail(String newemail)
    {
        email = newemail;
    }*/
    public Profile() {
        firstName = "Alan";
        lastName = "Turing";
        dateOfBirth = new Date(84, 6, 22, 0, 0);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
