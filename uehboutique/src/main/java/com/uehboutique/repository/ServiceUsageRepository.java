package com.uehboutique.repository;

import com.uehboutique.entity.ServiceUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ServiceUsageRepository extends JpaRepository<ServiceUsage, Integer>{
    List<ServiceUsage> findByBooking_BookingId(Integer bookingId);
}
