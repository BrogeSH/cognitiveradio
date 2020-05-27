package com.cognitiveradio.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer salary;
    private String team_name;

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getSalary()
    {
        return salary;
    }
    public void setSalary(Integer salary)
    {
        this.salary = salary;
    }
    public String getTeam_name()
    {
        return team_name;
    }
    public void setTeam_name(String team_name)
    {
        this.team_name = team_name;
    }
    /*private String entityName;

    public int getId()
    {
        return id;
    }
    public String getEntityName()
    {
        return entityName;
    }*/

}
