package com.shop.repository;
import com.shop.entity.ItemImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ItemImgRepository extends JpaRepository<ItemImg,Long> {

}
