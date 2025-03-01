package org.example.princess_group.domain.auth.repository;

import java.util.List;
import org.example.princess_group.domain.auth.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, Long> {

    List<Auth> findAllByUserId(Long userId);
}
