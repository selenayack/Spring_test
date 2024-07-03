package com.example.spring1.springTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring1.springTest.entity.User;
import org.springframework.stereotype.Repository;
@Repository

public interface UserRepo extends JpaRepository<User,String> {


}
