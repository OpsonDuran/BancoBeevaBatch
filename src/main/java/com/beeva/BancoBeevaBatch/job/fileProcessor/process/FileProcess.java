package com.beeva.BancoBeevaBatch.job.fileProcessor.process;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.beeva.BancoBeevaBatch.job.fileProcessor.model.Cliente;
import com.beeva.BancoBeevaBatch.job.fileProcessor.model.User;

@Component
public  class FileProcess implements ItemProcessor <Cliente,User>{

	public User process(Cliente cliente) throws Exception {
		User user = new User();
		user.setNombre(cliente.getNombre());
		user.setApellido(cliente.getApellido());
		
		return user;
	}
}


