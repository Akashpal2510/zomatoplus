package com.thinkxfactor.zomatoplus.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restaurant;

public interface RestaurantRepository extends JpaRepository<Item,Long> {
	List<Item>findAllByRestaurantId(long restaurantId);
	

}
