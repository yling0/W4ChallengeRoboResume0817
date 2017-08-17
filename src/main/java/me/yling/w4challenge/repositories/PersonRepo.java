package me.yling.w4challenge.repositories;

import me.yling.w4challenge.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository <Person,Long>
{
}
