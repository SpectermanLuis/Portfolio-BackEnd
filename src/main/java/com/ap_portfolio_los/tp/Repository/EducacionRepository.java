package com.ap_portfolio_los.tp.Repository;

import com.ap_portfolio_los.tp.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion,Long> {
}