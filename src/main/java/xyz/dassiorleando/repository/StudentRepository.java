package xyz.dassiorleando.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import xyz.dassiorleando.domain.Student;

/**
 * Created by dassiorleando on 16/12/2016.
 */
public interface StudentRepository extends MongoRepository<Student, String>{
}
