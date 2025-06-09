package br.com.fatecads.fatecads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fatecads.fatecads.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}