package com.equiperocket.concliciador.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equiperocket.concliciador.model.Guia;
@Repository
@Transactional
public interface GuiaPersistence extends JpaRepository<Guia, Long>{

}
