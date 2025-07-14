package com.consentvault.digital_consent_vault.repository;

import com.consentvault.digital_consent_vault.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
