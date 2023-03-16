package extra.util;

import java.util.ArrayList;

public class Department {
    private String department;
    private static ArrayList<String> departments = new ArrayList<>();
    public Department(String department) {
        this.department = department;
        if (!departments.contains(department)){
            departments.add(department);
        }
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment(){
        return this.department;
    }

    public static ArrayList<String> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return department;
    }
}
