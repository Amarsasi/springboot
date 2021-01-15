package com.cts.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.mysql.dao.TicketDao;
import com.cts.mysql.model.Ticket;

@RestController
public class TicketController {
	@Autowired
	private TicketDao dao;
	
	
	@PostMapping("/bookTicket")
	public String bookTicket(@RequestBody Ticket tickets) {
		dao.save(tickets);
		return "Ticket booked:";
	}
	
	@GetMapping("/getTicket")
	public List<Ticket> getTicket(){
		return (List<Ticket>) dao.findAll();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteTickets(@PathVariable("id") int id) {
		System.out.println("delete  "+id);
		Ticket ob = new Ticket();
		ob.setId(id);
		dao.delete(ob);
		return "deleted";
	}
	
	@PutMapping("/update/{id}")
	public String updateTickets(@PathVariable(value = "id") int employeeId,@RequestBody Ticket tickets) {
		
		
		tickets.setId(employeeId);
		dao.save(tickets);
		return "updated";
	}
	
	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		dao.saveAll(tickets);
		return "Ticket booked: " + tickets.size();
	}
	
	@GetMapping("/getTickets")
	public List<Ticket> getTickets(){
		return (List<Ticket>) dao.findAll();
	}

}
