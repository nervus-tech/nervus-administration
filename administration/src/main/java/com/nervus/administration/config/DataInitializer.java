package com.nervus.administration.config;

import com.nervus.administration.model.Admin;
import com.nervus.administration.repository.AdminRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final AdminRepository adminRepository;

    public DataInitializer(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Check if data already exists to avoid duplication
        if (adminRepository.count() == 0) {
            // Seed sample admins
            Admin admin1 = new Admin("Alice Johnson", "alice@admin.com");
            Admin admin2 = new Admin("Bob Wilson", "bob@admin.com");
            adminRepository.save(admin1);
            adminRepository.save(admin2);
            System.out.println("Seeded 2 admins into administration service");
        } else {
            System.out.println("Admins already seeded, skipping...");
        }
    }
}