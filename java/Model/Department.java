package Model;

/**
 *
 * @author Smily
 */
public class Department {
    private String ID;
    private String departName;
    private String information;

    public Department() {
    }

    public Department(String ID, String departName, String information) {
        this.ID = ID;
        this.departName = departName;
        this.information = information;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    
//    public String toRow(){
//        String s = "<tr>";
//        s+="<td>"+ID+"</td>";
//        s+="<td>"+departName+"</td>";
//        s+="<td>"+information+"</td>";
//        s+="</tr>";
//        return s;
//    }
}
