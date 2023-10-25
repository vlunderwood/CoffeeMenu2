package coffee.repo;

import org.springframework.stereotype.Repository;

import coffee.beans.Menu;

import org.springframework.data.jpa.repository.JpaRepository;

//@author valei - vlunderwood CIS175 - Fall 2023 Oct 15, 2023

@Repository
public interface IMenuRepo extends JpaRepository<Menu, Long>{

	
		
}
