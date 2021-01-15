package com.cts.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.mysql.model.Ticket;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer>{

}
