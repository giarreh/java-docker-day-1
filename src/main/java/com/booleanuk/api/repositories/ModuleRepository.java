package com.booleanuk.api.repositories;

import com.booleanuk.api.models.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module, Integer>{
}
