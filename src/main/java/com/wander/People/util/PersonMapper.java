package com.wander.People.util;

import com.wander.People.dto.request.PersonRequestDTO;
import com.wander.People.dto.response.PersonResponseDTO;
import com.wander.People.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class PersonMapper {
    public Person toPerson(PersonRequestDTO persontDTO) {
        return Person.builder()
                .name(persontDTO.getName())
                .cpf(persontDTO.getCpf())
                .age(persontDTO.getAge())
                .build();
    }

    public PersonResponseDTO toPersonDTO(Person person) {
        return new PersonResponseDTO(person);
    }


    public List<PersonResponseDTO> toPeopleDTO(List<Person> peopleList) {
        return peopleList.stream().map(PersonResponseDTO::new).collect(Collectors.toList());
    }

    public void updatePersonData(Person person, PersonRequestDTO personDTO){
        person.setName(personDTO.getName());
        person.setAge(personDTO.getAge());
        person.setCpf(personDTO.getCpf());
    }

}
