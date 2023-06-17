package com.wander.People.service;

import com.wander.People.dto.request.PersonRequestDTO;
import com.wander.People.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personDTO);

    PersonResponseDTO update( Long id, PersonRequestDTO personDTO);

    String delete(Long id);
}
