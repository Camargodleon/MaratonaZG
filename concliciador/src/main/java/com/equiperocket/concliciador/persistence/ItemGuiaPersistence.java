package com.equiperocket.concliciador.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.equiperocket.concliciador.model.ItemGuia;

@Repository
public interface ItemGuiaPersistence extends JpaRepository<ItemGuia, Long>{
	@Query("SELECT a FROM item_guia a WHERE a.guia_id = ?1")
	public ItemGuia findByGuiaId(Long id);

}
