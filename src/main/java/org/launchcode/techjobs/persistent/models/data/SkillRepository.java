package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository

public interface SkillRepository extends CrudRepository<Job, Integer> {
}
