package cl.santander.springapirest.services;

import java.util.List;

import cl.santander.springapirest.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void delete(Long id);
}
