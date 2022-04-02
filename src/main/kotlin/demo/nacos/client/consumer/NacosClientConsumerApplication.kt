package demo.nacos.client.consumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class NacosClientConsumerApplication

fun main(args: Array<String>) {
    runApplication<NacosClientConsumerApplication>(*args)
}
