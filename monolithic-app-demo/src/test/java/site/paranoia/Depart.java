package site.paranoia;

import lombok.Data;

import java.util.List;

@Data
public class Depart {
    private String departName;

    private People people;

    private List<People> peopleList;
}
