package DAL;

import Model.Department;
import Model.Student;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Smily
 */
public class MyConnect {

    private ArrayList<Student> std = new ArrayList<>();
    private HashMap<String, Department> departHashMap = new HashMap<>();
    Connection con;

    public MyConnect() {
        try {
            con = new DBcontext().getConnection();
        } catch (Exception e) {
        }

    }

    public ArrayList<Student> getStd() {
        return std;
    }

    public void setStd(ArrayList<Student> std) {
        this.std = std;
    }

    public HashMap<String, Department> getDepartHashMap() {
        return departHashMap;
    }

    public void setDepartHashMap(HashMap<String, Department> departHashMap) {
        this.departHashMap = departHashMap;
    }

    public String status;
    public void loadStudent() {
        String sql = "SELECT * FROM Student";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            std = new ArrayList<>();
            while(rs.next()){
                String id = rs.getString(1);
                String name = rs.getString(2);
                String departID = rs.getString(3);
                boolean gender = rs.getBoolean(4);
                float GPA = rs.getFloat(5);
                String address = rs.getString(6);
                std.add(new Student(id, name, departID, gender, GPA, address));
            }
        } catch (Exception e) {
            status = "Loi Read Student" + e.getMessage();
        }

    }
    
    public void loadDepartment(){
        String sql = "SELECT * FROM Department";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            departHashMap = new HashMap<>();
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String information = rs.getString(3);
                departHashMap.put(id, new Department(id, name, information));
                
            }
        } catch (Exception e) {
            status = "Loi Read Department" + e.getMessage();
        }
    }
    
}
