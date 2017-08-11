package me.yling.w3challenge.repositories;

import me.yling.w3challenge.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository <Person,Long>
{
}
