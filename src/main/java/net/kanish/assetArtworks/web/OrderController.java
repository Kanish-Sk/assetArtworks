package net.kanish.assetArtworks.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import net.kanish.assetArtworks.model.Order;
import net.kanish.assetArtworks.service.Image2Service;
import net.kanish.assetArtworks.service.OrderService;
import net.kanish.assetArtworks.web.dto.AllOrdersDto;
import net.kanish.assetArtworks.web.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.kanish.assetArtworks.model.Image2;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private Image2Service image2Service;

	
	//finalized all orders
		@GetMapping("/allOrders")
		public  ModelAndView allOrders()
		{
			ModelAndView mv = new ModelAndView("allOrders");			
			List<AllOrdersDto> orders = orderService.viewAllOrders();
			mv.addObject("orderList", orders);
			return mv;
		}
	
	//for the users to see their own orders
	@GetMapping("/userOrders")
	public ModelAndView userOrders()
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        
		ModelAndView mv = new ModelAndView("userOrders");				
		List<Order> orders = orderService.viewAllByUser(email);
		mv.addObject("orderList", orders);
		return mv;
	}
	
	//for the users to custom-order
	@GetMapping("/order")
    public ModelAndView orderForm(){
        return new ModelAndView("order");							
    }
	
	
	@PostMapping("/order")
	public String order(@RequestParam("title") String title,@RequestParam("about") String about,
			@RequestParam("phno") String phno,@RequestParam("address") String address)throws IOException, SerialException, SQLException
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        
		OrderDto orderDto =new OrderDto();
		orderDto.setAbout(about);
		orderDto.setAddress(address);
		orderDto.setImageId(0);
		orderDto.setPhno(phno);
		orderDto.setPrice("700");
		orderDto.setStatus("Ordered-waiting for confirmation");
		orderDto.setTitle(title);
		orderDto.setType("Custom Order");
		orderDto.setUserEmail(email);	
		orderService.saveOrder(orderDto);
		
		 return "redirect:/userOrders";
	}
	
	
	
	
	
	//for the users to buy sale product
		@GetMapping("/buy")
	    public ModelAndView buyForm(@RequestParam("id") long id)
		{
			ModelAndView mv =new ModelAndView("buy");	
			Image2 image2=image2Service.viewById(id);
			mv.addObject("image2", image2);
	        return mv;						
	    }
		
		

	@PostMapping("/buy")
	public String buy(@RequestParam("id") long id,@RequestParam("phno") String phno,@RequestParam("address") String address)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        
		Image2 image2=image2Service.viewById(id);
		
		OrderDto orderDto =new OrderDto();
		orderDto.setAbout(image2.getAbout());
		orderDto.setAddress(address);
		orderDto.setImageId(id);
		orderDto.setPhno(phno);
		orderDto.setPrice(image2.getPrice());
		orderDto.setStatus("Ordered-waiting for confirmation");
		orderDto.setTitle(image2.getTitle());
		orderDto.setType("Sale product: "+id);
		orderDto.setUserEmail(email);	
		orderService.saveOrder(orderDto);
		
		
		return "redirect:/userOrders";
	}
	
	@GetMapping("/setstatus")
	public ModelAndView statusUpdate(@RequestParam("id") long id)
	{
		ModelAndView mv =new ModelAndView("statusUpdate");
		Long id1=id;
		mv.addObject("id",id1);
		return mv;			
	}
	
	@PostMapping("/setstatus")
	public String updateStatus(@RequestParam("id") long id,@RequestParam("status") String status)
	{
		orderService.statusUpdate(id, status);
		return "redirect:/allOrders?updated";
		
	}
	

}
