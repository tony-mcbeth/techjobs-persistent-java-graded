package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.List;


@Entity
public class Job extends AbstractEntity{

    @ManyToOne
   private Employer employer;
    @ManyToMany
    @JoinColumn (name = "job.skills")
    private List<Skill> skills;


    public Job() {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
