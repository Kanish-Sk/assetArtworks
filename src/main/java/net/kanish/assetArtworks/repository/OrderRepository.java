package net.kanish.assetArtworks.repository;


import java.util.List;

import net.kanish.assetArtworks.model.Order;
import net.kanish.assetArtworks.model.User;
import net.kanish.assetArtworks.web.dto.AllOrdersDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findByU(User u);

	@Query("SELECT new net.kanish.assetArtworks.web.dto.AllOrdersDto(o.id , o.date , o.imageId , o.type , o.title , o.about , o.phno , "
			+ "o.address , o.status , o.price , u.id , u.name , u.email) FROM Order o JOIN o.u u ORDER BY o.date DESC")
	List<AllOrdersDto> findAllOrders();
	
	
}
