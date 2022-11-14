package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;

import java.util.list;

@Entity
public class Job extends AbstractEntity{

    @ManyToONe
   private Employer employer;
    @ManyToMany
    @JoinColumn (name = "job.skills")
    private List<Skill> skills;

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
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
