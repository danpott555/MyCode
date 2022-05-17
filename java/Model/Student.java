package Model;

/**
 *
 * @author Smily
 */
public class Student {
    private String ID;
    private String name;
    private String departID;
    private boolean gender;
    private float GPA;
    private String address;

    public Student() {
    }

    public Student(String ID, String name, String departID, boolean gender, float GPA, String address) {
        this.ID = ID;
        this.name = name;
        this.departID = departID;
        this.gender = gender;
        this.GPA = GPA;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartID() {
        return departID;
    }

    public void setDepartID(String departID) {
        this.departID = departID;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toRow(){
        String s = "<tr>";
        s+="<td>"+ID+"</td>";
        s+="<td>"+name+"</td>";
        s+="<td>"+departID+"</td>";
        s+="<td>"+(gender?"Male":"Female")+"</td>";
        s+="<td>"+GPA+"</td>";
        s+="<td>"+address+"</td>";
        s+="</tr>";
        return s;
    }
    
}
