package site.paranoia;

import java.util.List;

public class Depart {
    private String departName;

    private List<People> peopleList;

    public Depart(String departName, List<People> peopleList) {
        this.departName = departName;
        this.peopleList = peopleList;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }
}
