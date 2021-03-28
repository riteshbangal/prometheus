package com.rcb.micrometer.config;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.spring.autoconfigure.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MicrometerConfiguration {

    @Bean
    MeterRegistryCustomizer meterRegistryCustomizer(MeterRegistry pMeterRegistry) {
        return meterRegistry -> pMeterRegistry.config()
                .commonTags("application", "micrometer-prometheus");
    }
}
