package org.acme;

import io.quarkus.runtime.StartupEvent;
import org.flywaydb.core.Flyway;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.sql.SQLException;

@ApplicationScoped
public class Migration {

    @Inject
    Flyway flyway;

    void onStart(@Observes StartupEvent event) throws SQLException {
        System.out.println(flyway.info().current().getVersion().toString());
    }


}
