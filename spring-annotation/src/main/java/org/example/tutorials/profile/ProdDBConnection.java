package org.example.tutorials.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod") // Yalnız "prod" profili aktiv olanda bu Bean yaradılacaq
public class ProdDBConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("Prod mühiti: PostgreSQL (canlı) bazasına qoşuldu.");
    }
}
