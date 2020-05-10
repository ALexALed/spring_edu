package com.alexaled.spring_full.spring_full;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
public class SpringFullApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFullApplication.class, args);
	}

}

@Entity
class Cat {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	Cat() {

	}

	Cat(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Cat { id=%s, name=%s } ", id, name);
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

@RepositoryRestResource
interface CatRepository extends JpaRepository<Cat, Long> {
}