package demo.nacos.client.consumer.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
@RefreshScope
class RestConfig {
    @Value("\${provider-name:name}")
    private lateinit var providerName: String

    @LoadBalanced
    @Bean
    fun restWithLoadBalanced(): RestTemplate {
        return RestTemplateBuilder()
            .rootUri("http://$providerName")
            .build()
    }
}