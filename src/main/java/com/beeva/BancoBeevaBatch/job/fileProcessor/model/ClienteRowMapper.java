package com.beeva.BancoBeevaBatch.job.fileProcessor.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClienteRowMapper implements RowMapper<Cliente>  {

	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cliente cliente= new Cliente();
        cliente.setNombre(rs.getString("nombre"));
        cliente.setApellido(rs.getString("apellido"));
		

		return cliente;
	}

}
