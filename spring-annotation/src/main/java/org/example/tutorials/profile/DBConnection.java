package org.example.tutorials.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

public interface DBConnection {
    void connect();
}

