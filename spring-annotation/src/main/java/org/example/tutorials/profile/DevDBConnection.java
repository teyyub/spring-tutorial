package org.example.tutorials.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev") // Yalnız "dev" profili aktiv olanda bu Bean yaradılacaq
public class DevDBConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("Dev mühiti: H2 (yaddaş daxili) bazasına qoşuldu.");
    }
}


