package com.cft.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cft.spring.modelo.Carrera;

@Repository
public class CarreraRepositoryImp implements CarreraRepository{

private static final String TABLA = "carreras";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Carrera makeObject(ResultSet rs, int row) throws SQLException {
		return new Carrera(rs.getInt("id"), rs.getString("nombre"));
	}
	
	@Override
	public List<Carrera> findAll() {
		final String sql = String.format("SELECT * FROM %s", TABLA);
		return jdbcTemplate.query(sql, this::makeObject);
	}

	@Override
	public Carrera findById(int id) {
		final String sql = String.format("SELECT * FROM %s WHERE id = ?", TABLA);
		return jdbcTemplate.queryForObject(sql, this::makeObject, id);
	}

	@Override
	public void create(Carrera carrera) {
		String sql = String.format("INSERT INTO %s(nombre) VALUES(?)", TABLA);
		jdbcTemplate.update(sql, carrera.getNombre());
	}

	@Override
	public void edit(Carrera carrera) {
		String sql = String.format("UPDATE %s SET nombre = ? WHERE id = ?", TABLA);
		jdbcTemplate.update(sql, carrera.getNombre(), carrera.getId());
	}

	@Override
	public void delete(int id) {
		String sql = String.format("DELETE FROM %s WHERE id = ?", TABLA);
		jdbcTemplate.update(sql, id);
	}
}
