package com.ap_portfolio_los.tp.Repository;

import com.ap_portfolio_los.tp.Entity.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrabajoRepository extends JpaRepository <Trabajo,Long> {
}