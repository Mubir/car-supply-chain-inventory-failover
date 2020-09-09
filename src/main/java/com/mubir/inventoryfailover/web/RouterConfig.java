package com.mubir.inventoryfailover.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.http.MediaType;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterConfig {
    @Bean
    public RouterFunction inventoryRoute(InventoryHandler inventoryHandler)
    {
        return route(GET("/invetory-failover").and(accept(MediaType.APPLICATION_JSON)),
                inventoryHandler::listInvntory);
    }
}
