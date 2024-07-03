package com.example.spring1.springTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring1.springTest.entity.Tasks;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepo extends JpaRepository<Tasks,String> {
}
