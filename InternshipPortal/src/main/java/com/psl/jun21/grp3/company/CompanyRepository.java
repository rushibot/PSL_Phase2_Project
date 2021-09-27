package com.psl.jun21.grp3.company;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rushikesh Dimuthi
 *
 */

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {
	Company findByUserId(Long id);
}
