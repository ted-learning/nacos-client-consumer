# nacos-client-consumer

A demo for spring cloud nacos consumer & config

Note: Consumer需要集成新的Spring Cloud Loadbalancer，而非Ribbon，否则无法成功找到Provider
implementation("org.springframework.cloud:spring-cloud-starter-loadbalancer")