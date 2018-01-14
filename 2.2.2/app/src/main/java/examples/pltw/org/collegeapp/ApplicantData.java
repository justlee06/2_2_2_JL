package examples.pltw.org.collegeapp;

/**
 * Created by justi on 1/13/2018.
 */
//step 28 and 29
public abstract class ApplicantData {
    private String email;
    public String getemail()
    {
        return email;
    }
    public void setemail(String newemail)
    {
        email = newemail;
    }
    private String objectID;
    public String getID()
    {
        return objectID;
    }
    public void setID(String new_ID)
    {
        objectID = new_ID;
    }
}
