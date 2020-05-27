package com.cognitiveradio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognitiveradio.entities.*;
import java.util.List;

@Repository
public interface InformationRepository extends JpaRepository<Information, Integer> {
    //List<Information> findAllNames(String text);
}
