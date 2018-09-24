package kali.tech.dao;

import kali.tech.entity.Brand;

public interface BrandDao {

	public void save(Brand br);
	public Brand getById(long id);
}
