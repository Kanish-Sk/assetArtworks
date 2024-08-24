package net.kanish.assetArtworks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.kanish.assetArtworks.model.Order;
import net.kanish.assetArtworks.model.User;
import net.kanish.assetArtworks.repository.OrderRepository;
import net.kanish.assetArtworks.repository.UserRepository;
import net.kanish.assetArtworks.web.dto.AllOrdersDto;
import net.kanish.assetArtworks.web.dto.OrderDto;


@Service
public class OrderServiceImpl implements OrderService {
	
	
	private OrderRepository orderRepo;
	private UserRepository userRepo;
	

	public OrderServiceImpl(OrderRepository orderRepo, UserRepository userRepo) {
		super();
		this.orderRepo = orderRepo;
		this.userRepo = userRepo;
	}
	

	@Override
	public void saveOrder(OrderDto orderDto) {
		
		Order order = new Order();
		
		order.setAbout(orderDto.getAbout());
		order.setAddress(orderDto.getAddress());
		order.setImageId(orderDto.getImageId());
		order.setPhno(orderDto.getPhno());
		order.setStatus(orderDto.getStatus());
		order.setTitle(orderDto.getTitle());
		order.setType(orderDto.getType());
		order.setPrice(orderDto.getPrice());
		//finding the user
		User user = userRepo.findByEmail(orderDto.getUserEmail());
		order.setU(user);
		
		//saving the user to the table
		orderRepo.save(order);	
	}

	@Override
	public List<AllOrdersDto> viewAllOrders() {
		return orderRepo.findAllOrders();
	}


	@Override
	public List<Order> viewAllByUser(String email) {
		
		User u = userRepo.findByEmail(email);
		return orderRepo.findByU(u);
	}


	@Override
	public void statusUpdate(Long id, String status) {
		// TODO Auto-generated method stub
		//Optional<Order> order=orderRepo.findById(id);
		Order or=orderRepo.getById(id);
		 System.out.println(or.getStatus());
		or.setStatus(status);
		System.out.println(or.getStatus());
		orderRepo.save(or);	
	}


	

}
