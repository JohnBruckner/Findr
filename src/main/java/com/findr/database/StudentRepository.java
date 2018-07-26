package com.findr.database;

import com.findr.database.impl.Student;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StudentRepository extends CrudRepository<Student, Long> {

}
