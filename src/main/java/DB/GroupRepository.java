package DB;

import org.springframework.data.repository.CrudRepository;

import DB.Group;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GroupRepository extends CrudRepository<Group, Long> {

}
