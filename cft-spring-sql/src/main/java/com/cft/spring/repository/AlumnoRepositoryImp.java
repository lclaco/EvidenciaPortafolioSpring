package com.cft.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cft.spring.Alumno;

@Repository
public class AlumnoRepositoryImp implements AlumnoRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private Alumno makeObject(ResultSet rs, int filaNum) throws SQLException {
	return new Alumno(rs.getInt("id"), rs.getString("nombre"), rs.getInt("edad"));
	}

	@Override
	public List<Alumno> findAll() {
	return jdbcTemplate.query("SELECT * FROM alumnos2", this::makeObject);
	}
	

	@Override
	public Alumno findById(int id) {
		String sql = "SELECT * FROM alumnos2 WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, this::makeObject);
	}

	@Override
	public void create(Alumno alumno) {
		String sql = "INSERT INTO alumnos2 (nombre,edad) VALUES(?,?)";
		jdbcTemplate.update(sql, alumno.getNombre(),alumno.getEdad());
	}
	

	@Override
	public void edit(Alumno alumno) {
		String sql = "UPDATE alumnos SET nombre = ?, edad = ? WHERE id = ?";
		jdbcTemplate.update(sql, alumno.getNombre(),alumno.getEdad(),alumno.getId());
	}
	
	@Override
	public void delete(int id) {
		String sql = "DELETE FROM alumnos2 WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}
	

}
