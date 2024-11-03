package com.project.carpooling.Publish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishRepo extends JpaRepository<publish,String>
{

}
